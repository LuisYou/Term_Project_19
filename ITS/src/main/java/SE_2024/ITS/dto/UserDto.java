package SE_2024.ITS.dto;

import SE_2024.ITS.entity.User;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long UserId;
    private Long password; //프론트(계정 생성 페이지) 입력 필요
    private LocalDate createdDate;
    private String name; //프론트(계정 생성 페이지) 입력 필요
    private LocalDate birth; //프론트(계정 생성 페이지) 입력 필요
    private String eMail; //프론트(계정 생성 페이지) 입력 필요
    private String address; //프론트(계정 생성 페이지) 입력 필요
    private String role;
    public User toEntity(){
        User build = User.builder()
                .name(name)
                .password(password)
                .birth(birth)
                .address(address)
                .eMail(eMail)
                .build();
        return build;
    }
}
