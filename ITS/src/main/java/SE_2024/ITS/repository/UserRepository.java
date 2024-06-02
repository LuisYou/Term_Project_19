package SE_2024.ITS.repository;

import SE_2024.ITS.dto.UserDto;
import SE_2024.ITS.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
//    void saveUser(User user);
//    List<User> findAll();
//    Optional<User> findById(int userId);
//    Optional<User> findByName(String name);
//    Optional<User> findByRole(String role);
}
