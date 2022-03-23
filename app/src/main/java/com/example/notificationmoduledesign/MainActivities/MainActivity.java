package com.example.notificationmoduledesign.MainActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.notificationmoduledesign.AdapterClass.AllNotiFi2CardAdapterP1;
import com.example.notificationmoduledesign.AdapterClass.AllNotifiCardAdapterP1;
import com.example.notificationmoduledesign.JavaClass.AllNotiFi2CardP1;
import com.example.notificationmoduledesign.JavaClass.AllNotificationCardP1;
import com.example.notificationmoduledesign.NotificationApi.ApiClient;
import com.example.notificationmoduledesign.NotificationApi.ApiService;
import com.example.notificationmoduledesign.NotificationApi.GetAllNotificationsResponse;
import com.example.notificationmoduledesign.NotificationApi.Notification;
import com.example.notificationmoduledesign.R;

import java.util.ArrayList;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    ArrayList<AllNotificationCardP1> allNotificationCardP1;
    AllNotifiCardAdapterP1 allNotifiCardAdapterP1;
    ArrayList<AllNotiFi2CardP1> allNotiFi2CardP1;
    AllNotiFi2CardAdapterP1 allNotiFi2CardAdapterP1;
    RecyclerView recyclerView1P1, recyclerView2P2;
    RecyclerView.LayoutManager layoutManager1P1, layoutManager2P2;
    TextView textView, textView1;
    GetAllNotificationsResponse getAllNotificationsResponse;
    Retrofit retrofit;
    ApiService apiService;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.categoriesTextP1);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivityP2.class);
                startActivity(intent);
            }
        });
        textView1 = findViewById(R.id.categoriesText5P1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivityP8.class);
                startActivity(intent);
            }
        });
        imageView=findViewById(R.id.arrow5P1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivityP5.class);
                startActivity(intent);
            }
        });
        apiInIt();
        allNotification();
        //craetecard2P1();
        //buildRecyclerView1P1();
        //buildRecyclerView2P1();

    }

    private void apiInIt() {
        retrofit = ApiClient.getRetrofit();
        apiService = ApiClient.getApiService();
    }

    public void allNotification() {
        Call<GetAllNotificationsResponse> call = apiService.getAllNotificationCall();
        call.enqueue(new Callback<GetAllNotificationsResponse>() {
            @Override
            public void onResponse(Call<GetAllNotificationsResponse> call, Response<GetAllNotificationsResponse> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getAllNotificationsResponse = response.body();
                ArrayList<Notification> notificationArrayList = (ArrayList<Notification>) getAllNotificationsResponse.getNotifications();
                Log.i("Size A", String.valueOf(notificationArrayList.size()));
                allNotificationCardP1 = new ArrayList<>();
                for (Notification n1 :
                        notificationArrayList) {
                    allNotificationCardP1.add(new AllNotificationCardP1(n1.title, String.valueOf(n1.createdAt.getDate())));

                }

                recyclerView1P1 = findViewById(R.id.recycler1P1);
                layoutManager1P1 = new LinearLayoutManager(getApplicationContext());
                recyclerView1P1.setLayoutManager(layoutManager1P1);
                recyclerView1P1.setHasFixedSize(true);
                allNotifiCardAdapterP1 = new AllNotifiCardAdapterP1(allNotificationCardP1, getApplicationContext());
                recyclerView1P1.setAdapter(allNotifiCardAdapterP1);


                //Toast.makeText(getApplicationContext(), String.valueOf(getAllNotificationsResponse.notificationsCount), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<GetAllNotificationsResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error in all notifications", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //    public void createCard1P1()
//    {
//        allNotificationCardP1 =new ArrayList<>();
//        allNotificationCardP1.add(new AllNotificationCardP1(R.drawable.newregreqp1,"New Registration request","12/04/2021","09:00AM"));
//        allNotificationCardP1.add(new AllNotificationCardP1(R.drawable.newregreqp1,"New Registration request","12/04/2021","09:00AM"));
//        allNotificationCardP1.add(new AllNotificationCardP1(R.drawable.newregreqp1,"New Students registration","12/04/2021","09:00AM"));
//        allNotificationCardP1.add(new AllNotificationCardP1(R.drawable.loremimgp1, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor …","12/04/2021","09:00AM"));
//
//    }
//    public void buildRecyclerView1P1()
//    {
//        recyclerView1P1=findViewById(R.id.recycler1P1);
//        recyclerView1P1.setHasFixedSize(true);
//        layoutManager1P1=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
//        recyclerView1P1.setLayoutManager(layoutManager1P1);
//        allNotifiCardAdapterP1=new AllNotifiCardAdapterP1(allNotificationCardP1,getApplicationContext());
//        recyclerView1P1.setAdapter(allNotifiCardAdapterP1);
//    }
    public void craetecard2P1() {
        allNotiFi2CardP1 = new ArrayList<>();
        allNotiFi2CardP1.add(new AllNotiFi2CardP1(R.drawable.paymentsuccessp1, "Payment successfully done for the month of May.", "VIEW INVOICE", "12/04/2021", "09:00AM"));
        allNotiFi2CardP1.add(new AllNotiFi2CardP1(R.drawable.testnewp1, "Test: New Mathematics test paper has been published.", "VIEW TEST", "12/04/2021", "09:00AM"));
        allNotiFi2CardP1.add(new AllNotiFi2CardP1(R.drawable.assinewp1, "Assignment: New Mathematics assignment has been published.", "VIEW ASSIGNMENT", "12/04/2021", "09:00AM"));

    }

    public void buildRecyclerView2P1() {
        recyclerView2P2 = findViewById(R.id.recycler2P1);
        recyclerView2P2.setHasFixedSize(true);
        layoutManager2P2 = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView2P2.setLayoutManager(layoutManager2P2);
        allNotiFi2CardAdapterP1 = new AllNotiFi2CardAdapterP1(allNotiFi2CardP1, getApplicationContext());
        recyclerView2P2.setAdapter(allNotiFi2CardAdapterP1);
    }
}