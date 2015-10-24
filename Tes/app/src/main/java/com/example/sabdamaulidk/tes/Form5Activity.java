package com.example.sabdamaulidk.tes;

/**
 * Created by Sabda Maulid K on 24/10/2015.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Form5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_5);

        Button btn1 =(Button)findViewById(R.id.kembali_home_button);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent keli = new Intent(Form5Activity.this, Form1Activity.class);
                startActivity(keli);

            }
        });
    }


}