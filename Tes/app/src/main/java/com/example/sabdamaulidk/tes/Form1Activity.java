package com.example.sabdamaulidk.tes;

/**
 * Created by Sabda Maulid K on 24/10/2015.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Form1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_1);

        Button btn1 =(Button)findViewById(R.id.mulai_pelaporan);
        Button btn2 =(Button)findViewById(R.id.status_laporan_button);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent keli = new Intent(Form1Activity.this, Form2Activity.class);
                startActivity(keli);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent keli = new Intent(Form1Activity.this, Form5Activity.class);
                startActivity(keli);

            }
        });

    }


}