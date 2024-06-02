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
    private Long id;
    @Column(nullable = false)
    private String title;
    @CreationTimestamp
    @Column(nullable = false)
    private LocalDate reportedDate;
    @Column(nullable = false)
    private String reporter;
    @UpdateTimestamp
    @Column
    private LocalDate fixedDate;
    @Column
    private String fixer;
    private boolean assigned;
    @Column
    private String assignee;

    @Column
    private List<String> comment;
    @Column
    private String description;
    @Column
    private String status;
    @Column
    private String priority;
    @Builder
    public Issue(String title, String description, String priority){
        this.title = title;
        this.description = description;
        this.priority = priority;
    }
}
