package SE_2024.ITS.dto;

import SE_2024.ITS.entity.Project;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectDto {

    private Long projectId;
    private String projectName; //프론트(프로젝트 생성 페이지) 입력 필요
    private LocalDate createdDate;
    private LocalDate expiredDate;
    public Project toEntity(){
        Project build = Project.builder()
                .projectName(projectName)
                .build();
        return build;
    }
    /*@Builder
    public ProjectDto(Long projectId, String projectName, LocalDate createdDate, LocalDate expiredDate){
        this.projectId = projectId;
        this.projectName = projectName;
        this.createdDate = createdDate;
        this.expiredDate = expiredDate;
    } AllArgsConstructor 달았으므로 생성자 필요 없음 */
}
