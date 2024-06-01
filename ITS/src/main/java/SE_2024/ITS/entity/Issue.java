package SE_2024.ITS.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int issueId;
    private String projectName;
    private String title;
    @CreationTimestamp
    private LocalDate reportedDate;
    private String reporter;
    @UpdateTimestamp
    private LocalDate fixedDate;
    private String fixer;
    private boolean assigned;
    private String assignee;
    private String description;
    private Status status;
    private enum Priority {
        NORMAL, EMERGENCY
    }
    public Issue(int issueId, String project, String title, LocalDate reportedDate,
                 String reporter, String description){
        this.issueId = issueId;
        this.projectName = project;
        this.title = title;
        this.reportedDate = reportedDate;
        this.reporter = reporter;
        status = Status.NEW; //생성시 기본값으로 NEW 설정
        this.description = description;
    }
}
