package com.example.multiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView result;
    Button mul,clr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        result=findViewById(R.id.result);
        mul=findViewById(R.id.mul);
        clr=findViewById(R.id.clr);

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().length()==0)
                {
                    e1.setText("0");
                }
                if (e2.getText().toString().length()==0)
                {
                    e2.setText("0");
                }
                Float v1= Float.valueOf(e1.getText().toString());
                Float v2= Float.valueOf(e2.getText().toString());

                Float mul=v1*v2;
                result.setText(String.valueOf(mul));
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
                e2.setText("");
                result.setText("");
            }
        });
    }
}