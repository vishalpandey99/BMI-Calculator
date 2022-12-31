package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
private EditText edtWeight, edtHeightF, edtHeightIn;
private Button btnBMI;
private TextView textResult;
private LinearLayout linaer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtWeight = findViewById(R.id.edtWeight);
        edtHeightF = findViewById(R.id.edtHeightF);
        edtHeightIn = findViewById(R.id.edtHeightIn);
        btnBMI = findViewById(R.id.btnBMI);
        textResult = findViewById(R.id.textResult);
        linaer = findViewById(R.id.linaer);

        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int weight = Integer.parseInt(edtWeight.getText().toString());
                int HeightF = Integer.parseInt(edtHeightF.getText().toString());
                int HeightIn = Integer.parseInt(edtHeightIn.getText().toString());

                int totalInch = HeightF*12+HeightIn;
                double totalCm = totalInch*2.53;
                double totalM = totalCm/100;
                double bmi = weight/(totalM*totalM);

                if (bmi>25){

                    textResult.setText("Your Are Over Weight");
                    linaer.setBackgroundColor(getResources().getColor(R.color.red));
                }
                else if (bmi<18){
                    textResult.setText("You are Under Weight");
                    linaer.setBackgroundColor(getResources().getColor(R.color.orange));
                }
                else
                {
                    textResult.setText("You are Healthy");
                    linaer.setBackgroundColor(getResources().getColor(R.color.yellow));
                }
            }
        });

    }
}