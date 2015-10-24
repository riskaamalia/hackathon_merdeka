package com.example.sabdamaulidk.tes;

/**
 * Created by Sabda Maulid K on 24/10/2015.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.EditText;
import android.content.Intent;
import android.widget.TextView;


public class Form2Activity extends AppCompatActivity {

    private RadioButton pribadi, publik, penipuan, hutan, rampok;
    private String kel_pel = "";
    private String jen_pel = "";
    private EditText kronologi;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_2);

        pribadi = (RadioButton) findViewById(R.id.pribadi_radio);
        publik = (RadioButton) findViewById(R.id.publik_radio);
        penipuan = (RadioButton) findViewById(R.id.penipuan_radio_btn);
        hutan = (RadioButton) findViewById(R.id.hutan_radio);
        rampok = (RadioButton) findViewById(R.id.rampok_radio);
        kronologi = (EditText) findViewById(R.id.kronologi_text);
        Button btn1 =(Button)findViewById(R.id.submit_data_button);

        /*btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent keli = new Intent(Form2Activity.this, Form3Activity.class);
                startActivity(keli);

            }
        });*/

       btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kirimParams();
            }
        });
    }
    private void kirimParams(){
        if (pribadi.isChecked()) {
            kel_pel = "Pribadi";
        }
        if (publik.isChecked()) {
            kel_pel = "Publik";
        }

        if (penipuan.isChecked()) {
            jen_pel = "Penipuan";
        }
        if (hutan.isChecked()) {
            jen_pel = "Pembakaran Hutan";
        }
        if (rampok.isChecked()) {
            jen_pel = "Rampok, Copet";
        }

        Intent i = new Intent(Form2Activity.this, Form3Activity.class);
        i.putExtra("krono", kronologi.getText().toString());
        i.putExtra("kelpel", kel_pel);
        i.putExtra("jenpel", jen_pel);
        startActivity(i);
    }


}