package cn.edu.tsu.computer.demo02;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3  extends AppCompatActivity {  public Button yi,er,san,si,wu,liu,qi,ba,jiu,ling,jia,jian,cheng,chu,dengyu,qingchu,dian,zheng;
    public TextView jisuanyi,jisuaner,guocheng,jieguo;
    double Re=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.action_main3);

        jisuanyi=(TextView)findViewById(R.id.jisuanyi);
        jisuaner=(TextView)findViewById(R.id.jisuaner);
        guocheng=(TextView)findViewById(R.id.guocheng);
        jieguo=(TextView)findViewById(R.id.jieguo);

        yi=(Button)findViewById(R.id.yi);
        er=(Button)findViewById(R.id.er);
        san=(Button)findViewById(R.id.san);
        si=(Button)findViewById(R.id.si);
        wu=(Button)findViewById(R.id.wu);
        liu=(Button)findViewById(R.id.liu);
        qi=(Button)findViewById(R.id.qi);
        ba=(Button)findViewById(R.id.ba);
        jiu=(Button)findViewById(R.id.jiu);
        ling=(Button)findViewById(R.id.ling);
        jia=(Button)findViewById(R.id.jia);
        jian=(Button)findViewById(R.id.jian);
        cheng=(Button)findViewById(R.id.cheng);;
        chu=(Button)findViewById(R.id.chu);
        dengyu=(Button)findViewById(R.id.dengyu);
        dian=(Button)findViewById(R.id.dian);
        qingchu=(Button)findViewById(R.id.qingchu);
        zheng=(Button)findViewById(R.id.zheng);

        View.OnClickListener onClickListener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.yi:
                        if(guocheng.getText().toString().equals("")){
                            jisuanyi.setText(jisuanyi.getText().toString()+yi.getText().toString());
                        }
                        else {
                            jisuaner.setText(jisuaner.getText().toString()+yi.getText().toString());
                        }
                        break;
                    case R.id.er:
                        if(guocheng.getText().toString().equals("")){
                            jisuanyi.setText(jisuanyi.getText().toString()+er.getText().toString());
                        }
                        else {
                            jisuaner.setText(jisuaner.getText().toString()+er.getText().toString());
                        }
                        break;
                    case R.id.san:
                        if(guocheng.getText().toString().equals("")){
                            jisuanyi.setText(jisuanyi.getText().toString()+san.getText().toString());
                        }
                        else {
                            jisuaner.setText(jisuaner.getText().toString()+san.getText().toString());
                        }
                        break;
                    case R.id.si:
                        if(guocheng.getText().toString().equals("")){
                            jisuanyi.setText(jisuanyi.getText().toString()+si.getText().toString());
                        }
                        else {
                            jisuaner.setText(jisuaner.getText().toString()+si.getText().toString());
                        }
                        break;
                    case R.id.wu:
                        if(guocheng.getText().toString().equals("")){
                            jisuanyi.setText(jisuanyi.getText().toString()+wu.getText().toString());
                        }
                        else {
                            jisuaner.setText(jisuaner.getText().toString()+wu.getText().toString());
                        }
                        break;
                    case R.id.liu:
                        if(guocheng.getText().toString().equals("")){
                            jisuanyi.setText(jisuanyi.getText().toString()+liu.getText().toString());
                        }
                        else {
                            jisuaner.setText(jisuaner.getText().toString()+liu.getText().toString());
                        }
                        break;
                    case R.id.qi:
                        if(guocheng.getText().toString().equals("")){
                            jisuanyi.setText(jisuanyi.getText().toString()+qi.getText().toString());
                        }
                        else {
                            jisuaner.setText(jisuaner.getText().toString()+qi.getText().toString());
                        }
                        break;
                    case R.id.ba:
                        if(guocheng.getText().toString().equals("")){
                            jisuanyi.setText(jisuanyi.getText().toString()+ba.getText().toString());
                        }
                        else {
                            jisuaner.setText(jisuaner.getText().toString()+ba.getText().toString());
                        }
                        break;
                    case R.id.jiu:
                        if(guocheng.getText().toString().equals("")){
                            jisuanyi.setText(jisuanyi.getText().toString()+jiu.getText().toString());
                        }
                        else {
                            jisuaner.setText(jisuaner.getText().toString()+jiu.getText().toString());
                        }
                        break;
                    case R.id.ling:
                        if(guocheng.getText().toString().equals("")){
                            jisuanyi.setText(jisuanyi.getText().toString()+ling.getText().toString());
                        }
                        else {
                            jisuaner.setText(jisuaner.getText().toString()+ling.getText().toString());
                        }
                        break;
                    case R.id.jia:
                        if (jieguo.getText().toString().equals("")){
                            guocheng.setText(jia.getText().toString());
                        }
                        else  if(!jieguo.getText().toString().equals("")){
                            jisuaner.setText("");
                            guocheng.setText(jia.getText().toString());
                            jisuanyi.setText(Double.toString(Re));
                        }
                        break;
                    case R.id.jian:
                        if (jieguo.getText().toString().equals("")){
                            guocheng.setText(jian.getText().toString());
                        }
                        else  if(!jieguo.getText().toString().equals("")){
                            jisuaner.setText("");
                            guocheng.setText(jian.getText().toString());
                            jisuanyi.setText(Double.toString(Re));
                        }
                        break;
                    case R.id.cheng:
                        if (jieguo.getText().toString().equals("")){
                            guocheng.setText(cheng.getText().toString());
                        }
                        else  if(!jieguo.getText().toString().equals("")){
                            jisuaner.setText("");
                            guocheng.setText(cheng.getText().toString());
                            jisuanyi.setText(Double.toString(Re));
                        }
                        break;
                    case R.id.chu:
                        if (jieguo.getText().toString().equals("")){
                            guocheng.setText(chu.getText().toString());
                        }
                        else  if(!jieguo.getText().toString().equals("")){
                            jisuaner.setText("");
                            guocheng.setText(chu.getText().toString());
                            jisuanyi.setText(Double.toString(Re));
                        }
                        break;
                    case R.id.dian:
                        if(guocheng.getText().toString().equals("")){
                            jisuanyi.setText(jisuanyi.getText().toString()+dian.getText().toString());
                        }
                        else {
                            jisuaner.setText(jisuaner.getText().toString()+dian.getText().toString());
                        }
                        break;
                    case R.id.zheng:
                        if(guocheng.getText().toString().equals("")){
                            jisuanyi.setText("-"+jisuanyi.getText().toString());
                        }
                        else {
                            jisuaner.setText("-"+jisuaner.getText().toString());
                        }
                        break;
                    case R.id.qingchu:
                        jisuanyi.setText("");
                        jisuaner.setText("");
                        guocheng.setText("");
                        jieguo.setText("");
                        break;
                    case R.id.dengyu:
                        String one=jisuanyi.getText().toString();
                        String two=jisuaner.getText().toString();
                        Double oneone;
                        Double twotwo;

                        if (jisuanyi.getText().toString().equals("")){
                            oneone=0.0;
                        }
                        else {
                            oneone=Double.parseDouble(one);
                        }
                        if (jisuaner.getText().toString().equals("")){
                            twotwo=0.0;
                        }
                        else {
                            twotwo=Double.parseDouble(two);
                        }
                        try{
                            if(jisuanyi.getText().toString().equals("")||jisuaner.getText().toString().equals("")||guocheng.getText().toString().equals("")){
                                jieguo.setText("请检查你的计算公式是否完整");
                            }
                            else {
                                if(guocheng.getText().toString().equals("+")&&jieguo.getText().toString().equals("")){
                                    Re=oneone+twotwo;
                                    jieguo.setText("="+Double.toString(Re));
                                }
                                else if(guocheng.getText().toString().equals("+")&&!jieguo.getText().toString().equals("")){
                                    jisuanyi.setText(Double.toString(Re));
                                    oneone=Re;
                                    Re=oneone+twotwo;
                                    jieguo.setText("="+Double.toString(Re));
                                }
                                if(guocheng.getText().toString().equals("-")){
                                    Re=oneone-twotwo;
                                    jieguo.setText("="+Double.toString(Re));
                                }
                                if(guocheng.getText().toString().equals("*")){
                                    Re=oneone*twotwo;
                                    jieguo.setText("="+Double.toString(Re));
                                }
                                if(guocheng.getText().toString().equals("/")){
                                    Re=oneone/twotwo;
                                    jieguo.setText("="+Double.toString(Re));
                                }
                                if(Double.parseDouble(jisuaner.getText().toString())==0){
                                    jieguo.setText("不能被零除");
                                }
                            }
                        }
                        catch (NumberFormatException e){
                            throw e;
                        }
                        break;
                }
            }
        };
        yi.setOnClickListener(onClickListener);
        er.setOnClickListener(onClickListener);
        san.setOnClickListener(onClickListener);
        si.setOnClickListener(onClickListener);
        wu.setOnClickListener(onClickListener);
        liu.setOnClickListener(onClickListener);
        qi.setOnClickListener(onClickListener);
        ba.setOnClickListener(onClickListener);
        jiu.setOnClickListener(onClickListener);
        ling.setOnClickListener(onClickListener);
        jia.setOnClickListener(onClickListener);
        jian.setOnClickListener(onClickListener);
        cheng.setOnClickListener(onClickListener);
        chu.setOnClickListener(onClickListener);
        qingchu.setOnClickListener(onClickListener);
        dengyu.setOnClickListener(onClickListener);
        dian.setOnClickListener(onClickListener);
        zheng.setOnClickListener(onClickListener);
    }
    public void    pro3_backup(View v){
        Intent intent3=new Intent(MainActivity3.this,MainActivity.class);
        startActivity(intent3);
        finish();
    }
}
