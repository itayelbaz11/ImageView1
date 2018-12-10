package com.example.itay.imageviewproject1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
ImageView IV;
Button btn;
Random rnd=new Random();
int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IV=(ImageView) findViewById(R.id.IV);
        btn=(Button) findViewById(R.id.btn);
    }

    public void btn(View view) {
        x=rnd.nextInt(3)+1;
        switch (x){
            case 1: btn.setText("1");
                    IV.setImageResource(R.drawable.picone);
                    break;
            case 2: btn.setText("2");
                    IV.setImageResource(R.drawable.pictwo);
                    break;
            case 3: btn.setText("3");
                    IV.setImageResource(R.drawable.picthree);
                    break;
        }
    }
}
