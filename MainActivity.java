package com.example.cuteapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageButton blue, pink, green, yellow;
    TextView textView;
    String text;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        textView = findViewById(R.id.text_view);
        b = findViewById(R.id.ButtonClear);
        blue = findViewById(R.id.blue);
        pink = findViewById(R.id.pink);
        green = findViewById(R.id.green);
        yellow = findViewById(R.id.yellow);

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "You got nothing unfortunately!";
                textView.setText(text);
                textView.setTextColor(getResources().getColor(R.color.blueish));
                b.setBackgroundColor(getResources().getColor(R.color.blueish));
                b.setVisibility(View.VISIBLE);
            }
        });
        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "You got $200!";
                textView.setText(text);
                textView.setTextColor(getResources().getColor(R.color.pinkish));
                b.setBackgroundColor(getResources().getColor(R.color.pinkish));
                b.setVisibility(View.VISIBLE);
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "You got a new Tesla!";
                textView.setText(text);
                textView.setTextColor(getResources().getColor(R.color.greenish));
                b.setBackgroundColor(getResources().getColor(R.color.greenish));
                b.setVisibility(View.VISIBLE);
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "You got a new BMW!";
                textView.setText(text);
                textView.setTextColor(getResources().getColor(R.color.yellowish));
                b.setBackgroundColor(getResources().getColor(R.color.yellowish));
                b.setVisibility(View.VISIBLE);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Please Select One of The Presents");
                textView.setTextColor(getResources().getColor(R.color.redish));
                b.setVisibility(View.INVISIBLE);
            }
        });
    }
}
