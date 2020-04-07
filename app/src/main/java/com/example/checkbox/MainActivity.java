package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox one,two,three,four;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =findViewById(R.id.button);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder builder=new StringBuilder();
                builder.append("Item selected:");
                int total=0;
                if(one.isChecked())
                {
                    builder.append("\n Pizza:Rs.60");
                    total=+60;

                }
                if(two.isChecked())
                {
                    builder.append("\n Burger:Rs.40");

                    total=+40;

                }
                if(three.isChecked())
                {
                    total=+50;
                    builder.append("\n Hot Dog:Rs.50");

                }
                if(four.isChecked())
                {
                    builder.append("\n Veg. Pasta:Rs.70");

                    total=+70;

                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Nothing Selected", Toast.LENGTH_SHORT).show();
                }
                builder.append("\n Total Order of Rs." +total);
                Toast.makeText(getApplicationContext(), builder.toString(), Toast.LENGTH_SHORT).show();

            }
        });

    }
}
