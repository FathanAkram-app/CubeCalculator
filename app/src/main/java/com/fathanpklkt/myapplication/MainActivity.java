package com.fathanpklkt.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText ETpanjang, ETlebar, ETtinggi;
    private Button btnhitung;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ETpanjang = findViewById(R.id.edt_length);
        ETlebar = findViewById(R.id.edt_width);
        ETtinggi =findViewById(R.id.edt_height);
        btnhitung = findViewById(R.id.btn_calculate);
        hasil = findViewById(R.id.tv_result);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer panjang = Integer.parseInt(ETpanjang.getText().toString());
                Integer lebar = Integer.parseInt(ETlebar.getText().toString());
                Integer tinggi = Integer.parseInt(ETtinggi.getText().toString());
                hasil.setText(String.valueOf(panjang * lebar * tinggi));
            }
        });
    }
}