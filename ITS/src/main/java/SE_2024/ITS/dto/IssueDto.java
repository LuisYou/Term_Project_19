package SE_2024.ITS.dto;

import SE_2024.ITS.entity.Issue;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IssueDto {
    private Long id;
    private String title; //프론트(이슈 생성 페이지) 입력 필요
    private LocalDate reportedDate;
    private String reporter; //프론트(이슈 생성 페이지) 입력 필요
    private LocalDate fixedDate;
    private String fixer;
    private boolean assigned;
    private String assignee;
    private String description; //프론트(이슈 생성 페이지) 입력 필요
    private List<String> comment;
    private String status = "new";
    private String priority; //프론트(이슈 생성 페이지) 입력 필요
    public Issue toEntity(){
        return Issue.builder()
                .title(title)
                .reporter(reporter)
                .description(description)
                .status(status)
                .priority(priority)
                .build();
    }
//    public Issue toUpdateEntity(){
//        return Issue.builder()
//                .id(IssueDto.getId());
//    }
}