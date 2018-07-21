package com.example.rathana.tweenanimationdemo;

import android.support.annotation.AnimRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private View circle1;
    private Button btnFadeIn,btnFadeOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circle1=findViewById(R.id.circle1);
        btnFadeIn=findViewById(R.id.btnFadeIn);
        btnFadeOut =findViewById(R.id.btnFadeOut);

        /*circle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setupAnimation(v,R.anim.fade_out);
            }
        });*/

        btnFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setupAnimation(circle1,R.anim.fade_out);
            }
        });

        btnFadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setupAnimation(circle1,R.anim.fade_in);
            }
        });
    }

    private void setupAnimation(View view,@AnimRes int res){
        Animation anim= AnimationUtils.loadAnimation(this,res);
        view.startAnimation(anim);

    }


}
