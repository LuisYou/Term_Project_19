package SE_2024.ITS.Service;
import SE_2024.ITS.dto.IssueDto;
import SE_2024.ITS.entity.Issue;
import java.util.List;
import java.util.Optional;

public interface IssueService {
    public void saveIssue(IssueDto dto);
    public List<Issue> findAll();
    public Optional<Issue> findByTitle(String Title);
    public Optional<Issue> findById(Long id);
//    public IssueDto upDate(IssueDto issueDto);

//    public Optional<Issue> findByAssignee(String assignee);
//
//    public Optional<Issue> findByStatus(String status);
//
//    void updateStatus(IssueDto dto, String status);
//
//    public void regComment(IssueDto dto, String comment);
}

