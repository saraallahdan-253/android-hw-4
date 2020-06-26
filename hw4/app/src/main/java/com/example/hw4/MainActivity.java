package com.example.hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Element;

import java.text.BreakIterator;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText a = findViewById(R.id.quizes15);
        final EditText b = findViewById(R.id.homework25);
        final EditText c = findViewById(R.id.midterm30);
        final EditText d = findViewById(R.id.final30);
        Button cal = findViewById(R.id.button);
        final Button re = findViewById(R.id.button2);
        final TextView e =findViewById(R.id.textView2);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float quize = Float.parseFloat(a.getText().toString());
                float hw = Float.parseFloat(b.getText().toString());
                float mt = Float.parseFloat(c.getText().toString());
                float fnl = Float.parseFloat(d.getText().toString());
                float grade = (quize + hw + mt + fnl );
                System.out.println(grade);


                if (grade >= 90)
                    e.setText("A");
                e.setTextColor(Color.GREEN);
                if (grade >= 80)
                    e.setText("B");
                e.setTextColor(Color.YELLOW);
                if (grade >= 70)
                    e.setText("C");
                e.setTextColor(Color.BLUE);
                if (grade >= 60)
                    e.setText("D");
                e.setTextColor(Color.RED);
                if (grade < 60)
                    e.setText("F");
                e.setTextColor(Color.GRAY);
            }

            });
                re.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        a.setText("");
                        b.setText("");
                        c.setText("");
                        d.setText("");


                    }


                });
            }
        }