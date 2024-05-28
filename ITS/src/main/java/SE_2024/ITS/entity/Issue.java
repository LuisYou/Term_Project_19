package SE_2024.ITS.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String project;
    private String title;
    @CreationTimestamp
    private LocalDate reportedDate;
    private String reporter;
    @UpdateTimestamp
    private LocalDate fixedDate;
    private String fixer;
    private boolean assigned;
    private String assignee;
    private List<String> comments;
    private String status;
    private int priority;
    public Issue(int id, String project, String title, LocalDate reportedDate, String reporter, String status, int priority){
        this.id = id;
        this.project = project;
        this.title = title;
        this.reportedDate = reportedDate;
        this.reporter = reporter;
        this.status = status;
        this.priority = priority;
    }

}
