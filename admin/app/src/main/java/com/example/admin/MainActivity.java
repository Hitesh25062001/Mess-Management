package com.example.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView UploadNotice ,ViewComplaint ,UploadedNotice;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UploadNotice =findViewById(R.id.addNotice);
        UploadNotice.setOnClickListener(this);

        UploadedNotice = findViewById(R.id.uploadedNotice);
        UploadedNotice.setOnClickListener(this);

        ViewComplaint = findViewById(R.id.viewComplaint);
        ViewComplaint.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
    switch (view.getId()){
        case R.id.addNotice:
            Intent intent= new Intent(MainActivity.this,Upload_Notice.class);
            startActivity(intent);
            break;

        case R.id.uploadedNotice:
            Intent intent1= new Intent(MainActivity.this,uploaded_notice.class);
            startActivity(intent1);
            break;

        case R.id.viewComplaint:
            Intent intent2= new Intent(MainActivity.this, EditDelNot.class);
            startActivity(intent2);
            break;


    }
    }
}