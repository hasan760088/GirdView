package com.example.girdview;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Spnar_or_Combo_Activity extends AppCompatActivity {
    String [] country_name;
    Spinner spnerid;
    Button btnClick;
    TextView tvdisplayspner,tvDisplay_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spnar_or_combo);
        country_name=getResources().getStringArray(R.array.country_name);
        btnClick=findViewById(R.id.btnClick);
        spnerid=findViewById(R.id.spnerid);
        tvdisplayspner=findViewById(R.id.tvdisplayspner);
        tvDisplay_item=findViewById(R.id.tvDisplay_item);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,R.layout.item_spener,R.id.tvDisplay_item,country_name);
        spnerid.setAdapter(adapter);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = spnerid.getSelectedItem().toString();
                tvdisplayspner.setText("Your country is "+value);
            }
        });



    }
}