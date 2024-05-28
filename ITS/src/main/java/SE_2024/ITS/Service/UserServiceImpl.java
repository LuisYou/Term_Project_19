package SE_2024.ITS.Service;

import SE_2024.ITS.dto.UserDto;
import SE_2024.ITS.entity.User;
import SE_2024.ITS.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public void saveUser(UserDto dto) {

    }
    @Override
    public List<User> findUser() {
        return userRepository.findAll();
    }
    @Override
    public Optional<User> findById(int id) {
        return userRepository.findById(id);
    }
    @Override
    public Optional<User> findByName(String name) {
        return userRepository.findByName(name);
    }
    @Override
    public Optional<User> findByRole(String role) {
        return userRepository.findByRole(role);
    }
    @Override
    public User dtoToEntity(UserDto dto) {
        return UserService.super.dtoToEntity(dto);
    }
}
