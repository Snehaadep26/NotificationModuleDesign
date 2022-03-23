package com.example.notificationmoduledesign.NotificationApi;

import java.util.Date;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class Today {
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
}
