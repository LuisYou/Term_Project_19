package SE_2024.ITS.dto;

import java.time.LocalDate;
import java.util.List;

public class IssueDto {
    private int issueId;
    private String projectName;
    private String title;
    private LocalDate reportedDate;
    private String reporter;
    private LocalDate fixedDate;
    private String fixer;
    private boolean assigned;
    private String assignee;
    private List<String> comments;
    private String status;
    private int priority;

    public int getId() {
        return issueId;
    }

    public void setId(int issueId) {
        this.issueId = issueId;
    }
    public String getProject(){
        return projectName;
    }
    public void setProjectName(String projectName){
        this.projectName = projectName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReportedDate() {
        return reportedDate;
    }

    public void setReportedDate(LocalDate reportedDate) {
        this.reportedDate = reportedDate;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public LocalDate getFixedDate() {
        return fixedDate;
    }

    public void setFixedDate(LocalDate fixedDate) {
        this.fixedDate = fixedDate;
    }

    public String getFixer() {
        return fixer;
    }

    public void setFixer(String fixer) {
        this.fixer = fixer;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
