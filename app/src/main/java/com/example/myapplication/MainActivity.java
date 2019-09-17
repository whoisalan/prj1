package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "kkll";
    TextView out;
    EditText input;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newlayout);

        out  = findViewById(R.id.textView);

        out.setText("kkkkk");

        input =  findViewById(R.id.textView2);
        String str = input.getText().toString();

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public void onClick(View v) {
        Log.i("aaa","onClick:");
        String str = input.getText().toString();
        out.setText(str);
    }
}
