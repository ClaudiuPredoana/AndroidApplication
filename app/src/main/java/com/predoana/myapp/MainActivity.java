package com.predoana.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        final EditText editText = findViewById(R.id.editText);

        Button button = findViewById(R.id.buttonTalk);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String currentText = editText.getText().toString();
                Toast.makeText(MainActivity.this, currentText , Toast.LENGTH_SHORT).show();
            }
        });
    }
}

