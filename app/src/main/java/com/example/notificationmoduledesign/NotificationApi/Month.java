package com.example.notificationmoduledesign.NotificationApi;

import java.util.Date;

public class Month {
    public int id;
    public String title;
    public String message;
    public String status;
    public int userId;
    public int authorId;
    public String category;
    public Date createdAtWithTime;
    public String createdAt;
    public String timeStamp;
    public int refId;

    public Month(int id, String title, String message, String status, int userId, int authorId, String category, Date createdAtWithTime, String createdAt, String timeStamp, int refId) {
        this.id = id;
        this.title = title;
        this.message = message;
        this.status = status;
        this.userId = userId;
        this.authorId = authorId;
        this.category = category;
        this.createdAtWithTime = createdAtWithTime;
        this.createdAt = createdAt;
        this.timeStamp = timeStamp;
        this.refId = refId;
    }

    public int getId() {
        return id;
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

    public int getAuthorId() {
        return authorId;
    }

    public String getCategory() {
        return category;
    }

    public Date getCreatedAtWithTime() {
        return createdAtWithTime;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public int getRefId() {
        return refId;
    }
}
