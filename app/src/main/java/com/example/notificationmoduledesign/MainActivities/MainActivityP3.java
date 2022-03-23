package com.example.notificationmoduledesign.MainActivities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.example.notificationmoduledesign.AdapterClass.ViewPagerAdapterP3;
import com.example.notificationmoduledesign.Fragments.PendingFragmentP3;
import com.example.notificationmoduledesign.Fragments.RejectedFragmentP3;
import com.example.notificationmoduledesign.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivityP3 extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    ImageView imageView;
    Switch aSwitch;
    ViewPagerAdapterP3 viewPagerAdapterP3;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_p3);

        tabLayout = findViewById(R.id.tabs);
        aSwitch=findViewById(R.id.switch1p3);
        textView=findViewById(R.id.viewFormRUp3);
        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivityP10.class);
                startActivity(intent);
            }
        });

//        aSwitch.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(getApplicationContext(),MainActivityP5.class);
//                startActivity(intent);
//            }
//        });


        tabLayout = (TabLayout) findViewById(R.id.tabsp3);
        viewPager = (ViewPager) findViewById(R.id.view_pagerp3);
        viewPagerAdapterP3 = new ViewPagerAdapterP3(getSupportFragmentManager());

        viewPagerAdapterP3.AddFragment(new PendingFragmentP3(), "PENDING");
        viewPagerAdapterP3.AddFragment(new RejectedFragmentP3(), "REJECTED");
        viewPager.setAdapter(viewPagerAdapterP3);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#594099"));
        imageView=findViewById(R.id.backButtonp3);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}