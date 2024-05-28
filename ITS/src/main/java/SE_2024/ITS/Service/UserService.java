package SE_2024.ITS.Service;

import SE_2024.ITS.dto.UserDto;
import SE_2024.ITS.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public void saveUser(UserDto dto);
    public List<User> findUser();
    public Optional<User> findById(int id);
    public Optional<User> findByName(String name);
    public Optional<User> findByRole(String role);

    default User dtoToEntity(UserDto dto){
        User entity = User.builder()
                .Userid(dto.getUserId())
                .password(dto.getPassword())
                .name(dto.getName())
                .role(dto.getRole())
                .build();
        return entity;
    }
}
