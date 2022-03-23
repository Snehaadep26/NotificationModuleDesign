package com.example.notificationmoduledesign.NotificationApi;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiService {

    @Headers({"orgurl:test.theclassroom.biz",
            "Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTEzMywicGhvbmUiOiIrOTE5ODEyMTY4NTk5IiwidXJsIjoidGVzdC50aGVjbGFzc3Jvb20uYml6Iiwib3JnSWQiOiI0Y2IyNTA5ZC03MGY1LTQzNWUtODc5Mi1kMjQ5Mzc3NDNiNTMiLCJicm93c2VyTG9naW5Db2RlIjoiKzkxOTgxMjE2ODU5OTExMzNhYjA0YzE0Yy1iOWQ4LTQ1MGMtOGNjYS0wZjcxYzlmZjA2YjciLCJkZXZpY2VMb2dpbkNvZGUiOm51bGwsImlhdCI6MTY0NzMzMTEzMn0.0-i9bA3g93lG7-UBiMwWTakl6ckbu4n6M7NiaWnQ2XE"})
    @GET("notification")
    Call<GetAllNotificationsResponse> getAllNotificationCall();

    @Headers({"orgurl:test.theclassroom.biz",
            "Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTEzMywicGhvbmUiOiIrOTE5ODEyMTY4NTk5IiwidXJsIjoidGVzdC50aGVjbGFzc3Jvb20uYml6Iiwib3JnSWQiOiI0Y2IyNTA5ZC03MGY1LTQzNWUtODc5Mi1kMjQ5Mzc3NDNiNTMiLCJicm93c2VyTG9naW5Db2RlIjoiKzkxOTgxMjE2ODU5OTExMzNhYjA0YzE0Yy1iOWQ4LTQ1MGMtOGNjYS0wZjcxYzlmZjA2YjciLCJkZXZpY2VMb2dpbkNvZGUiOm51bGwsImlhdCI6MTY0NzMzMTEzMn0.0-i9bA3g93lG7-UBiMwWTakl6ckbu4n6M7NiaWnQ2XE"})
    @GET("notification/app-notifications")
    Call<GetAppNotificationsResponse> getAppNotificationCall();

    @Headers({"orgurl:test.theclassroom.biz",
            "Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTEzMywicGhvbmUiOiIrOTE5ODEyMTY4NTk5IiwidXJsIjoidGVzdC50aGVjbGFzc3Jvb20uYml6Iiwib3JnSWQiOiI0Y2IyNTA5ZC03MGY1LTQzNWUtODc5Mi1kMjQ5Mzc3NDNiNTMiLCJicm93c2VyTG9naW5Db2RlIjoiKzkxOTgxMjE2ODU5OTExMzNhYjA0YzE0Yy1iOWQ4LTQ1MGMtOGNjYS0wZjcxYzlmZjA2YjciLCJkZXZpY2VMb2dpbkNvZGUiOm51bGwsImlhdCI6MTY0NzMzMTEzMn0.0-i9bA3g93lG7-UBiMwWTakl6ckbu4n6M7NiaWnQ2XE"})
    @GET("notification/registered-users")
    Call<GetPendingUsersResponse> getPendingUserCall();

    @Headers({"orgurl:test.theclassroom.biz",
            "Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTEzMywicGhvbmUiOiIrOTE5ODEyMTY4NTk5IiwidXJsIjoidGVzdC50aGVjbGFzc3Jvb20uYml6Iiwib3JnSWQiOiI0Y2IyNTA5ZC03MGY1LTQzNWUtODc5Mi1kMjQ5Mzc3NDNiNTMiLCJicm93c2VyTG9naW5Db2RlIjoiKzkxOTgxMjE2ODU5OTExMzNhYjA0YzE0Yy1iOWQ4LTQ1MGMtOGNjYS0wZjcxYzlmZjA2YjciLCJkZXZpY2VMb2dpbkNvZGUiOm51bGwsImlhdCI6MTY0NzMzMTEzMn0.0-i9bA3g93lG7-UBiMwWTakl6ckbu4n6M7NiaWnQ2XE"})
    @GET("notification/registered-users")
    Call<GetRejectedUsersResponse> getRejectedUserCall();

    @Headers({"orgurl:test.theclassroom.biz",
            "Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTEzMywicGhvbmUiOiIrOTE5ODEyMTY4NTk5IiwidXJsIjoidGVzdC50aGVjbGFzc3Jvb20uYml6Iiwib3JnSWQiOiI0Y2IyNTA5ZC03MGY1LTQzNWUtODc5Mi1kMjQ5Mzc3NDNiNTMiLCJicm93c2VyTG9naW5Db2RlIjoiKzkxOTgxMjE2ODU5OTExMzNhYjA0YzE0Yy1iOWQ4LTQ1MGMtOGNjYS0wZjcxYzlmZjA2YjciLCJkZXZpY2VMb2dpbkNvZGUiOm51bGwsImlhdCI6MTY0NzMzMTEzMn0.0-i9bA3g93lG7-UBiMwWTakl6ckbu4n6M7NiaWnQ2XE"})
    @POST("user/updateStatus")
    Call<ApproveOrRejectResponse> getRejectResponse(@Body ApproveOrRejectRequest approveOrRejectRequest);


//    @Headers({"orgurl:brigosha.classroom.digital",
//            "Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicGhvbmUiOiIrOTE5ODEyMTY4NTk5IiwidXJsIjoiYnJpZ29zaGEuY2xhc3Nyb29tLmRpZ2l0YWwiLCJvcmdJZCI6ImY4NjA4NDk3LWZiMzQtNGFiZC1hOGFkLTNmYjdlZDczZjUxZCIsImJyb3dzZXJMb2dpbkNvZGUiOiIrOTE5ODEyMTY4NTk5MTc2ZjJlMmI3LTgxODktNDM3ZC1hZDhiLTFlMzhhNGY4ZWIwOCIsImRldmljZUxvZ2luQ29kZSI6bnVsbCwiaWF0IjoxNjQzMDA4MTk1fQ.2IApiBdeHGiJ0igyeNDcfNjLZ8eOSaIK2QGmJAUXpw8"})
//    @POST("user/updateStatus")
//    Call<ApproveOrRejectResponse> getRe  .,mjectResponse(@Body ApproveOrRejectRequest approveOrRejectRequest);
}
