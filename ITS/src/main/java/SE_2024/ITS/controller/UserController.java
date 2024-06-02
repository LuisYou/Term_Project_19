package SE_2024.ITS.controller;

import SE_2024.ITS.Service.UserService;
import SE_2024.ITS.dto.UserDto;
import SE_2024.ITS.entity.Project;
import SE_2024.ITS.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping("/userCreate")
    public String createUser(UserDto userDto){
        userService.saveUser(userDto);
        return "user/userCreate";
    }
    @GetMapping("/userList")
    public String UserList(Model model){
        model.addAttribute("userList", userService.findUser());
        return "user/userList";
    }
    @RequestMapping("/userInfo")
    public ModelAndView view(@RequestParam Long userId){
        Optional<User> user = userService.findById(userId);
        return new ModelAndView("user/info","user", user);
    }
}
