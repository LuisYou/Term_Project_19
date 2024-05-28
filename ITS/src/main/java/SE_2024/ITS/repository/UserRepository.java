package SE_2024.ITS.repository;

import SE_2024.ITS.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    void save(User user);
    User findById(int id);
    User findByName(String name);
    User findByRole(String role);
}
