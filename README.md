# CloudNotes 作者：黄结
```shell script
sudo chown soldier -R /dev/kvm
```

## 2020年春季大三第二学期，Android期末课设：这是一个基于 Android 和 MySql 的云笔记本程序。

### 实现功能:   
  1. **用户的注册登录退出模块**
  2. **用户信息的查找更改**操作
  3. **笔记列表的查看**操作
  4. **笔记列表的删改**操作

### 项目结构
>CloudNotes
>>app   
>>>lib   
>>>>[mysql-connector-java-5.1.30-bin.jar](app/libs/mysql-connector-java-5.1.30-bin.jar) (JDBC驱动)
>>
>>src   
>>>main   
>>>>java   
>>>>>com/soldier
>>>>>>[AddNoteActivity.java](app/src/main/java/com/soldier/AddNoteActivity.java)(添加笔记逻辑代码)<br>
>>>>>>[FirstActivity.java](app/src/main/java/com/soldier/FirstActivity.java)(启动界面代码)<br>
>>>>>>[LoginActivity.java](app/src/main/java/com/soldier/LoginActivity.java)(登录代码代码)<br>
>>>>>>[MainActivity.java](app/src/main/java/com/soldier/MainActivity.java)(程序主界面代码)<br>
>>>>>>[MyListAdapter.java](app/src/main/java/com/soldier/MyListAdapter.java)(笔记更改逻辑代码)<br>
>>>>>>[MyListView.java](app/src/main/java/com/soldier/MyListView.java)(自定义控件完成下拉刷新功能)<br>
>>>>>>[RegisterActivity.java](app/src/main/java/com/soldier/RegisterActivity.java)(注册界面代码)<br>
>>>>>>[StartActivity.java](app/src/main/java/com/soldier/StartActivity.java)(启动界面动画代码)<br>
>>>>>com/soldier/util
>>>>>>[DBUtil.java](app/src/main/java/com/soldier/util/DBUtil.java)(数据库基本操作类)
>>>>
>>>>res  
>>>>>drawable
>>>>>>[ic_start.xml](app/src/main/res/drawable/ic_start.xml)(软件图标)
>>>>>
>>>>>layout
>>>>>>[activity_add_note.xml](app/src/main/res/layout/activity_add_note.xml)(添加笔记界面布局代码)<br>
>>>>>>[activity_first.xml](app/src/main/res/layout/activity_first.xml)(启动界面之后界面布局代码)<br>
>>>>>>[activity_login.xml](app/src/main/res/layout/activity_login.xml)(登录界面布局代码)<br>
>>>>>>[activity_main.xml](app/src/main/res/layout/activity_main.xml)(主界面布局代码)<br>
>>>>>>[activity_register.xml](app/src/main/res/layout/activity_register.xml)(注册界面布局代码)<br>
>>>>>>[activity_start.xml](app/src/main/res/layout/activity_start.xml)(启动动画界面布局代码)<br>
>>>>>>[layout_datetime.xml](app/src/main/res/layout/layout_datetime.xml)(日期选择窗口布局代码)<br>
>>>>>>[layout_header.xml](app/src/main/res/layout/layout_header.xml)(自定义刷新下拉控件布局代码)<br>
>>>>>>[layout_list.xml](app/src/main/res/layout/layout_list.xml)(笔记列表布局代码)<br>
>>>>>>[layout_tab1.xml](app/src/main/res/layout/layout_tab1.xml)(TabHost1布局代码)<br>
>>>>>>[layout_tab2.xml](app/src/main/res/layout/layout_tab2.xml)(TabHost2布局代码)<br>
>>>>>>[listview_item.xml](app/src/main/res/layout/listview_item.xml)(右下角的添加按键布局代码)<br>
>>>      
>>>[AndroidManifest.xml](app/src/main/AndroidManifest.xml)(应用程序的信息描述文件)
### 数据库文件及ER图
##### 数据库创建文件→[cloud_notes.sql数据表](sql/cloud_notes.sql)
##### 数据库ER图   
![点击前往下载](/appImage/DbERImage.png)
## 项目截图
### APP图标   
![点击前往下载](/appImage/AppImage.png "APP图标")
### 启动动画
![点击前往下载](/appImage/StartCartoon.png "启动动画")
### 启动界面
![点击前往下载](/appImage/StartInter.png "启动界面")
### 注册界面
![点击前往下载](/appImage/Register.png "注册界面")
### 登录界面
![点击前往下载](/appImage/Login.png "登录界面")
### 笔记列表界面
![点击前往下载](/appImage/Note.png "笔记列表界面")
### 笔记添加界面
![点击前往下载](/appImage/NoteAdd.png "笔记添加界面")
### 用户资料界面
![点击前往下载](/appImage/UserInfo.png "用户资料界面")

