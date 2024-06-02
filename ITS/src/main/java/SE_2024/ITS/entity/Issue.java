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
    @GeneratedValue
    private Long issueId;
    @Column(nullable = false)
    private String title;
    @CreationTimestamp
    @Column(nullable = false)
    private LocalDate reportedDate;
    @Column(nullable = false)
    private String reporter;
    @UpdateTimestamp
    private LocalDate fixedDate;
    private String fixer;
    private boolean assigned;
    private String assignee;

    private List<String> comment;
    private String description;
    private String status;
    private String priority;
    public Issue(Long issueId, String title, LocalDate reportedDate,
                 String reporter, String description){
        this.issueId = issueId;
        this.title = title;
        this.reportedDate = reportedDate;
        this.reporter = reporter;
        this.description = description;
    }
}
