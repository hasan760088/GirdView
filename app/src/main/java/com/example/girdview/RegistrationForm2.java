package com.example.girdview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class RegistrationForm2 extends AppCompatActivity {
    TextInputEditText edt_comName2,edt_CmEmail2,edt_comPhone2,edt_comPass2,edt_Cmpassword2;
    Button btnRegistration2;
    CheckBox check_Box2;
    RadioGroup rediogrupid;
    RadioButton radioButton;
    TextView tvdisplay;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration_form2);
        edt_comName2=findViewById(R.id.edt_comName2);
        edt_CmEmail2=findViewById(R.id.edt_CmEmail2);
        edt_comPhone2=findViewById(R.id.edt_comPhone2);
        edt_comPass2=findViewById(R.id.edt_comPass2);
        edt_Cmpassword2=findViewById(R.id.edt_Cmpassword2);
        btnRegistration2=findViewById(R.id.btnRegistration2);
        check_Box2=findViewById(R.id.check_Box2);
        rediogrupid=findViewById(R.id.rediogrupid);
        tvdisplay=findViewById(R.id.tvdisplay);





        btnRegistration2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String name2 = edt_comName2.getText().toString();
                String email2 = edt_CmEmail2.getText().toString();
                String phone2 = edt_comPhone2.getText().toString();
                String password2 = edt_comPass2.getText().toString();
                String com_Pasword2 = edt_Cmpassword2.getText().toString();
                String checkBox2 = check_Box2.getText().toString();

                int selected = rediogrupid.getCheckedRadioButtonId();
                radioButton = findViewById(selected);
                String value = radioButton.getText().toString();

                if (name2.isEmpty() || email2.isEmpty() || phone2.isEmpty() || password2.isEmpty() || checkBox2.isEmpty() ) {
                    edt_comName2.setError("Please enter your Name");
                    edt_CmEmail2.setError("Please enter your Email");
                    edt_comPhone2.setError("Please enter your Phone number");
                    edt_comPass2.setError("Please enter passwoard");
                    edt_Cmpassword2.setError("Please Re-write your passward");
                    Toast.makeText(RegistrationForm2.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
                } else if (!password2.equals(com_Pasword2)) {
                    Toast.makeText(RegistrationForm2.this, "Passwords are not matching", Toast.LENGTH_SHORT).show();

                } else if (check_Box2.isChecked()) {
                    
                    Toast.makeText(RegistrationForm2.this, "Regstration Succesfull", Toast.LENGTH_SHORT).show();
                    
                    tvdisplay.append("Prsonal Information" +"\n"+"Your name is " + name2 + "\n");
                    tvdisplay.append("Email " + email2 + "\n");
                    tvdisplay.append("Phone: " + phone2 + "\n");
                    tvdisplay.append("Password: " + password2 + "\n");
                    tvdisplay.append(" Gender is " + value + "\n");


                    
                    edt_comName2.setText("");
                    edt_CmEmail2.setText("");
                    edt_comPhone2.setText("");
                    edt_comPass2.setText("");
                    edt_Cmpassword2.setText("");



                }

            }

        });




    }
}