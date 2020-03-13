# AppExpandDemo
android系统控件拓展

#### 引入依赖

`dependencies {}`中添加配置:
```
implementation 'com.zxn.widget:expand-widget:1.1.5'
implementation 'com.zxn.widget:expand-widget:1.1.4'
implementation 'com.zxn.widget:expand-widget:1.1.3'
implementation 'com.zxn.widget:expand-widget:1.1.2'
implementation 'com.zxn.widget:expand-widget:1.1.1'//bug
implementation 'com.zxn.widget:expand-widget:1.1.0'
```
    
#### 使用:

xml布局中放置控件
```
<com.zxn.widget.ExpandCheckBox
    android:id="@+id/cb_checked_all"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_marginLeft="50dp"
    android:layout_marginTop="50dp"
    android:button="@null"
    android:checked="false"
    android:clickable="true"
    android:drawableLeft="@drawable/dl_sc_checked_all_goods"
    android:drawablePadding="@dimen/dp_10"
    android:paddingLeft="@dimen/dp_20"
    android:text="全选"
    android:textColor="@color/c_101010"
    android:textSize="@dimen/sp_12" />
```

代码中的应用:
```
cbCheckedAll.setOnBoxCheckedChangeListener((buttonView, isChecked) -> Toast.makeText(MainActivity.this, "isChecked:" + isChecked, Toast.LENGTH_SHORT).show());
```
#### 效果图

![Image text](/image/view.png)
![Image text](/image/view1.png)


#### 打标签:

系统控件拓展1.1.3:增加开关控件
```
git tag -a v1.1.3 -m '增加弹性的ScrollView'
git push origin v1.1.3
git tag
```

系统控件拓展1.1.2:增加开关控件
```
git tag -a v1.1.2 -m '增加开关控件'
git push origin v1.1.2
git tag
```

系统控件拓展1.1.1:增加开关控件
```
git tag -a v1.1.1 -m '增加开关控件'
git push origin v1.1.1
git tag
```

