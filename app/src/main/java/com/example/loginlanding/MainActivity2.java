package com.example.loginlanding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private void toastMaker(String val){
        Toast t = Toast.makeText(this.getApplicationContext(), val, Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER_VERTICAL,0,0);
        t.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toastMaker("Welcome din_djarin!");

    }

}