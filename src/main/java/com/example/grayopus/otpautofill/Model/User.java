//package com.example.grayopus.otpautofill.Model;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table
//
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    Long id;
//    String PhoneNumber;
//    String Name;
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", PhoneNumber='" + PhoneNumber + '\'' +
//                ", Name='" + Name + '\'' +
//                '}';
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getPhoneNumber() {
//        return PhoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        PhoneNumber = phoneNumber;
//    }
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String name) {
//        Name = name;
//    }
//
//    public User(String phoneNumber, String name) {
//        PhoneNumber = phoneNumber;
//        Name = name;
//    }
//
//
//
//    public User(Long id, String phoneNumber, String name) {
//        this.id = id;
//        PhoneNumber = phoneNumber;
//        Name = name;
//    }
//
//    public User() {
//    }
//}
