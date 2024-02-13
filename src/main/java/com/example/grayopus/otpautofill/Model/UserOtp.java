package com.example.grayopus.otpautofill.Model;

import jakarta.persistence.*;

@Entity
@Table

public class UserOtp {
    @Id
    public String PhoneNumber;
    public String Otp;



}
