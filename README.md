# Android  FinalDemo





> 设计人：周旭  
>
> 学号：2016072053
>
> 班级：2016级软件工程本科二班



### 环境版本

```java
SdkVersion 28
Android Studio 3.3.1
Build #AI-182.5107.16.33.5264788, built on January 29, 2019
JRE: 1.8.0_152-release-1248-b01 amd64
JVM: OpenJDK 64-Bit Server VM by JetBrains s.r.o
Windows 10 10.0
```

具体的安装和运行环境和IDE不再赘述

### 文件目录

![目录](http://img.cdn.tsuzx.cn/blog/20190612/8SgL2HBcGWsy.png)

### Demo布局

这个demo集成了四个功能模块，分别是**泰山学院风景播放器、电子钢琴、小型计算器和全景Vr预览**

#### 整体布局

##### 界面设计

分为两部分，<LinearLayout>包裹了四个按钮<button> ，下方添加<ImageView>无实际功能

##### 功能设计

四个模块按钮对应onclick事件的监听，对应跳转不同界面

#### 功能模块1（风景播放器）

##### 界面设计

上下两部分，<ImageView>为主要显示窗口，<button>绑定返回主菜单，onclick为pro1_backup

```java
android:onClick="pro1_backup"
```

![图1](http://img.cdn.tsuzx.cn/blog/20190612/iWPD4iYRMQMp.png)

##### 功能设计

固定时间展示滚动图片代码

```java
final ImageView show = (ImageView) findViewById(R.id.show);//展示窗帘show
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
new Timer().schedule(new TimerTask()//固定滚动间隔时间
{
    @Override
    public void run()
    {
        myHandler.sendEmptyMessage(0x1233);
    }
}, 0,1000);
```



#### 功能模块2（电子钢琴）

##### 界面设计

置顶一个button插入图片作为title，并绑定title作为返回主菜单按钮，剩下的空间一次排布琴键

![图2](http://img.cdn.tsuzx.cn/blog/20190612/4C2n7EYd4OgR.png)

##### 功能设计

首先响应横屏，隐藏虚拟按键

```java
protected void hideBottomUIMenu() {
    //隐藏虚拟按键，并且全屏
    View decorView = getWindow().getDecorView();
    int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_FULLSCREEN;
    decorView.setSystemUiVisibility(uiOptions);
}
```

然后依次绑定声音和按键即可，

```java
mPool = new SoundPool(10, AudioManager.STREAM_SYSTEM, 5);
 //SoundPool的属性要注意第一个参数为同时播放数据流的最大个数，第二数据流类型，第三为声音质量
```

#### 功能模块3（计算器）

##### 界面设计

按键显示，逻辑运算，需要绑定大量id，这里不做赘述

![mark](http://img.cdn.tsuzx.cn/blog/20190612/cALEHewyisXg.png)

##### 功能界面

主要实现方式，监听每一个按钮的onclick，然后tostring到对应的textview中，之后检验等式的完整性这是很有必要的，上代码。

```java
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
```

最后做textvirw中的逻辑运算即可。

#### 功能模块4（全景Vr播放器）

这里是一个google的vr服务，在build.gradle中引入谷歌VR的SDK依赖

```xml
implementation 'com.google.vr:sdk-panowidget:1.10.0'
```

PS:官方文档明确指出最小sdk版本为19

##### 界面设计

只是一个展示的窗口，如果这里报差错请检查SDK的依赖

```xml
<com.google.vr.sdk.widgets.pano.VrPanoramaView
    android:id="@+id/vr_pan_view"
    android:layout_width="match_parent"
    android:layout_marginTop="20dp"
    android:layout_height="250dp"></com.google.vr.sdk.widgets.pano.VrPanoramaView>
```

##### 功能界面

首先导入

```java
import com.google.vr.sdk.widgets.pano.VrPanoramaEventListener;
import com.google.vr.sdk.widgets.pano.VrPanoramaView;
```

```java
private void load360Image() {
    vr_pan_view = (VrPanoramaView) findViewById(R.id.vr_pan_view);
    //获取assets文件夹下的图片
    InputStream open = null;
    try {
        open = getAssets().open("andes.jpg");
    } catch (IOException e) {
        e.printStackTrace();
    }
    Bitmap bitmap = BitmapFactory.decodeStream(open);
    //设置加载VR图片的相关设置
    VrPanoramaView.Options options = new VrPanoramaView.Options();
    options.inputType = VrPanoramaView.Options.TYPE_STEREO_OVER_UNDER;
    //设置加载VR图片监听
    vr_pan_view.setEventListener(new VrPanoramaEventListener() {
        /**
         * 显示模式
         * 1.默认
         * 2.全屏模式
         * 3.VR观看模式，即横屏分屏模式
         * 
         */
        @Override
        public void onDisplayModeChanged(int newDisplayMode) {
            super.onDisplayModeChanged(newDisplayMode);
            Log.d(TAG, "onDisplayModeChanged()->newDisplayMode=" + newDisplayMode);
        }

    });
    /**加载VR图片**/
    vr_pan_view.loadImageFromBitmap(bitmap, options);
}
```