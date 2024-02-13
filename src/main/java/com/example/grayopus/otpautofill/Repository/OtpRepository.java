package com.example.grayopus.otpautofill.Repository;

import com.example.grayopus.otpautofill.Model.UserOtp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OtpRepository extends JpaRepository<UserOtp,String> {

}
