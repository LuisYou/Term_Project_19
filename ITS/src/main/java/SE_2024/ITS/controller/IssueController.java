package SE_2024.ITS.controller;

import SE_2024.ITS.Service.IssueServiceImpl;
import SE_2024.ITS.dto.IssueDto;
import SE_2024.ITS.entity.Issue;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
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
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUsername = authentication.getName();
        issueDto.setReporter(currentUsername);
        issueService.saveIssue(issueDto);
        System.out.println("============================SAVE ISSUE=================================");
        return "redirect:/issueCreate";
    }
    @GetMapping("/issueSearch")
    public String getSelectPage(){
        return "issue/issuesearch";
    }
    @PostMapping("/issueList")
    public String issueList(Model model){
        model.addAttribute("issueList", issueService.findAll());
        System.out.println("=======================findAll====================");
        return "issue/issuelist";
    }
    @GetMapping("issueInfo/{id}") //localhost:8080/issueInfo?id=1
    public String issueInfo(@PathVariable Long id, Model model){
        model.addAttribute("issueInfo", issueService.findById(id));
        return "issue/issueinfo";
    }

    @GetMapping("/admin/issueCreate")
    @PreAuthorize("hasRole('Tester')")
    public String createIssuePage(Model model) {
        // 이슈 생성 페이지 로직
        return "issue/issuecreate";
    }
    @ExceptionHandler(AccessDeniedException.class)
    public ModelAndView handleAccessDeniedException(AccessDeniedException ex) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error/access-denied");
        modelAndView.addObject("error", ex.getMessage());
        return modelAndView;
    }
//    @GetMapping("issueInfo/{id}")
//    public String issueSearchById(@PathVariable Long id, Model model){
//        model.addAttribute("issueInfo", issueService.findById(id));
//        return "issueinfo";
//    }





//    @PostMapping("/issue/{no}")
//    public String issueSearch(@PathVariable int no){
//        String view = null;
//        switch(no){
//            case 1:
//                view = "issue/issueSearchAll";
//                break;
//            case 2:
//                view = "issue/issueSarchKeyword";
//                break;
//        }
//        return view;
//    }
    @GetMapping("/assign/{id}")
    public String updateForm(@PathVariable Long id, Model model){
        model.addAttribute("assign", issueService.findById(id));
        return "assign";
    }





//    @PostMapping("/issueSearchOk")
//    public String issueSearchOk(Model model, String keyWord){
//        if(keyWord == null){
//            List<Issue> list = issueService.findAllIssue();
//        } else {
//            Optional<Issue> list = issueService.findByTitle(keyWord);
//        }
//        model.addAttribute("issueList", list);
//        return "issue/issuelist";
//    }

//    @PostMapping("/issueInfoId")
//    public ModelAndView view(@RequestParam Long issueId){
//        Optional<Issue> issue = issueService.findById(issueId);
//        return new ModelAndView("issue/issuelist","issueList", issue);
//    }
//    @PostMapping("/issueInfoTitle")
//    public ModelAndView view(@RequestParam String title){
//        Optional<Issue> issue = issueService.findByTitle(title);
//        System.out.println("===================findByTitle========================");
//        return new ModelAndView("issue/issuelist","issueList", issue);
//    }
    @RequestMapping("/comment")
    public String comment(){
        return "issue/comment";
    }
//    @RequestMapping("/commentOk")
//    public String commentOk(@ModelAttribute IssueDto issueDto, String comment){
//        issueService.regComment(issueDto, comment);
//        return "redirect:/issue/issueList";
//    }

}
