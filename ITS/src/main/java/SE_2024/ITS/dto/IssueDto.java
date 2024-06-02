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
    private Long issueId;
    private String projectName; //프론트(이슈 생성 페이지) 입력 필요
    private String title; //프론트(이슈 생성 페이지) 입력 필요
    private LocalDate reportedDate;
    private String reporter;
    private LocalDate fixedDate;
    private String fixer;
    private boolean assigned;
    private String assignee;
    private String description; //프론트(이슈 생성 페이지) 입력 필요
    private List<String> comment;
    private String status;
    private int priority; //프론트(이슈 생성 페이지) 입력 필요

    public Issue toEntity(){
        return Issue.builder()
                .title(title)
                .reporter(reporter)
                .description(description)
                .reportedDate(reportedDate)
                .build();

    }
}