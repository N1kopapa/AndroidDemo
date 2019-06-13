package cn.edu.tsu.computer.demo02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;


public class MainActivity2  extends AppCompatActivity {
    protected void hideBottomUIMenu() {
        //隐藏虚拟按键，并且全屏
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    private SoundPool mPool;//声明一个SoundPool
    private int soundID[] = new int[21];//创建某个声音对应的音频ID

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        this.hideBottomUIMenu();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//设置全屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.action_main2);


        Button mTitle = findViewById(R.id.img_title);

        Button mB1 = findViewById(R.id.b1);
        Button mB2 = findViewById(R.id.b2);
        Button mB3 = findViewById(R.id.b3);
        Button mB4 = findViewById(R.id.b4);
        Button mB5 = findViewById(R.id.b5);
        Button mB6 = findViewById(R.id.b6);
        Button mB7 = findViewById(R.id.b7);
        Button mB8 = findViewById(R.id.b8);
        Button mB9 = findViewById(R.id.b9);
        Button mB10 = findViewById(R.id.b10);
        Button mB11 = findViewById(R.id.b11);
        Button mB12 = findViewById(R.id.b12);

        Button mHb1 = findViewById(R.id.hb1);
        Button mHb2 = findViewById(R.id.hb2);
        Button mHb3 = findViewById(R.id.hb3);
        Button mHb4 = findViewById(R.id.hb4);
        Button mHb5 = findViewById(R.id.hb5);
        Button mHb6 = findViewById(R.id.hb6);
        Button mHb7 = findViewById(R.id.hb7);
        Button mHb8 = findViewById(R.id.hb8);



        mPool = new SoundPool(10, AudioManager.STREAM_SYSTEM, 5);
        //第一个参数为同时播放数据流的最大个数，第二数据流类型，第三为声音质量
        soundID[0] = mPool.load(this, R.raw.d52, 1);
        soundID[1] = mPool.load(this, R.raw.d53, 1);
        soundID[2] = mPool.load(this, R.raw.d54, 1);
        soundID[3] = mPool.load(this, R.raw.d55, 1);
        soundID[4] = mPool.load(this, R.raw.d56, 1);
        soundID[5] = mPool.load(this, R.raw.d57, 1);
        soundID[6] = mPool.load(this, R.raw.d58, 1);
        soundID[7] = mPool.load(this, R.raw.d59, 1);
        soundID[8] = mPool.load(this, R.raw.d60, 1);
        soundID[9] = mPool.load(this, R.raw.d61, 1);
        soundID[10] = mPool.load(this, R.raw.d62, 1);
        soundID[11] = mPool.load(this, R.raw.d63, 1);
        soundID[12] = mPool.load(this, R.raw.d64, 1);
        soundID[13] = mPool.load(this, R.raw.d65, 1);
        soundID[14] = mPool.load(this, R.raw.d66, 1);
        soundID[15] = mPool.load(this, R.raw.d67, 1);
        soundID[16] = mPool.load(this, R.raw.d68, 1);
        soundID[17] = mPool.load(this, R.raw.d69, 1);
        soundID[18] = mPool.load(this, R.raw.d70, 1);
        soundID[19] = mPool.load(this, R.raw.d71, 1);
//        soundID[20] = mPool.load(this, R.raw.d72, 1);
//
        mB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPool.play(soundID[0], 1, 1, 0, 0, 1);
            }
        });
        mB1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                mPool.play(soundID[0], 1, 1, 0, 0, 1);
                return true;
            }
        });
        mB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPool.play(soundID[1], 1, 1, 0, 0, 1);
            }
        });
        mB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPool.play(soundID[2], 1, 1, 0, 0, 1);
            }
        });
        mB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPool.play(soundID[3], 1, 1, 0, 0, 1);
            }
        });
        mB5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPool.play(soundID[4], 1, 1, 0, 0, 1);
            }
        });
        mB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPool.play(soundID[5], 1, 1, 0, 0, 1);
            }
        });
        mB7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPool.play(soundID[6], 1, 1, 0, 0, 1);
            }
        });
        mB8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPool.play(soundID[7], 1, 1, 0, 0, 1);
            }
        });
        mB9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPool.play(soundID[8], 1, 1, 0, 0, 1);
            }
        });
        mB10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPool.play(soundID[9], 1, 1, 0, 0, 1);
            }
        });
        mB11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPool.play(soundID[10], 1, 1, 0, 0, 1);
            }
        });
        mB12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPool.play(soundID[11], 1, 1, 0, 0, 1);
            }
        });
        mHb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPool.play(soundID[12], 1, 1, 0, 0, 1);
            }
        });
        mHb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPool.play(soundID[13], 1, 1, 0, 0, 1);
            }
        });
        mHb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPool.play(soundID[14], 1, 1, 0, 0, 1);
            }
        });
        mHb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPool.play(soundID[15], 1, 1, 0, 0, 1);
            }
        });
        mHb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPool.play(soundID[16], 1, 1, 0, 0, 1);
            }
        });
        mHb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPool.play(soundID[17], 1, 1, 0, 0, 1);
            }
        });
        mHb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPool.play(soundID[18], 1, 1, 0, 0, 1);
            }
        });
        mHb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPool.play(soundID[19], 1, 1, 0, 0, 1);
            }
        });


        mTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent5);
                finish();
            }
        });
    }



    public void  pro2_look(View v){
    }
    public void    pro2_backup(View v){
        Intent intent2=new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent2);
        finish();
    }


}