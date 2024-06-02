package SE_2024.ITS.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDate;
@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue
    private Long Userid;
    @Column(nullable = false)
    private Long password;
    @CreationTimestamp
    @Column(nullable = false)
    private LocalDate createdDate;
    @Column(nullable = false)
    private String name;
    @Column
    private LocalDate birth;
    @Column
    private String eMail;
    @Column
    private String address;
    private String role;
}
