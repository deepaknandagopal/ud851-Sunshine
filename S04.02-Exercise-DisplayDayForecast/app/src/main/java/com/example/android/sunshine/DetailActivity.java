package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView detailTxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        if(intent.hasExtra(intent.EXTRA_TEXT))
        {
            String weatherDetail = intent.getStringExtra(intent.EXTRA_TEXT);
            detailTxtView = (TextView) findViewById(R.id.detailTextView);
            detailTxtView.setText(weatherDetail);
        }
        // Completed (2) Display the weather forecast that was passed from MainActivity
    }
}