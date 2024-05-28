package SE_2024.ITS.repository;

import SE_2024.ITS.entity.Project;
import org.springframework.stereotype.Repository;

@Repository

public interface ProjectRepository {
    void save(Project project);
    Project findById(int id);
    Project findByTitle(String title);

}
