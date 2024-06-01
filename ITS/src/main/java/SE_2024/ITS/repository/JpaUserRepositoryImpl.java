package SE_2024.ITS.repository;

import SE_2024.ITS.dto.UserDto;
import SE_2024.ITS.entity.Issue;
import SE_2024.ITS.entity.User;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class JpaUserRepositoryImpl implements UserRepository {
    private EntityManager em;
    public JpaUserRepositoryImpl(EntityManager em){
        this.em = em;
    }
    @Override
    public void saveUser(User user) {
        em.persist(user);
    }
    @Override
    public List<User> findAll() {
        List<User> result = em.createQuery("select i from Issue i", User.class)
                .getResultList();
        return result;
    }
    @Override
    public Optional<User> findById(int id) {
        return Optional.empty();
    }
    @Override
    public Optional<User> findByName(String name) {
        List<User> result = em.createQuery("select i from Issue i where i.name = :name", User.class)
                .setParameter("name", name).getResultList();
        return result.stream().findAny();
    }
    @Override
    public Optional<User> findByRole(String role) {
        List<User> result = em.createQuery("select i from Issue i where i.role = :role", User.class)
                .setParameter("role", role).getResultList();
        return result.stream().findAny();
    }
}
