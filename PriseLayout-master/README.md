# PileLayout

一种堆叠头像的点赞效果.


### 自定义属性

| 属性名 | 说明 | 默认值 |
|--------|--------|--------|
|     vertivalSpace   |    行距    | 	4dp 	|
|     pileWidth   |    重叠宽度    | 	10dp 	|


### 效果图

![pilelayout](https://github.com/LineChen/PileLayout/blob/master/screenshot/pilelayout.png)

### 使用

- 布局

```java
    <com.beiing.pilelayout.PileLayout
        android:id="@+id/pile_layout"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:PileLayout_pileWidth="10dp"/>

```

- 通过addView方式添加child

```java

    public void initPraises() {
        LayoutInflater inflater = LayoutInflater.from(this);
        for (int i = 0; i < urls.length; i++) {
            CircleImageView imageView = (CircleImageView) inflater.inflate(R.layout.item_praise, pileLayout, false);
            Glide.with(this).load(urls[i]).into(imageView);
            pileLayout.addView(imageView);
        }

    }

```


#License

```
   Copyright  2016 LineChen <15764230067@163.com>

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
