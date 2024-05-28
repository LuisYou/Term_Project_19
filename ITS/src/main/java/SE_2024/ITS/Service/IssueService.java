package SE_2024.ITS.Service;

import SE_2024.ITS.dto.IssueDto;
import SE_2024.ITS.entity.Issue;
import SE_2024.ITS.repository.IssueRepository;

import java.util.List;
import java.util.Optional;

public interface IssueService {
    public void saveIssue(IssueDto dto);

    public List<Issue> findIssue();

    public Optional<Issue> findByTitle(String Title);

    public Optional<Issue> findById(int id);

    public Optional<Issue> findByAssignee(String assignee);

    public Optional<Issue> findByStatus(String status);

    public void updateStatus(IssueDto dto);

    public void regComment(IssueDto dto);
}

