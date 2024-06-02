package SE_2024.ITS.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Project {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String projectName;
    @CreatedDate
    @Column(updatable = false)
    private LocalDate createdDate;
    @LastModifiedDate
    @Column
    private LocalDate expiredDate;
    @Builder
    public Project(String projectName){
        this.projectName = projectName;
    }
}
