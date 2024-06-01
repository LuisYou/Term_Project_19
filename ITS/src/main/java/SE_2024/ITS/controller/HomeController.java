package SE_2024.ITS.controller;

import SE_2024.ITS.Service.IssueService;
import SE_2024.ITS.Service.ProjectService;
import SE_2024.ITS.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("index")
public class HomeController {
    @GetMapping("home")
    public String indexView(){
        return "index";
    }
    private UserService userService;
    private IssueService issueService;
    private ProjectService projectService;
    @Autowired
    public String HomeController(UserService userService, IssueService issueService, ProjectService projectService) {
        this.userService = userService;
        this.issueService = issueService;
        this.projectService = projectService;
        return "index";
    }
}