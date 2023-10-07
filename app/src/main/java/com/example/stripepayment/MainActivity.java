package com.example.stripepayment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText amt;
    Button payBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amt = findViewById(R.id.amtValue);
        payBtn = findViewById(R.id.button);

        payBtn.setOnClickListener(v -> {
            String s = amt.getText().toString().trim();
            //long rAmt = Long.parseLong(s);

            if (s.length() == 0) {
                Toast.makeText(MainActivity.this, "Wrong Payment Value", Toast.LENGTH_SHORT).show();
            } else {
                if(Long.parseLong(s)==0) {
                    Toast.makeText(MainActivity.this, "zero amount can't be payed", Toast.LENGTH_SHORT).show();
                }
                else {

                }
            }
        });

    }
}