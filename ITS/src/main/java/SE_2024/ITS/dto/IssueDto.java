package SE_2024.ITS.dto;

import SE_2024.ITS.entity.Issue;
import lombok.Builder;

import java.time.LocalDate;
import java.util.List;


public class IssueDto {
    private int issueId;
    private String projectName; //프론트(이슈 생성 페이지) 입력 필요
    private String title; //프론트(이슈 생성 페이지) 입력 필요
    private LocalDate reportedDate;
    private String reporter;
    private LocalDate fixedDate;
    private String fixer;
    private boolean assigned;
    private String assignee;
    private String description; //프론트(이슈 생성 페이지) 입력 필요
    private List<String> comments;
    private String status;
    private int priority; //프론트(이슈 생성 페이지) 입력 필요

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
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
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
    @Builder
    public class IssueSaveRequestDto{
        private String title;
        private String projectName;
        private String reporter;
        private String description;
        private LocalDate reportedDate;
        public IssueSaveRequestDto(String title, String projectName, String reporter, String description,
                                        LocalDate reportedDate){
            this.title = title;
            this.projectName = projectName;
            this.reporter = reporter;
            this.description = description;
            this.reportedDate = reportedDate;
        }
        public Issue toEntity(){
            return Issue.builder()
                    .title(title)
                    .projectName(projectName)
                    .reporter(reporter)
                    .description(description)
                    .reportedDate(reportedDate)
                    .build();

        }
        public IssueSaveRequestDto toDto(Issue issue){
            return IssueSaveRequestDto.builder()
                    .title(issue.getTitle())
                    .projectName(issue.getProjectName())
                    .reporter(issue.getReporter())
                    .description(issue.getDescription())
                    .reportedDate(issue.getReportedDate())
                    .build();
        }
    }
}