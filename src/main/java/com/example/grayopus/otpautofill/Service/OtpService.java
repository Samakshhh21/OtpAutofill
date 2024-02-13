package com.example.grayopus.otpautofill.Service;

import com.example.grayopus.otpautofill.Model.UserOtp;
import com.example.grayopus.otpautofill.Repository.OtpRepository;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class OtpService {
    @Autowired
    OtpRepository repository;
    @Value("AC169d86acd112ac1e2a7def6d67e38c91")
    private String accountSid;

    @Value("fcfb4965d5f72a29cf5c058d17f828b0")
    private String authToken;
    @Value("+16308822205")
    private String twilioPhoneNumber;
    public void sendOtp(String phoneNumber, String otp) {
        Twilio.init(accountSid, authToken);

        String messageBody = "Your OTP is: " + otp;


        Message message = Message.creator(
                new PhoneNumber(phoneNumber),
                new PhoneNumber(twilioPhoneNumber),
                messageBody
        ).create();

        System.out.println("OTP sent with SID: " + message.getSid());
    }



    public String Fetchotp(UserOtp obj) {
        System.out.println(obj.PhoneNumber);
        String otp = generateOTP();

        obj.Otp=otp;
        repository.save(obj);
        return otp;
    }
    public List<UserOtp> GetUsers() {
        return repository.findAll();
    }
    public String verifyOtp(UserOtp userObject) {

        if (repository.findById(userObject.PhoneNumber).get().Otp.equals(userObject.Otp)) {
             return "OTP Verified !!";
        }
        else{
            return "OTP is Invalid !!";
        }
    }

    String generateOTP() {
        Random random = new Random();
        StringBuilder otp = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            otp.append(random.nextInt(10));
        }

        return otp.toString();
    }

    public String deleteotp() {
        repository.deleteAll();
        return "All Otps deleted !!";
    }
}
