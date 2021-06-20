package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText et1, et2;
    Double a;
    Double b;
    TextView s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.editText1);
        et2=(EditText) findViewById(R.id.editText2);
        b1=(Button) findViewById(R.id.button);
        s=(TextView) findViewById(R.id.textView2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(et1.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please enter your weight",Toast.LENGTH_SHORT).show();
                }

                if(et2.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please enter your height",Toast.LENGTH_SHORT).show();
                }

                else
                {
                    a=Double.parseDouble(String.valueOf(et1.getText()));
                    b=Double.parseDouble(String.valueOf(et2.getText()));
                    Double c=a/(b*b);
                    String r=String.valueOf(c);
                    Toast.makeText(MainActivity.this,"Your BMI is"+r,Toast.LENGTH_LONG).show();
                    s.setText("Your BMI is "+ r );
                }
            }
        });
    }
}