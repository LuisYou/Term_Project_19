package SE_2024.ITS.repository;

import SE_2024.ITS.dto.IssueDto;
import SE_2024.ITS.dto.ProjectDto;
import SE_2024.ITS.entity.Issue;
import SE_2024.ITS.entity.Project;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class ProjectRepositoryImpl implements ProjectRepository{
    private EntityManager em;
    public ProjectRepositoryImpl(EntityManager em){
        this.em = em;
    }
    @Override
    public void saveProject(ProjectDto projectDto) {
        em.persist(projectDto);
    }
    @Override
    public List<Project> findAll() {
        List<Project> result = em.createQuery("select i from Issue i", Project.class)
                .getResultList();
        return result;
    }
    @Override
    public Optional<Project> findById(int id) {
        Project project= em.find(Project.class, id);
        return Optional.ofNullable(project);
    }
    @Override
    public Optional<Project> findByTitle(String title) {
        List<Project> result = em.createQuery("select i from Project i where i.title = :title", Project.class)
                .setParameter("title", title).getResultList();
        return result.stream().findAny();
    }
}
