package SE_2024.ITS.Service;

import SE_2024.ITS.dto.ProjectDto;
import SE_2024.ITS.entity.Project;
import SE_2024.ITS.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService{
    @Autowired
    ProjectRepository projectRepository;
    public ProjectServiceImpl(ProjectRepository projectRepository){
        this.projectRepository = projectRepository;
    }

    @Override
    public void saveProject(ProjectDto dto) {
        projectRepository.saveProject(dto);
    }
    @Override
    public List<Project> findProject() {
        return projectRepository.findAll();
    }

    @Override
    public Optional<Project> findByTitle(String title) {
        return projectRepository.findByTitle(title);
    }

    @Override
    public Optional<Project> findById(int id) {
        return projectRepository.findById(id);
    }
}
