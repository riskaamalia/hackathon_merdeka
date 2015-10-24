package com.example.sabdamaulidk.tes;

/**
 * Created by Sabda Maulid K on 24/10/2015.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Form3Activity extends AppCompatActivity {
    private TextView lbl_kelpel, lbl_jenpel, lbl_krono;
    private String krono, kelpel, jenpel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_3);

        Button btn1 =(Button)findViewById(R.id.kembali_edit_button);
        Button btn2 =(Button)findViewById(R.id.kirim_button);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent keli = new Intent(Form3Activity.this, Form2Activity.class);
                startActivity(keli);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent keli = new Intent(Form3Activity.this, Form6Activity.class);
                startActivity(keli);

            }
        });

        lbl_kelpel = (TextView) findViewById(R.id.isi_kelompok);
        lbl_jenpel = (TextView) findViewById(R.id.isi_jenpel);
        lbl_krono  = (TextView) findViewById(R.id.isi_kronologi);
        getParams();

    }

    private void getParams(){
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            krono = extras.getString("krono");
            kelpel = extras.getString("kel_pel");
            jenpel = extras.getString("jen_pel");
        }
        lbl_kelpel.setText(kelpel);
        lbl_jenpel.setText(jenpel);
        lbl_krono.setText(krono);
    }


}