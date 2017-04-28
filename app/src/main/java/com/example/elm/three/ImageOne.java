package com.example.elm.three;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ImageOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_one);


    }

    public void oneBack(View view){
        Intent intent=new Intent(ImageOne.this, MainActivity.class);
        startActivity(intent);
    }
}
