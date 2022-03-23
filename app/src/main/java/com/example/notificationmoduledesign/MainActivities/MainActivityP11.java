package com.example.notificationmoduledesign.MainActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

import com.example.notificationmoduledesign.AdapterClass.StudRegistrationCardP11Adapter;
import com.example.notificationmoduledesign.JavaClass.StudRegistrationCardP11;
import com.example.notificationmoduledesign.R;

import java.util.ArrayList;

public class MainActivityP11 extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager1P11;
    ArrayList<StudRegistrationCardP11> studRegistrationCardP11;
    StudRegistrationCardP11Adapter studRegistrationCardP11Adapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_p11);
        imageView=findViewById(R.id.backButtonp11);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        createCard();
        buildRecyclerView();


    }
    public  void  createCard(){
        studRegistrationCardP11=new ArrayList<>();
        studRegistrationCardP11.add(new StudRegistrationCardP11("Andrew L. Hennen","+91 9834173204","12/04/2021","09:00 AM"));
        studRegistrationCardP11.add(new StudRegistrationCardP11("Andrew L. Hennen","+91 9834173204","12/04/2021","09:00 AM"));
        studRegistrationCardP11.add(new StudRegistrationCardP11("Andrew L. Hennen","+91 9834173204","12/04/2021","09:00 AM"));
        studRegistrationCardP11.add(new StudRegistrationCardP11("Andrew L. Hennen","+91 9834173204","12/04/2021","09:00 AM"));
        studRegistrationCardP11.add(new StudRegistrationCardP11("Andrew L. Hennen","+91 9834173204","12/04/2021","09:00 AM"));
        studRegistrationCardP11.add(new StudRegistrationCardP11("Andrew L. Hennen","+91 9834173204","12/04/2021","09:00 AM"));

    }

    public void buildRecyclerView() {
        recyclerView=findViewById(R.id.recyclerP11);
        recyclerView.setHasFixedSize(true);
        layoutManager1P11=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager1P11);
        studRegistrationCardP11Adapter=new StudRegistrationCardP11Adapter(studRegistrationCardP11,getApplicationContext());
        recyclerView.setAdapter(studRegistrationCardP11Adapter);
    }
}