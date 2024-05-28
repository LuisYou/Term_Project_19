package SE_2024.ITS.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue
    private int Userid;
    private Long password;
    @CreationTimestamp
    private LocalDate createdDate;

    private String name;
    private LocalDate birth;
    private String eMail;
    private String address;
    private String role;

    public User(int userid, Long password, LocalDate createdDate, String name,
                LocalDate birth, String eMail, String address, String role) {
        Userid = userid;
        this.password = password;
        this.createdDate = createdDate;
        this.name = name;
        this.birth = birth;
        this.eMail = eMail;
        this.address = address;
        this.role = role;
    }
}
