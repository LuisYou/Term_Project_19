package SE_2024.ITS.repository;

import SE_2024.ITS.dto.ProjectDto;
import SE_2024.ITS.entity.Project;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjectRepository {
    void saveProject(ProjectDto dto);
    List<Project> findAll();
    Optional<Project> findById(int id);
    Optional<Project> findByTitle(String title);

}
