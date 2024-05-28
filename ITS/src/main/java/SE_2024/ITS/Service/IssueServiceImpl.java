package SE_2024.ITS.Service;

import SE_2024.ITS.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IssueServiceImpl implements IssueService{
    @Autowired
    IssueRepository issueRepository;
}
