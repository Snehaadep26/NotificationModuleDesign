package com.example.notificationmoduledesign.JavaClass;

public class StudRegistrationCardP11 {
    String name,phone,subDate,SubTime;

    public StudRegistrationCardP11(String name, String phone, String subDate, String subTime) {
        this.name = name;
        this.phone = phone;
        this.subDate = subDate;
        SubTime = subTime;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getSubDate() {
        return subDate;
    }

    public String getSubTime() {
        return SubTime;
    }
}
