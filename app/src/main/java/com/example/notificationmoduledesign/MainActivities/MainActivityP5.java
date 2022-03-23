
package com.example.notificationmoduledesign.MainActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.notificationmoduledesign.R;

public class MainActivityP5 extends AppCompatActivity {
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_p5);
        imageView=findViewById(R.id.back_chapter_detialsp5);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivityP3.class);
                startActivity(intent);
            }
        });
    }
}