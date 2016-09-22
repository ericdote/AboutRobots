package com.example.alumnedam.aboutrobots;

import android.content.pm.ActivityInfo;
import android.media.Image;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RobotsActivity extends AppCompatActivity implements View.OnClickListener {

    private int numeroVeces=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robots);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Button btnNoTocar = (Button) findViewById(R.id.btnnotocar);
        btnNoTocar.setOnClickListener(this);
        Button exit = (Button) findViewById(R.id.exit);
        exit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.btnnotocar) {
            Button btnNoTocar = (Button) v;
            numeroVeces++;
            if (numeroVeces == 1) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText(R.string.textView2);
                btnNoTocar.setText("Que no me toques");
                ImageView imageView = (ImageView) findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.robot2);
                imageView.setVisibility(View.VISIBLE);
            }
            else{
                btnNoTocar.setVisibility(View.INVISIBLE);
            }
        }
        if(v.getId()==R.id.exit) {
            System.exit(0);
        }
    }
}

