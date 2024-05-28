package SE_2024.ITS.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    private int projectId;
    private String projectName;
    private LocalDate createdDate;
    private LocalDate expiredDate;
}
