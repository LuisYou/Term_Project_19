package SE_2024.ITS.controller;

import SE_2024.ITS.Service.IssueServiceImpl;
import SE_2024.ITS.dto.CommentDto;
import SE_2024.ITS.dto.IssueDto;
import SE_2024.ITS.entity.Issue;
import SE_2024.ITS.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class IssueController {
    private IssueServiceImpl issueService;
    public IssueController(IssueServiceImpl issueService){
        this.issueService = issueService;
    }

    @GetMapping("/issueCreate")
    public String createIssuePage(){
        return "issue/issuecreate";
    }
    @PostMapping("/createOk")
    public String createIssue(IssueDto issueDto){
        issueService.saveIssue(issueDto);
        return "redirect:/issuecreate";
    }
    @GetMapping("/issueList")
    public String issueList(Model model){
        model.addAttribute("issueList", issueService.findIssue());
        return "issue/issueList";
    }
    @RequestMapping("/issueInfo")
    public ModelAndView view(@RequestParam int issueId){
        Optional<Issue> issue = issueService.findById(issueId);
        return new ModelAndView("issue/info","issue", issue);
    }
    @RequestMapping("/comment")
    public String comment(){
        return "issue/comment";
    }
    @RequestMapping("/commentOk")
    public String commentOk(@ModelAttribute IssueDto issueDto){
        issueService.regComment(issueDto);
        return "redirect:/issue/issueList";
    }

}
