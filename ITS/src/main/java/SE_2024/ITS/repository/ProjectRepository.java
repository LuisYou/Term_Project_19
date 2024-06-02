package SE_2024.ITS.repository;

import SE_2024.ITS.dto.ProjectDto;
import SE_2024.ITS.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjectRepository {
    void saveProject(Project project);
    List<Project> findAll();
    Optional<Project> findById(int id);
    Optional<Project> findByTitle(String title);

}
