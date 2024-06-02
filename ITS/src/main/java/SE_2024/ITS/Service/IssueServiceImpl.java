package SE_2024.ITS.Service;

import SE_2024.ITS.dto.IssueDto;
import SE_2024.ITS.entity.Issue;
import SE_2024.ITS.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IssueServiceImpl implements IssueService{
    @Autowired
    private IssueRepository issueRepository;
    public IssueServiceImpl(IssueRepository issueRepository){
        this.issueRepository = issueRepository;
    }
    @Override
    public void saveIssue(IssueDto dto){
        issueRepository.save(dto.toEntity());
    }
    @Override
    public List<Issue> findIssue(){
        return issueRepository.findAll();
    }
//    @Override
//    public Optional<Issue> findByTitle(String title){
//        return issueRepository.findByTitle(title);
//    }
    @Override
    public Optional<Issue> findById(Long id){
        return issueRepository.findById(id);
    }
//    @Override
//    public Optional<Issue> findByAssignee(String assignee){
//        return issueRepository.findByAssignee(assignee);
//    }
//    @Override
//    public Optional<Issue> findByStatus(String status){
//        return issueRepository.findByStatus(status);
//    }
//    @Override
//    public void updateStatus(IssueDto dto, String status) {
//        dto.setStatus(status);
//    }
//
//    @Override
//    public void regComment(IssueDto dto, String comment) {
//    }
}
