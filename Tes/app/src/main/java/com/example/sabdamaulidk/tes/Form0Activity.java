package com.example.sabdamaulidk.tes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Form0Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_0);

        Button btn1 =(Button)findViewById(R.id.submit_button);
        Button btn2 =(Button)findViewById(R.id.tentang_button);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent keli = new Intent(Form0Activity.this, Form1Activity.class);
                startActivity(keli);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent keli = new Intent(Form0Activity.this, Form4Activity.class);
                startActivity(keli);

            }
        });

    }
}
