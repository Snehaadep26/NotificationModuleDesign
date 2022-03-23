package com.example.notificationmoduledesign.NotificationApi;

import java.util.ArrayList;

public class GetAllNotificationsResponse {
    public ArrayList<Notification> notifications;
    public int notificationsCount;

    public GetAllNotificationsResponse(ArrayList<Notification> notifications, int notificationsCount) {
        this.notifications = notifications;
        this.notificationsCount = notificationsCount;
    }

    public ArrayList<Notification> getNotifications() {
        return notifications;
    }

    public int getNotificationsCount() {
        return notificationsCount;
    }
}

