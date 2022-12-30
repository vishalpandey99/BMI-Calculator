package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private EditText edt_text1, edt_text2;
    private TextView txt_view;
    private MaterialButton add_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_text1 = findViewById(R.id.edt_text1);
        edt_text2 = findViewById(R.id.edt_text2);
        txt_view = findViewById(R.id.txt_view);
        add_btn = findViewById(R.id.add_btn);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edt_text1.getText().toString());
                int b = Integer.parseInt(edt_text2.getText().toString());
                int c = a+b;
                txt_view.setText("Answer Is " + c);
            }
        });
    }
}