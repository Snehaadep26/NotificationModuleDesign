package com.example.notificationmoduledesign.NotificationApi;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class Meta {
    public int totalItems;
    public int itemCount;
    public int itemsPerPage;
    public int totalPages;
    public String currentPage;
}
