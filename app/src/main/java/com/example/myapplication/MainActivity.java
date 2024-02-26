package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    EditText input;
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2 = (TextView)findViewById(R.id.textView2);
        input = (EditText)findViewById(R.id.input);
    }
    public void sendMessage(View view) {
        TextView textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.input);
        textView.setText("Добро пожаловать," + input.getText());
    }

    public void clicker(View view) {
        TextView textView2 = findViewById(R.id.textView2);
        count++;
        textView2.setText(Integer.toString(count));
    }
}