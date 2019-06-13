package cn.edu.tsu.computer.demo02;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
            return super.onOptionsItemSelected(item);
        }


        public void pro1 (View v){
            // TODO Auto-generated method stub
            //使用对话框
            AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
            dialog.setTitle("提示");
            dialog.setCancelable(true);
            dialog.setMessage("电子相册入口");
            dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // TODO Auto-generated method stub
                    //相应的处理操作
                    Intent intent1 = new Intent(MainActivity.this, MainActivity1.class);

                    // 启动
                    startActivity(intent1);
                    finish();
                }
            });
            dialog.show();

/*不使用对话框
        Intent intent1=new Intent(MainActivity.this,MainActivity1.class);
        //此处可以加入Bundle，传递数据
        Bundle bundle1=new Bundle();
        String str="要传入的数据";
        int i=100;
        bundle1.putInt("int1",i);
        bundle1.putString("str1",str);
        intent1.putExtras(bundle1);
        startActivity(intent1);
        finish();

*/
        }

        public void pro2 (View v){
            Intent intent2 = new Intent(MainActivity.this, MainActivity2.class);
            // 启动
            startActivity(intent2);
            finish();
        }


        public void pro3 (View v){
            Intent intent3 = new Intent(MainActivity.this, MainActivity3.class);
            // 启动
            startActivity(intent3);
            finish();
        }


        public void pro4 (View v){
            Intent intent4 = new Intent(MainActivity.this, MainActivity4.class);
            // 启动
            startActivity(intent4);
            finish();
        }


        public void imageClick (View v){
            // TODO Auto-generated method stub
            AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
            dialog.setTitle("提示");
            dialog.setCancelable(true);
            dialog.setMessage("这是使用的自定义图标定义的图形按钮");
            dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // TODO Auto-generated method stub
                    //相应的处理操作
                }
            });
            dialog.show();
        }

        //自定义图标定义的【普通】按钮
    public void imageClick01 (View v){
        // TODO Auto-generated method stub
        //ImageButton ib01=(ImageButton)findViewById(R.id.ib01);
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("提示");
        dialog.setCancelable(true);
        dialog.setMessage("这是使用的自定义图标定义的【普通】按钮");
        dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
                //相应的处理操作

            }
        });
        dialog.show();
    }


    public void pro5(View v){
        finish();
    }

}

