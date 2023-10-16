package com.example.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class uploaded_notice extends AppCompatActivity {

    Button Delete;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uploaded_notice);

        Delete = findViewById(R.id.delBtn);
        Delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(uploaded_notice.this, "Notice Deleted ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}