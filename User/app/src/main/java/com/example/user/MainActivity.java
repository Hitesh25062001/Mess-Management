package com.example.user;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    CardView ViewNotice ,AddComplaint;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewNotice =findViewById(R.id.ViewNotice);
        ViewNotice.setOnClickListener(this);

        AddComplaint =findViewById(R.id.AddComplaint);
        AddComplaint.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ViewNotice:
                Intent intent= new Intent(MainActivity.this,view_notice.class);
                startActivity(intent);
                break;

            case R.id.AddComplaint:
                Intent intent1= new Intent(MainActivity.this,add_complaint.class);
                startActivity(intent1);
                break;

        }
    }
}