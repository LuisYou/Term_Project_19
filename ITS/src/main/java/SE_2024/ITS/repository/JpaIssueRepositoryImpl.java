package SE_2024.ITS.repository;

import SE_2024.ITS.dto.IssueDto;
import SE_2024.ITS.entity.Issue;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class JpaIssueRepositoryImpl implements IssueRepository{
    private EntityManager em;
    public JpaIssueRepositoryImpl(EntityManager em){
        this.em = em;
    }
    @Override
    public void saveIssue(IssueDto issueDto) {
        em.persist(issueDto);
    }
    @Override
    public List<Issue> findAll() {
        List<Issue> result = em.createQuery("select i from Issue i", Issue.class)
                .getResultList();
        return result;
    }
    @Override
    public Optional<Issue> findById(int id) {
        Issue issue = em.find(Issue.class, id);
        return Optional.ofNullable(issue);
    }
    @Override
    public Optional<Issue> findByTitle(String title) {
        List<Issue> result = em.createQuery("select i from Issue i where i.title = :title", Issue.class)
                .setParameter("title", title).getResultList();
        return result.stream().findAny();
    }
    @Override
    public Optional<Issue> findByAssignee(String assignee) {
        List<Issue> result = em.createQuery("select i from Issue i where i.assignee = :assignee", Issue.class)
                .setParameter("assignee", assignee).getResultList();
        return result.stream().findAny();
    }
    @Override
    public Optional<Issue> findByStatus(String status) {
        List<Issue> result = em.createQuery("select i from Issue i where i.status = :status", Issue.class)
                .setParameter("status", status).getResultList();
        return result.stream().findAny();
    }
}
