package com.example.elm.three;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ImageThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_three);
    }

    public void threeBack(View view){
        Intent intent=new Intent(ImageThree.this, MainActivity.class);
        startActivity(intent);
    }
}