package SE_2024.ITS.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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

    private String description;
    private List<String> comments;
    private String status;
    private int priority;
    public Issue(int id, String project, String title, LocalDate reportedDate,
                 String reporter, String status, int priority, String description){
        this.id = id;
        this.project = project;
        this.title = title;
        this.reportedDate = reportedDate;
        this.reporter = reporter;
        this.status = status;
        this.description = description;
        this.priority = priority;
    }

}
