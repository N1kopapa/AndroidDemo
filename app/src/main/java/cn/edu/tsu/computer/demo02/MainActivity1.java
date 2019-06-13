package cn.edu.tsu.computer.demo02;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity1  extends AppCompatActivity { int[] imageIds = new int[]
        {


                R.drawable.a1,
                R.drawable.a2,
                R.drawable.a3,
                R.drawable.a4,
        };
    int currentImageId = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.action_main1);

        final ImageView show = (ImageView) findViewById(R.id.show);
        final Handler myHandler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {

                if (msg.what == 0x1233)
                {

                    show.setImageResource(imageIds[currentImageId++ % imageIds.length]);
                }
            }
        };

        new Timer().schedule(new TimerTask()
        {
            @Override
            public void run()
            {

                myHandler.sendEmptyMessage(0x1233);
            }
        }, 0,1000);
    }


    public void    pro1_backup(View v){
        Intent intent1=new Intent(MainActivity1.this,MainActivity.class);
        startActivity(intent1);
        finish();
    }

}