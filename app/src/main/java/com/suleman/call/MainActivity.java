package com.suleman.call;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{
//    public class MainActivity extends AppCompatActivity implements Animation.AnimationListener{
    ImageView ivCallEnd;
    Animation animMoveTop;
    Animation animMoveBottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivCallEnd = (ImageView)findViewById(R.id.ivCallEnd);
        animMoveTop = AnimationUtils.loadAnimation(this,R.anim.move_top);
        animMoveBottom = AnimationUtils.loadAnimation(this,R.anim.move_bottom);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(animMoveTop);
        animationSet.addAnimation(animMoveBottom);
        ivCallEnd.startAnimation(animationSet);
//        animMoveTop = AnimationUtils.loadAnimation(this,R.anim.move_top);
//        animMoveTop.setAnimationListener(this);
//        ivCallEnd.setAnimation(animMoveTop);
    }
//
//    @Override
//    public void onAnimationStart(Animation animation) {
//
//    }
//
//    @Override
//    public void onAnimationEnd(Animation animation) {
//        Toast.makeText(MainActivity.this,"Animation Stopped",Toast.LENGTH_SHORT).show();
//
//    }
//
//    @Override
//    public void onAnimationRepeat(Animation animation) {
//
//    }
}
