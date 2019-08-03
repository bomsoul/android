package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void clk4(View view){
        int input = getIntent().getExtras().getInt("number");
        Intent intent = new Intent();
        String num = input+"";
        intent.putExtra("number",num.length());
        setResult(RESULT_OK,intent);

        finish();
    }
}
