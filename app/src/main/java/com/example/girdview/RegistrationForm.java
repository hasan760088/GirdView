package com.example.girdview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegistrationForm extends AppCompatActivity {
    EditText edtName,edtEmail,edtPhone,edtPassward,
            edtCom_Passward;
    Button btnRegistration;
    CheckBox check_Box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration_form);

        edtName=findViewById(R.id.edtName);
        edtEmail=findViewById(R.id.edtEmail);
        edtPhone=findViewById(R.id.edtPhone);
        edtPassward=findViewById(R.id.edtPassward);
        edtCom_Passward=findViewById(R.id.edtCom_Passward);
        btnRegistration=findViewById(R.id.btnRegistration);
        check_Box=findViewById(R.id.check_Box);



        btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name=edtName.getText().toString();
                String Email=edtEmail.getText().toString();
                String Phone=edtPhone.getText().toString();
                String Password=edtPassward.getText().toString();
                String com_Pasword=edtCom_Passward.getText().toString();
                String checkBox=check_Box.getText().toString();



                if (Name.isEmpty()|| Email.isEmpty() || Phone.isEmpty() || Password.isEmpty() ||checkBox.isEmpty())
                {
                    edtName.setError("Please enter your Name");
                    edtEmail.setError("Please enter your Email");
                    edtPhone.setError("Please enter your Phone number");
                    edtPassward.setError("Please enter passwoard");
                    edtCom_Passward.setError("Please Re-write your passward");
                    Toast.makeText(RegistrationForm.this,"Please fill all the fields",Toast.LENGTH_SHORT).show();
                }
                else if (!Password.equals(com_Pasword)) {
                    Toast.makeText(RegistrationForm.this,"Passwords are not matching",Toast.LENGTH_SHORT).show();

                }else if(check_Box.isChecked()) {
                    Intent intent =new Intent(RegistrationForm.this,Profile_infotmation.class);
                    intent.putExtra("keyName",Name);
                    intent.putExtra("keyEmail",Email);
                    intent.putExtra("keyPhone",Phone);
                    intent.putExtra("keyPassword",Password);

                    startActivity(intent);



                    edtName.setText(" ");
                    edtEmail.setText(" ");
                    edtPhone.setText(" ");
                    edtPassward.setText(" ");

                }









            }
        });














    }
}