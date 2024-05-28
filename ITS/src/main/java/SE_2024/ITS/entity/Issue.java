package SE_2024.ITS.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Issue {
    @Id
    private int id;
    private String title;
    private LocalDate reportedDate;
    private String reporter;
    private LocalDate fixedDate;
    private String fixer;
    private boolean assigned;
    private String assignee;
    private List<String> comments;
    private String status;
    private int priority;
}
