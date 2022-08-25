package com.example.hellosbvc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  onButton1Clicked(View v) { //
      Toast.makeText(this, "Landon and Anthony are awesome!", Toast.LENGTH_LONG).show();

    }

    public void  onButton2Clicked(View v) { //Take an action to web address
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.valleycollege.edu"));
        startActivity(intent); // Activity driven program
    }

    public void  onButton3Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:989-123-4567"));
        startActivity(intent); // Activity driven program
    }


}