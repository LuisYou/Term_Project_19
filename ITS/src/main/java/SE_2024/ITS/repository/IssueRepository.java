package SE_2024.ITS.repository;

import SE_2024.ITS.dto.IssueDto;
import SE_2024.ITS.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Long> {
//    @Query(value = "select * from issue",nativeQuery = true)
    List<Issue> findAll();
//    @Query(value = "select * from issue",nativeQuery = true)
    Optional<Issue> findById(Long id);
//    @Query(value = "select * from issue",nativeQuery = true)
    Optional<Issue> findByTitle(String title);

//    void saveIssue(Issue issue);
//    List<Issue> findAll();
//    Optional<Issue> findById(int id);
//    Optional<Issue> findByTitle(String title);
//    Optional<Issue> findByAssignee(String assignee);
//    Optional<Issue> findByStatus(String status);
}
