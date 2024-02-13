//package com.example.grayopus.otpautofill.Service;
//
//import com.example.grayopus.otpautofill.Model.User;
//import com.example.grayopus.otpautofill.Repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Random;
//
//@Service
//public class UserService {
//    @Autowired
//    UserRepository repository;
//    HashMap<String, String> phoneBook = new HashMap<>();
//
//    public String FetchOtp(String PhoneNo) {
//        String otp = generateOTP();
//        phoneBook.put(PhoneNo, otp);
//        return otp;
//    }
//
//    public String CheckOtp(String otp, User userObject) {
//        if (phoneBook.get(userObject.getPhoneNumber()) == otp) {
//            return RegisterUser(userObject);
//        } else {
//            return "Otp not matched !!";
//        }
//    }
//
//    String RegisterUser(User userObject) {
//        if (phoneBook.containsKey(userObject.getPhoneNumber())) {
//            return "User Already Registered !!";
//        } else {
//            repository.save(userObject);
//            return "User Successfully Registered !!";
//        }
//    }
//
//    public List<User> GetUsers() {
//        return repository.findAll();
//    }
//
//    String generateOTP() {
//        Random random = new Random();
//        StringBuilder otp = new StringBuilder();
//
//        for (int i = 0; i < 6; i++) {
//            otp.append(random.nextInt(10));
//        }
//
//        return otp.toString();
//    }
//}