package com.example.pythagorean_theorm_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    private EditText adeg;
    private EditText bdeg;
    private TextView cdeg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.cdeg.setText("0");
        this.adeg = this.findViewById(R.id.adeg);
        this.bdeg = this.findViewById(R.id.bdeg);
        this.cdeg = this.findViewById(R.id.cdeg);

    }

    // penis
    // PENIS

    public void onCalcButtonClicked(View v)
    {

        Integer aValue = Integer.valueOf(adeg.getText().toString());
        Integer bValue = Integer.valueOf(bdeg.getText().toString());

        int cValue;

        cValue = (aValue * aValue) + (bValue * bValue);
        double answer = Math.sqrt(cValue);

        this.cdeg.setText((int) answer);
    }

}
