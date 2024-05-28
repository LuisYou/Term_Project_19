package SE_2024.ITS.Service;

import SE_2024.ITS.dto.IssueDto;
import SE_2024.ITS.dto.ProjectDto;
import SE_2024.ITS.entity.Issue;
import SE_2024.ITS.entity.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectService {
    public void saveProject(ProjectDto dto);
    public List<Project> findProject();

    public Optional<Project> findByTitle(String Title);

    public Optional<Project> findById(int id);
}
