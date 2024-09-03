package com.example.girdview;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Profile_infotmation extends AppCompatActivity {
    TextView tv_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile_infotmation);

        tv_display=findViewById(R.id.tv_display);


        String Name=getIntent().getStringExtra("keyName");
        String Email=getIntent().getStringExtra("keyEmail");
        String Phone=getIntent().getStringExtra("keyPhone");
        String Pasword=getIntent().getStringExtra("keyPassword");

        tv_display.append("Your Name is "+ Name + "\n");
        tv_display.append("Email is "+ Email + "\n");
        tv_display.append("Phone Number is "+ Phone + "\n");
        tv_display.append("Password is "+ Pasword + "\n");






    }
}