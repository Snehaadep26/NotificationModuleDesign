package com.example.notificationmoduledesign.NotificationApi;

import java.util.ArrayList;
import java.util.Date;

public class Item {
        public int id;
        public String name;
        public int reqId;
        public Object refId;
        public Object email;
        public String phone;
        public String _details;
        public ArrayList<String> role;
        public String permission;
        public String status;
        public Date updatedAt;
        public Date createdAt;
        public String submittedOnDate;
        public String rejectedOnDate;
        public String submittedOnTime;
        public String rejectedOnTime;
        public Details details;

    public Item(int id, String name, int reqId, Object refId, Object email, String phone, String _details, ArrayList<String> role, String permission, String status, Date updatedAt, Date createdAt, String submittedOnDate, String rejectedOnDate, String submittedOnTime, String rejectedOnTime, Details details) {
        this.id = id;
        this.name = name;
        this.reqId = reqId;
        this.refId = refId;
        this.email = email;
        this.phone = phone;
        this._details = _details;
        this.role = role;
        this.permission = permission;
        this.status = status;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.submittedOnDate = submittedOnDate;
        this.rejectedOnDate = rejectedOnDate;
        this.submittedOnTime = submittedOnTime;
        this.rejectedOnTime = rejectedOnTime;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getReqId() {
        return reqId;
    }

    public Object getRefId() {
        return refId;
    }

    public Object getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String get_details() {
        return _details;
    }

    public ArrayList<String> getRole() {
        return role;
    }

    public String getPermission() {
        return permission;
    }

    public String getStatus() {
        return status;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getSubmittedOnDate() {
        return submittedOnDate;
    }

    public String getRejectedOnDate() {
        return rejectedOnDate;
    }

    public String getSubmittedOnTime() {
        return submittedOnTime;
    }

    public String getRejectedOnTime() {
        return rejectedOnTime;
    }

    public Details getDetails() {
        return details;
    }
}



