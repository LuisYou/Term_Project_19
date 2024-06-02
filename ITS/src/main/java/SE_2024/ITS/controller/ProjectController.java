package SE_2024.ITS.controller;

import SE_2024.ITS.Service.ProjectService;
import SE_2024.ITS.dto.ProjectDto;
import SE_2024.ITS.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class ProjectController {
    ProjectService projectService;
    public ProjectController(ProjectService projectService){
        this.projectService = projectService;
    }
    @GetMapping("/projectCreate")
    public String createProjectPage(){
        return "project/projectcreate";
    }
    @PostMapping("/pcreateOk")
    public String createProject(ProjectDto projectDto){
        projectService.saveProject(projectDto);
        return "redirect:/projectCreate";
    }
//    @GetMapping("/projectList")
//    public String projectList(Model model){
//        List<Project> list = projectService.findProject();
//        model.addAttribute("list", list);
//        return "project/projectList";
//    }
//    @GetMapping("/projectInfo")
//    public ModelAndView view(@RequestParam Long projectId){
//        Optional<Project> project = projectService.findById(projectId);
//        return new ModelAndView("project/projectInfo","project", project);
//    }

}
