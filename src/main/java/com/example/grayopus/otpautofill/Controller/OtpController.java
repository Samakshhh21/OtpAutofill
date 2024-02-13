package com.example.grayopus.otpautofill.Controller;

import com.example.grayopus.otpautofill.Model.UserOtp;
import com.example.grayopus.otpautofill.Service.OtpService;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/otp")
public class OtpController {
    private final OtpService otpService;

    @Autowired
    public OtpController(OtpService otpService) {
        this.otpService = otpService;
    }

    @PostMapping("/send-otp")
    public void sendOtp(@RequestBody UserOtp user) {
        // Generate OTP logic (you can use a separate OTP generation service)

        String phoneNumber= user.PhoneNumber;
        System.out.println(phoneNumber);
        String otp = generateOtp();


        otpService.sendOtp(phoneNumber, otp);
    }

    //    @PostMapping("/fetch")
//    public String fun1(@RequestBody UserOtp obj ) {
//        return otpService.Fetchotp(obj);
//    }
//    @PostMapping("/verify")
//    public String fun2(@RequestBody UserOtp obj) {
//        return otpService.verifyOtp(obj);
//    }
    String generateOtp() {
        Random random = new Random();
        StringBuilder otp = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            otp.append(random.nextInt(10));
        }

        return otp.toString();
    }

    @GetMapping("/users")
    public List<UserOtp> getall() {
        return otpService.GetUsers();
    }

    @DeleteMapping("/delete")
    public String del() {
        return otpService.deleteotp();
    }
}
