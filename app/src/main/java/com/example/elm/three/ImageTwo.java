package com.example.elm.three;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ImageTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_two);
    }

    public void twoBack(View view){
        Intent intent=new Intent(ImageTwo.this, MainActivity.class);
        startActivity(intent);
    }
}
