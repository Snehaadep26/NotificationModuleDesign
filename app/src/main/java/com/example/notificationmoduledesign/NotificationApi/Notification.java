package com.example.notificationmoduledesign.NotificationApi;

import java.util.Date;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class Notification {
    public int id;
    public String type;
    public String title;
    public String message;
    public String status;
    public int userId;
    public Date createdAt;

    public Notification(int id, String type, String title, String message, String status, int userId, Date createdAt) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.message = message;
        this.status = status;
        this.userId = userId;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    public int getUserId() {
        return userId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
