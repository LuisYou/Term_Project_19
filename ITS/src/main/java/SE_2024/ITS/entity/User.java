package SE_2024.ITS.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private int Userid;
    private Long password;
    private LocalDate createdDate;

    private String name;
    private LocalDate birth;
    private String eMail;
    private String address;
    private String role;

}
