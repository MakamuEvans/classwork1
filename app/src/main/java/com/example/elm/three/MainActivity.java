package com.example.elm.three;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void imageOne(View view){
        Intent intent=new Intent(MainActivity.this, ImageOne.class);
        startActivity(intent);
    }

    public void imageTwo(View view){
        Intent intent=new Intent(MainActivity.this, ImageTwo.class);
        startActivity(intent);
    }

    public void imageThree(View view){
        Intent intent=new Intent(MainActivity.this, ImageThree.class);
        startActivity(intent);
    }


}
