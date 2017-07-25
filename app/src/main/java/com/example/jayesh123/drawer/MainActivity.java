package com.example.jayesh123.drawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView t1 = (ImageView) findViewById(R.id.i1);
        Animation a1 = (AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade));
        t1.startAnimation(a1);
        Thread t = new Thread() {
            public void run() {
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    Intent i1 = new Intent(MainActivity.this, drawer.class);
                    startActivity(i1);
                    finish();

                }
            }

        };
        t.start();
    }

}