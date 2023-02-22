package com.example.voltenprocductprice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private TextView txt_single;
    private ImageView Img_Single;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txt_single = (TextView) findViewById(R.id.txt_SDescription);
        Img_Single = (ImageView) findViewById(R.id.Thumbnail_Single);

        //Receive Data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("sTitle");
        int Thumbnail = intent.getExtras().getInt("sThumbnail");

        //Setting Value
        txt_single.setText(Title);
        Img_Single.setImageResource(Thumbnail);
    }
}