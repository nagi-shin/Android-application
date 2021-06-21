package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;
import android.os.Bundle;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText et;
    TextView tv;
    Double a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=(EditText) findViewById(R.id.editText);
        b1=(Button) findViewById(R.id.button);
        tv=(TextView) findViewById(R.id.textView);

        Random r = new Random();
        int low = 1;
        int high = 101;
        int result = r.nextInt(high-low) + low;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(et.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please enter a number.",Toast.LENGTH_SHORT).show();
                }

                else
                {
                    a=Double.parseDouble(String.valueOf(et.getText()));
                    if( result > a)
                    {
                        String r=String.valueOf(a);
                        Toast.makeText(MainActivity.this,"The Answer Number is bigger than "+r,Toast.LENGTH_SHORT).show();
                    }
                    else if( result < a)
                    {
                        String r=String.valueOf(a);
                        Toast.makeText(MainActivity.this,"The Answer Number is smaller than "+r,Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        String r=String.valueOf(a);
                        tv.setText("Congratulations! The Answer Number is "+ r +"!" );
                    }
                }
            }
        });
    }
}