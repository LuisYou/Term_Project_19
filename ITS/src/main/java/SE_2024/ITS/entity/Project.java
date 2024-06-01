package SE_2024.ITS.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Project {
    @Id
    @GeneratedValue
    private int projectId;
    private String projectName;
    private LocalDate createdDate;
    private LocalDate expiredDate;
    private List<Issue> issue;
}
