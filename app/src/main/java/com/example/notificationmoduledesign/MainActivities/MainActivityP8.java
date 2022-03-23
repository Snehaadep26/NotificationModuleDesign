package com.example.notificationmoduledesign.MainActivities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.notificationmoduledesign.AdapterClass.ViewPagerAdapter;
import com.example.notificationmoduledesign.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivityP8 extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_p8);

        tabLayout = findViewById(R.id.tabs);
        viewPager2 = findViewById(R.id.view_pager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager2.setAdapter(viewPagerAdapter);

        new TabLayoutMediator(tabLayout, viewPager2,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        if (position == 0)
                            tab.setText("PENDING");

                        else
                            tab.setText("REJECTED");
                    }
                }).attach();
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#594099"));
        imageView=findViewById(R.id.backButton);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}