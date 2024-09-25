package com.example.girdview;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.security.AllPermission;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    LinearLayout home,infomation,edt_text,infomation2,spenar, btn_media;
    Button btnTryAgain;
    AlertDialog dialog;
    TextView txView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        home=findViewById(R.id.homee);
        infomation=findViewById(R.id.infomation);
        edt_text=findViewById(R.id.edt_text);
        infomation2=findViewById(R.id.infomation2);
        btn_media=findViewById(R.id.btn_media);
        spenar=findViewById(R.id.spenar);
        txView=findViewById(R.id.txView);

        //********Animaton View*****//
        Animation animation1 = AnimationUtils.loadAnimation(MainActivity.this,R.anim.right_to_left_slow);
        txView.startAnimation(animation1);


        //****nenwork and wifi connectivity java code and Dialog View*****
        ConnectivityManager manager = (ConnectivityManager) getApplicationContext().getSystemService(MainActivity.this.CONNECTIVITY_SERVICE);
        NetworkInfo acctiveNetwork = manager.getActiveNetworkInfo();

        if(null !=acctiveNetwork){

        }else {


            LayoutInflater inflater =getLayoutInflater();
            View view = inflater.inflate(R.layout.coustom_aleart_dialog,null);


            AlertDialog dialog = new AlertDialog.Builder(MainActivity.this).setView(view).create();
            dialog.setCancelable(false);
            dialog.show();

            btnTryAgain = view.findViewById(R.id.btnTryagain);
            btnTryAgain.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });



        }



        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        infomation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RegistrationForm.class);
                startActivity(intent);

            }
        });
        edt_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,TextInputLayout.class);
                startActivity(intent);

            }
        });
        infomation2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RegistrationForm2.class);
                startActivity(intent);

            }
        });

        spenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Spnar_or_Combo_Activity.class);
                startActivity(intent);

            }
        });
        btn_media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Media_player.class);
                startActivity(intent);

            }
        });




    }
}