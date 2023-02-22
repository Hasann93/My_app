package com.example.voltenprocductprice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView tvtitle;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvtitle=(TextView)findViewById(R.id.txt_Description);
        img=(ImageView)findViewById(R.id.Thumbnail_Combo);

        Intent intent=getIntent();
        String Title=intent.getExtras().getString("Title");
        String Category=intent.getExtras().getString("Category");
        int image=intent.getExtras().getInt("Thumbnail");

        tvtitle.setText(Title);
        img.setImageResource(image);
    }
}