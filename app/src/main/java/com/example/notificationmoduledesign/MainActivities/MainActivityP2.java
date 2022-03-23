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

import com.example.notificationmoduledesign.AdapterClass.AnnouncementCardAdapterP2;
import com.example.notificationmoduledesign.JavaClass.AnnouncementCardP2;
import com.example.notificationmoduledesign.NotificationApi.ApiClient;
import com.example.notificationmoduledesign.NotificationApi.ApiService;
import com.example.notificationmoduledesign.NotificationApi.GetAppNotificationsResponse;
import com.example.notificationmoduledesign.NotificationApi.Month;
import com.example.notificationmoduledesign.NotificationApi.Today;
import com.example.notificationmoduledesign.NotificationApi.Week;
import com.example.notificationmoduledesign.NotificationApi.Yesterday;
import com.example.notificationmoduledesign.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivityP2 extends AppCompatActivity {
    ArrayList<AnnouncementCardP2> announcementCardP2;
    AnnouncementCardAdapterP2 announcementCardAdapterP2;
    RecyclerView recyclerView1P2,recyclerView2P2,recyclerView3P2;
    RecyclerView.LayoutManager layoutManager1P2,layoutManager2P2,layoutManager3P2;
    TextView textView;
    ImageView imageView;
    Retrofit retrofit;
    ApiService apiService;
    GetAppNotificationsResponse getAppNotificationsResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_p2);
        // createCard1P1();
        apiInIt();
        appNotification();
        appNotification1();
        appNotification2();
        //buildRecyclerView1P1();
        textView = findViewById(R.id.infoText2P2);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivityP12.class);
                startActivity(intent);
            }
        });
        imageView = findViewById(R.id.back_chapter_detialsP2);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
    public void appNotification()
    {
        Call<GetAppNotificationsResponse> call=apiService.getAppNotificationCall();
        call.enqueue(new Callback<GetAppNotificationsResponse>() {
            @Override
            public void onResponse(Call<GetAppNotificationsResponse> call, Response<GetAppNotificationsResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getAppNotificationsResponse=response.body();
                ArrayList<Today> todayArrayList=( ArrayList<Today>)getAppNotificationsResponse.getToday();
                Log.i("size today",String.valueOf(todayArrayList.size()));
                announcementCardP2=new ArrayList<>();
                for(Today mi:
                      todayArrayList){
                    announcementCardP2.add(new AnnouncementCardP2(mi.title,mi.timeStamp));

                }
                recyclerView1P2=findViewById(R.id.recyclerView2P2);
                layoutManager1P2=new LinearLayoutManager(getApplicationContext());
                recyclerView1P2.setLayoutManager(layoutManager1P2);
                recyclerView1P2.setHasFixedSize(true);
                announcementCardAdapterP2=new AnnouncementCardAdapterP2(announcementCardP2,getApplicationContext());
                recyclerView1P2.setAdapter(announcementCardAdapterP2);

//                recyclerView2P2=findViewById(R.id.recyclerView3P2);
//                layoutManager2P2=new LinearLayoutManager(getApplicationContext());
//                recyclerView2P2.setLayoutManager(layoutManager2P2);
//                recyclerView2P2.setHasFixedSize(true);
//                announcementCardAdapterP2=new AnnouncementCardAdapterP2(announcementCardP2,getApplicationContext());
//                recyclerView2P2.setAdapter(announcementCardAdapterP2);
//
//                recyclerView3P2=findViewById(R.id.recyclerView4P2);
//                layoutManager3P2=new LinearLayoutManager(getApplicationContext());
//                recyclerView3P2.setLayoutManager(layoutManager3P2);
//                recyclerView3P2.setHasFixedSize(true);
//                announcementCardAdapterP2=new AnnouncementCardAdapterP2(announcementCardP2,getApplicationContext());
//                recyclerView3P2.setAdapter(announcementCardAdapterP2);
            // Toast.makeText(getApplicationContext(), String.valueOf(getAppNotificationsResponse.categories.get(1)), Toast.LENGTH_SHORT).show();

            }


            @Override
            public void onFailure(Call<GetAppNotificationsResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error in app notifications", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void appNotification1()
    {
        Call<GetAppNotificationsResponse> call=apiService.getAppNotificationCall();
        call.enqueue(new Callback<GetAppNotificationsResponse>() {
            @Override
            public void onResponse(Call<GetAppNotificationsResponse> call, Response<GetAppNotificationsResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getAppNotificationsResponse=response.body();
                ArrayList<Week> weekArrayList=( ArrayList<Week>)getAppNotificationsResponse.getWeek();
                Log.i("size today",String.valueOf(weekArrayList.size()));
                announcementCardP2=new ArrayList<>();
                for(Week m1:
                        weekArrayList){
                    announcementCardP2.add(new AnnouncementCardP2(m1.title,m1.timeStamp));

                }
//                recyclerView1P2=findViewById(R.id.recyclerView2P2);
//                layoutManager1P2=new LinearLayoutManager(getApplicationContext());
//                recyclerView1P2.setLayoutManager(layoutManager1P2);
//                recyclerView1P2.setHasFixedSize(true);
//                announcementCardAdapterP2=new AnnouncementCardAdapterP2(announcementCardP2,getApplicationContext());
//                recyclerView1P2.setAdapter(announcementCardAdapterP2);

                recyclerView2P2=findViewById(R.id.recyclerView3P2);
                layoutManager2P2=new LinearLayoutManager(getApplicationContext());
                recyclerView2P2.setLayoutManager(layoutManager2P2);
                recyclerView2P2.setHasFixedSize(true);
                announcementCardAdapterP2=new AnnouncementCardAdapterP2(announcementCardP2,getApplicationContext());
                recyclerView2P2.setAdapter(announcementCardAdapterP2);

//                recyclerView3P2=findViewById(R.id.recyclerView4P2);
//                layoutManager3P2=new LinearLayoutManager(getApplicationContext());
//                recyclerView3P2.setLayoutManager(layoutManager3P2);
//                recyclerView3P2.setHasFixedSize(true);
//                announcementCardAdapterP2=new AnnouncementCardAdapterP2(announcementCardP2,getApplicationContext());
//                recyclerView3P2.setAdapter(announcementCardAdapterP2);
                // Toast.makeText(getApplicationContext(), String.valueOf(getAppNotificationsResponse.categories.get(1)), Toast.LENGTH_SHORT).show();

            }


            @Override
            public void onFailure(Call<GetAppNotificationsResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error in app notifications", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void appNotification2()
    {
        Call<GetAppNotificationsResponse> call=apiService.getAppNotificationCall();
        call.enqueue(new Callback<GetAppNotificationsResponse>() {
            @Override
            public void onResponse(Call<GetAppNotificationsResponse> call, Response<GetAppNotificationsResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getAppNotificationsResponse=response.body();
                ArrayList<Month> monthArrayList=( ArrayList<Month>)getAppNotificationsResponse.getMonth();
                Log.i("size today",String.valueOf(monthArrayList.size()));
                announcementCardP2=new ArrayList<>();                for(Month mi:
                        monthArrayList){
                    announcementCardP2.add(new AnnouncementCardP2(mi.title,mi.timeStamp));

                }
//                recyclerView1P2=findViewById(R.id.recyclerView2P2);
//                layoutManager1P2=new LinearLayoutManager(getApplicationContext());
//                recyclerView1P2.setLayoutManager(layoutManager1P2);
//                recyclerView1P2.setHasFixedSize(true);
//                announcementCardAdapterP2=new AnnouncementCardAdapterP2(announcementCardP2,getApplicationContext());
//                recyclerView1P2.setAdapter(announcementCardAdapterP2);
//
//                recyclerView2P2=findViewById(R.id.recyclerView3P2);
//                layoutManager2P2=new LinearLayoutManager(getApplicationContext());
//                recyclerView2P2.setLayoutManager(layoutManager2P2);
//                recyclerView2P2.setHasFixedSize(true);
//                announcementCardAdapterP2=new AnnouncementCardAdapterP2(announcementCardP2,getApplicationContext());
//                recyclerView2P2.setAdapter(announcementCardAdapterP2);

                recyclerView3P2=findViewById(R.id.recyclerView4P2);
                layoutManager3P2=new LinearLayoutManager(getApplicationContext());
                recyclerView3P2.setLayoutManager(layoutManager3P2);
                recyclerView3P2.setHasFixedSize(true);
                announcementCardAdapterP2=new AnnouncementCardAdapterP2(announcementCardP2,getApplicationContext());
                recyclerView3P2.setAdapter(announcementCardAdapterP2);
                // Toast.makeText(getApplicationContext(), String.valueOf(getAppNotificationsResponse.categories.get(1)), Toast.LENGTH_SHORT).show();

            }


            @Override
            public void onFailure(Call<GetAppNotificationsResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error in app notifications", Toast.LENGTH_SHORT).show();
            }
        });
    }




    private void apiInIt() {
        retrofit = ApiClient.getRetrofit();
        apiService = ApiClient.getApiService();
    }

    //    public void createCard1P1()
//    {
//        announcementCardP2=new ArrayList<>();
//        announcementCardP2.add(new AnnouncementCardP2("Earlier this week","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor …","09:00 AM"));
//        announcementCardP2.add(new AnnouncementCardP2("This month","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor …","09:00 AM"));
//        announcementCardP2.add(new AnnouncementCardP2("April, 2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor …","09:00 AM"));
//
//
//    }
//    public void buildRecyclerView1P1()
//    {
//        recyclerView1P2=findViewById(R.id.recycler1P2);
//        recyclerView1P2.setHasFixedSize(true);
//        layoutManager1P2=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
//        recyclerView1P2.setLayoutManager(layoutManager1P2);
//        announcementCardAdapterP2=new AnnouncementCardAdapterP2(announcementCardP2,getApplicationContext());
//        recyclerView1P2.setAdapter(announcementCardAdapterP2);
//    }
}