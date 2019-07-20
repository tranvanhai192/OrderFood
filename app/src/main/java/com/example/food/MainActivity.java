package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtname, edtpass;
    private Button btnlogin;
    private TextView info;
    private int counter = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        info.setText("Bạn có 3 lần nhập tài khoản : 3");
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuly(edtname.getText().toString(),edtpass.getText().toString());

            }
        });

    }
    private void anhxa() {
        edtname = (EditText) findViewById(R.id.edtname);
        edtpass = (EditText) findViewById(R.id.edtpass);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        info = (TextView) findViewById(R.id.info);
    }
    private void xuly(String edtname, String edtpass){
        if ((edtname.equals("admin") && edtpass.equals("1234"))){
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }else {
            counter--;
            info.setText("Bạn có 3 lần nhập tài khoản"+String.valueOf(counter));
            if (counter ==0){
                btnlogin.setEnabled(false);
            }
        }
    }
}


