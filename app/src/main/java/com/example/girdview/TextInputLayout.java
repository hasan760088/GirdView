package com.example.girdview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class TextInputLayout extends AppCompatActivity {
    TextInputEditText edt_comName,edt_comPass;
    Button btn_comlonin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_text_input_layout);

        btn_comlonin=findViewById(R.id.btn_comlonin);
        edt_comName=findViewById(R.id.edt_comName);
        edt_comPass=findViewById(R.id.edt_comPass);


        btn_comlonin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameString=edt_comName.getText().toString();
                String passString=edt_comPass.getText().toString();

                if (nameString.isEmpty()||passString.isEmpty()){
                    edt_comName.setError("Please enter your email");
                    edt_comPass.setError("Please enter your password");
                    Toast.makeText(TextInputLayout.this,"Please fill up the requrment fields",Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(TextInputLayout.this, "You have sucessfuly login", Toast.LENGTH_SHORT).show();
                }



            }
        });



    }
}