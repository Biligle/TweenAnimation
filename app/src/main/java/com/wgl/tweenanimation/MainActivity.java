package com.wgl.tweenanimation;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button translate, alpha, rotate, scale, all, interpolator, bounce, accelerateDecelerate, accelerate, decelerate, cycle, linear, anticipateOvershoot, anticipate, Overshoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        translate = (Button) findViewById(R.id.translate);
        alpha = (Button) findViewById(R.id.alpha);
        rotate = (Button) findViewById(R.id.rotate);
        scale = (Button) findViewById(R.id.scale);
        all = (Button) findViewById(R.id.all);
        interpolator = (Button) findViewById(R.id.interpolator);
        bounce = (Button) findViewById(R.id.bounce);
        accelerateDecelerate = (Button) findViewById(R.id.accelerateDecelerate);
        accelerate = (Button) findViewById(R.id.accelerate);
        decelerate = (Button) findViewById(R.id.decelerate);
        cycle = (Button) findViewById(R.id.cycle);
        linear = (Button) findViewById(R.id.linear);
        anticipateOvershoot = (Button) findViewById(R.id.anticipateOvershoot);
        anticipate = (Button) findViewById(R.id.anticipate);
        Overshoot = (Button) findViewById(R.id.Overshoot);
        translate.setOnClickListener(this);
        alpha.setOnClickListener(this);
        rotate.setOnClickListener(this);
        scale.setOnClickListener(this);
        all.setOnClickListener(this);
        bounce.setOnClickListener(this);
        accelerateDecelerate.setOnClickListener(this);
        accelerate.setOnClickListener(this);
        decelerate.setOnClickListener(this);
        cycle.setOnClickListener(this);
        linear.setOnClickListener(this);
        anticipateOvershoot.setOnClickListener(this);
        anticipate.setOnClickListener(this);
        Overshoot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.translate:
                Animation animation = AnimationUtils.loadAnimation(this,R.anim.translate);
                translate.startAnimation(animation);
                break;
            case R.id.alpha:
                Animation animation2 = AnimationUtils.loadAnimation(this,R.anim.alpha);
                alpha.startAnimation(animation2);
                break;
            case R.id.rotate:
                Animation animation3 = AnimationUtils.loadAnimation(this,R.anim.rotate);
                rotate.startAnimation(animation3);
                break;
            case R.id.scale:
                Animation animation4 = AnimationUtils.loadAnimation(this,R.anim.scale);
                scale.startAnimation(animation4);
                break;
            case R.id.all:
                Animation animation5 = AnimationUtils.loadAnimation(this,R.anim.set);
                all.startAnimation(animation5);
                break;
            case R.id.bounce:
                Animation animation6 = AnimationUtils.loadAnimation(this,R.anim.interpolator);
                animation6.setInterpolator(new BounceInterpolator());
                interpolator.startAnimation(animation6);
                break;
            case R.id.accelerateDecelerate:
                Animation animation7 = AnimationUtils.loadAnimation(this,R.anim.interpolator);
                animation7.setInterpolator(new AccelerateDecelerateInterpolator());
                interpolator.startAnimation(animation7);
                break;
            case R.id.accelerate:
                Animation animation8 = AnimationUtils.loadAnimation(this,R.anim.interpolator);
                animation8.setInterpolator(new AccelerateInterpolator());
                interpolator.startAnimation(animation8);
                break;
            case R.id.decelerate:
                Animation animation9 = AnimationUtils.loadAnimation(this,R.anim.interpolator);
                animation9.setInterpolator(new DecelerateInterpolator());
                interpolator.startAnimation(animation9);
                break;
            case R.id.cycle:
                Animation animation10 = AnimationUtils.loadAnimation(this,R.anim.interpolator);
                animation10.setInterpolator(new CycleInterpolator(3f));
                interpolator.startAnimation(animation10);
                break;
            case R.id.linear:
                Animation animation11 = AnimationUtils.loadAnimation(this,R.anim.interpolator);
                animation11.setInterpolator(new LinearInterpolator());
                interpolator.startAnimation(animation11);
                break;
            case R.id.anticipateOvershoot:
                Animation animation12 = AnimationUtils.loadAnimation(this,R.anim.interpolator);
                animation12.setInterpolator(new AnticipateOvershootInterpolator());
                interpolator.startAnimation(animation12);
                break;
            case R.id.anticipate:
                Animation animation13 = AnimationUtils.loadAnimation(this,R.anim.interpolator);
                animation13.setInterpolator(new AnticipateInterpolator());
                interpolator.startAnimation(animation13);
                break;
            case R.id.Overshoot:
                Animation animation14 = AnimationUtils.loadAnimation(this,R.anim.interpolator);
                animation14.setInterpolator(new OvershootInterpolator());
                interpolator.startAnimation(animation14);
                break;
        }
    }

}
