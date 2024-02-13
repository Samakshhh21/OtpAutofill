//package com.example.grayopus.otpautofill.Controller;
//
//import com.example.grayopus.otpautofill.Model.User;
//import com.example.grayopus.otpautofill.Service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("api/v1")
//public class UserController {
//    @Autowired
//    private final UserService userService;
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @PostMapping("/fetchotp")
//    public String fetchotp(String phn) {
//        return userService.FetchOtp(phn);
//    }
//    @PostMapping("/checkotp")
//    public String checkotp(String otp,User user) {
//        return userService.CheckOtp(otp,user);
//    }
//
//    @GetMapping("/users")
//    public List<User> getall() {
//        return userService.GetUsers();
//    }
//
//}
//
//
//
