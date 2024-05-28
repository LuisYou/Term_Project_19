package SE_2024.ITS.Service;

import SE_2024.ITS.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService{
    @Autowired
    ProjectRepository projectRepository;
}
