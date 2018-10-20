package com.suleman.call;

import android.animation.AnimatorSet;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
//    public class MainActivity extends AppCompatActivity implements Animation.AnimationListener{
    ImageView ivCallEnd;
    ImageView ivCallStart;
    ImageView ivMessage;
    Animation animMoveTop;
    Animation animMoveBottom;
    AnimationSet animationSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivCallEnd = (ImageView)findViewById(R.id.ivCallEnd);
        ivCallStart = (ImageView)findViewById(R.id.ivCallStart);
        ivMessage = (ImageView)findViewById(R.id.ivMessage);
        animationSet = new AnimationSet(true);
        animMoveTop = AnimationUtils.loadAnimation(this,R.anim.move_top);
        animMoveBottom = AnimationUtils.loadAnimation(this,R.anim.move_bottom);
        animationSet.addAnimation(animMoveTop);

        animationSet.addAnimation(animMoveBottom);
        //        animationSet.setRepeatCount(1);
//        animationSet.setRepeatMode(Animation.INFINITE);
        animationSet.start();
        ivCallStart.setAnimation(animationSet);
        ivCallEnd.setAnimation(animationSet);
        ivMessage.setAnimation(animationSet);

        //        animMoveTop = AnimationUtils.loadAnimation(this,R.anim.move_top);
//        animMoveTop.setAnimationListener(this);
//        ivCallEnd.setAnimation(animMoveTop);
    }
}

