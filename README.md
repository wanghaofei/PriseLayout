# PriseLayout
点赞头像列表，堆叠效果，叠加效果
#
效果如下：

![pilelayout](https://github.com/wanghaofei/PriseLayout/blob/master/点赞.png)


实现思路：
在流布局的基础上，对view进行重叠，如果想相反添加效果，只需要将
添加的View的集合反转即可，  Collections.reverse(lineViews);

通过flag为false显示右边添加，为true显示左边添加

```
 public void setFlag(boolean flag) {
        this.flag = flag;
    }
    
```
###

通过spWidth设置两个view叠加的值，默认为20

```
   public void setSpWidth(int spWidth) {
        this.spWidth = spWidth;
    }
    
```



引用自定义布局：
    
```
   <com.beiing.pilelayout.FlowLayout
        android:id="@+id/flow_layout"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
    </com.beiing.pilelayout.FlowLayout>
    
```


    