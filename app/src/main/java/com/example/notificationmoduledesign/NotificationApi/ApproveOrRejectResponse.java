package com.example.notificationmoduledesign.NotificationApi;

public class ApproveOrRejectResponse {
    public ShowN showN;
    public String phone;
    public String email;
    public int pendingUserId;
    public String name;

    public ShowN getShow() {
        return showN;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getPendingUserId() {
        return pendingUserId;
    }

    public String getName() {
        return name;
    }
}


