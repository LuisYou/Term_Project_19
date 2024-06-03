package SE_2024.ITS.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class LoginController {
    @GetMapping("/api1")
    public ResponseEntity api(){
        return new ResponseEntity<>("api입니다.", HttpStatus.OK);
    }
    @GetMapping("/api2")
    public ResponseEntity api2(){
        return new ResponseEntity<>("api2입니다.", HttpStatus.OK);
    }
    @GetMapping("/api3")
    public ResponseEntity api3(){
        return new ResponseEntity<>("api3입니다.", HttpStatus.OK);
    }
    @GetMapping("/user")
    public ResponseEntity user(@AuthenticationPrincipal UserDetails userDetails){
        return new ResponseEntity<>(userDetails.getUsername(), HttpStatus.OK);
    }
}
