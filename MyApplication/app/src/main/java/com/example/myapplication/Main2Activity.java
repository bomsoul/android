package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        int input = getIntent().getExtras().getInt("number");
//        Log.i("dd","input is" + input);
    }

    public void clk2(View view){
        int input = getIntent().getExtras().getInt("number");
        Intent intent = new Intent();
        intent.putExtra("number",input+1);
        setResult(RESULT_OK,intent);

        finish();
    }

    public void clk3(View view){
        int input = getIntent().getExtras().getInt("number");
        Intent intent = new Intent();
        intent.putExtra("number",input+2);
        setResult(RESULT_OK,intent);

        finish();
    }
}
