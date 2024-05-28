package SE_2024.ITS.repository;

import SE_2024.ITS.entity.Issue;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepository {
    void save(Issue issue);
    Issue findById(int id);
    Issue findByTitle(String title);
    Issue findByAssignee(String assignee);
    Issue findByStatus(String status);
}
