# 解决方案
## MIUI相册：xiaomi云服务文件路径
默认文件路径:C:\Users\Administrator\AppData\Local\MiCloudPC\app-0.1.16
***
## Visual Studio 2017
### visual c++项目在编译检查scanf\(\)报错提示使用scanf\_s\(\)
1. 项目属性
2. 配置属性
3. c/c++
4. 常规
5. SDL检查设置为:否
***
### visual c++项目编译完不提示"按任意键结束"
1. 项目属性
2. 连接器
3. 系统
4. 子系统
5. 控制台\(/SUBSYSTEM:CONSOLE\)
* 调试方法:生成\(生成解决方案-生成"xxx"\(如果提示成功0个,则重新生成\)-编译\) -调试\(开始执行\(不调试\)/ctrl+f5\)
***
## 逻辑运算?
### 首先我们先来介绍三种符号:
1. && 与运算
2. || 运算
3. ! 非运算
***
1.  && 运算
* "真&&真"为真
* "真&&假"为假
* "假&&真"为假
* "假&&假"为假
***
2.  || 运算
* "真||真"为真
* "真||假"为真
* "假||真"为真
* "假||假"为假
***
3. ! 运算
* "!真"为假
* "!假"为真
***
* **Example**
``` C
int a = 4, b = 8, c = 10;
(a < b) && (b < c) 为真 (a < b) || (a < c) 为真 a < b 为真, !(a < b) 为假
```
***
## Notepad++ 编译运行C文件
### 编译并运行:单击菜单,选择最上选项”运行“,或直接按下F5.弹出运行窗口
``` text
输入:cmd /k gcc -o "$(CURRENT_DIRECTORY)$(NAME_PART).exe" "$(FULL_CURRENT_PATH)" && CLS && "$(CURRENT_DIRECTORY)$(NAME_PART).exe" & PAUSE & EXIT单击运行即可.
```
***
### 也可以先编译再运行
#### 编译:
``` text
输入:cmd /k gcc -Wall -o "$(CURRENT_DIRECTORY)$(NAME_PART).exe" "$(FULL_CURRENT_PATH)" & PAUSE & EXIT
```
***
#### 运行:
``` text
输入:cmd /k "$(CURRENT_DIRECTORY)$(NAME_PART).exe" & PAUSE & EXIT
```
***
## 添加鼠标右键菜单
1. win+R
2. 输入:regedit
3. 计算机\HKEY\_CLASSES\_ROOT\Directory\Background\shell
4. 在shell目录下:新建
5. 项\(重命名项的名称\)
6. 新建
7. 字符串
8. 修改
9. “文件绝对路径” 例如：计算机\HKEY\_CLASSES\_ROOT\Directory\Background\shell\babun\(默认项修改显示的文字,新建一个项输入文件绝对路径并且加上",0"来添加图标\)\command\(新建字符串编辑默认字符串输入文件绝对路径\)
***
## Windows快速启动程序方法
1. 设置path环境变量,添加绝对文件路径即可\(在系统盘新建一个winrun\)
2. 组合键:WIN+R
3. 输入事先设置好的名字回车即可打开\(输入的名字就是winrun下的快捷键名字,比如:vs\)
***
## 再与SQL Server建立链接时报错
1. 打开SQL Server配置管理器
2. 点击SQL express的协议,我们需要启动所有状态
3. 选择TCP/IP,点击右键,选择属性,修改连接数据库的端口地址
***
* IP13 IP位本机IP,TCP端口为1433,然后选择启动 已启用:是
* IP8 IP地址为:127.0.0.1 已启用:是
* IPALL TCP端口为1433
* 然后应用确定,并重新启动服务
***
## Microsoft SQL Server 2008 配置之后,找不到Microsoft SQL Server Management Studio 管理器
* 虽然安装了Mincrosoft Visual Studio XXXX的版本编译器,你都会发现只有"配置工具"没有"管理器" 虽然可以用vs里面的但是我相信对于初学者来说是一脸懵逼,管理器这东西需要单独下载 百度搜索"Microsoft SQL Server Management Studio 17"下载
***
## 在Mincrosoft Visual Studio编写代码的时候,某些情况下会发现光标变成方块,且输入字符时会替换掉后面的字符
* 按一下键盘上的 insert
***
## Windows上安装了Visual Studio快速启动方法
1. win+r
2. devenv
3. 回车
* 这个方法并不适用某些版本
***
## linux启动卡在启动界面
### 第一次启动并没有进入操作系统的解决方法
1. 重新启动计算机
2. \(上下\)光标选择启动引导项
3. 按下 e \(部分操作系统是这个键位\)
4. 修改:找到quiet splash替换为 nomodeset
5. F10保存
```text
fi
linux    /boot/vmlinuz-4.10.0-28-generic.efi.signed root=UUID=f1f30085-ee70-4367-befc-7b5f48cbcf5b ro  nomodeset $vt_handoff
initrd    /boot/initrd.img-4.10.0-28-generic
```
***
### 进入操作系统之后发现每次启动都需要更改引导文件
1. 打开终端
``` text
sudo gedit /boot/grub/grub.cfg
```
2. 看到如下代码:修改倒数第二行`quiet splash`为`nomodeset`
3. 然后在找到倒数第四行的末尾添加:
   ```text
   acpi_osi=Linux nomodeset
   ```
***
```text
export linux_gfx_mode
menuentry 'Ubuntu' --class ubuntu --class gnu-linux --class gnu --class os $menuentry_id_option 'gnulinux-simple-f1f30085-ee70-4367-befc-7b5f48cbcf5b' {
	recordfail
	load_video
	gfxmode $linux_gfx_mode
	insmod gzio
	if [ x$grub_platform = xxen ]; then insmod xzio; insmod lzopio; fi
	insmod part_gpt
	insmod ext2
	set root='hd1,gpt6'
	if [ x$feature_platform_search_hint = xy ]; then
	  search --no-floppy --fs-uuid --set=root --hint-bios=hd1,gpt6 --hint-efi=hd1,gpt6 --hint-baremetal=ahci1,gpt6  f1f30085-ee70-4367-befc-7b5f48cbcf5b
	else
	  search --no-floppy --fs-uuid --set=root f1f30085-ee70-4367-befc-7b5f48cbcf5b acpi_osi=Linux nomodeset
	fi
	linux	/boot/vmlinuz-4.10.0-28-generic.efi.signed root=UUID=f1f30085-ee70-4367-befc-7b5f48cbcf5b ro  nomodeset $vt_handoff
	initrd	/boot/initrd.img-4.10.0-28-generic
```
***
## 关闭Linux启动动画
1. 打开终端
2. 输入:`sudo gedit /etc/default/grub`
3. 找到:`grub_cmdline_linux_default="quiet splash`
4. 然后删除:`"quiet splash"`为`""`\(留空\)或者`"text"`
***
* 某些操作系统需要更新修改的grub文件才能生效`sudo update-grub`
* 但是某些操作系统的更新了grub文件会被重置为初始状态
* 请根据需求做出修改
***
## VMware虚拟机安装Linux出现卡在启动界面
1. 虚拟机设置
2. 显示器
3. 取消勾选3D图形
***
## Windows 10 下更改文件夹背景颜色
1. WIN+R
2. 输入:`regedit`
3. 找到:`HKEY_CURRENT_USER\Control Panel\Colors`
4. 在右边找到windwos双击设置\(RGB\)颜色
5. 默认为255 255 255\(设置你喜欢的颜色\)
* 代码编辑器保护眼睛颜色为:30 30 30 一般的重启计算机/注销会生效
***
## OD中使用Shift + F9直接运行导致程序运行解决方法
1. 选项
2. 调试
3. 设置
4. 取消勾选\(INT3终端,单步终端,非法访问内存,整数除以0,无效或特殊指令,所有FPU异常,同时忽略一下制定的异常或范围\)
5. 插件
6. StrongOD
7. Options
8. 取消勾选\[Skip Some Exceptions\]
9. Save
10. 然后重载程序
***
## 鼠标右键菜单弹出的位置跑到左边了
1. 控制面板
2. 平板电脑设置
3. 其他
4. 惯用左手
***
## 程序快捷方式有小箭头图标
* 工具:Dism++
1. 打开Dism++
2. 工具优化
3. 隐藏桌面小箭头
***
## 之前用F12调试那些收费的网站资源是通过网页启动加载资源从中截取数据实现的
### 但是现在的网站为了避免这种事情的发生,从而使用了调用资源的方式,也就是说吧资源 存储在一个变量里面,在用的时候直接使用js调用并加载
1. 查看网页源码
2. 找到播放按钮的布局位置
3. 从而找到JS代码的位置就能获取资源
***
## 调整光标粗细
1. 设置
2. 轻松实用
3. 其它选项
4. 视觉选项
***
## 我的世界低版本打开高版本存档报错\(Android\)
1. 新建地图
2. 然后输入\(打不开高版本地图\)相同的种子
3. 然后创建世界 然后打开文件管理器将高版本minercraftworld下的db文件夹覆盖到新建地图目录下\(替换db文件夹\)
***
## VMware 安装 MacOS 10.13启动报错
1. 打开该目录
2. 找到macOSxx.xx.vmx文件\(这里的文件是：macOS 10.12 \(2\).vmx\)
3. 右键用记事本方式打开
4. 找到 smc.present = “TRUE”在smc.present = “TRUE”下面
5. 手动添加一行smc.version= "0"然后保存关闭
6. 再重新启动虚拟机
***
## CK-DE Direct运行库修复后依然报错
1. 打开控制面板
2. 程序和功能
3. 启用或关闭windows功能
4. 勾选旧版本组件
5. DirectPlay
6. 确定\(可以不联网\)
***
## Notepad++崩溃导致文档数据被格式化
### 如果你的Notepad++在使用中没有出现任何问题,那么做好备份
1. 设置
2. 首选项
3. 备份
***
* 简单备份\(永远保存一个备份文件\)
* 冗余备份\(当用户每次Ctrl+S时都创建一个备份文件\)
![](.gitbook/assets/notepad++-bei-fen-fang-shi.png)
***
### 如果你的Notepad++崩溃导致了数据被格式化
* 很遗憾,目前没找到解决方法
***
## Windows网络应用层被篡改
### **Windows网络应用层被程序改写,导致部分程序无法联网, Windows 占用CPU资源总是80-100%,部分程序启动缓慢,Windows很容易无响应**
1. 第一种情况:可以使用类似360/电脑管家修复 TLS ,或使用命令行重置
2. 第二种情况:使用XX工具修复无效的情况下,可以说是只能重装系统,所以建议做好备份
***
### 已经得知可能出现问题的程序:
1. Visual Studio 2010
2. Windows 10 1703版本下在**程序和功能**安装Windwos虚拟机时,重启之后
***
### 建议使用的备份工具: **微PE工具箱** 做一个U盘系统来备份系统
注意:如果在**Windows开机\(正在运行\)**的情况下运行Dism++来备份系统,这样虽然依然可以备份,但是实际上在Windows运行中,部分系统文件是拒绝访问的,也就是说当一个程序正在对某个文件进行RW时,另一个进程无法读取该文件,这就导致了Dism++在备份文件时,会无法备份这些文件,导致后期恢复系统时无效果,所以建议使用 **微PE工具箱** ,这个系统内置了DISM++,所以你在这个系统下可以完整的备份Windows.
***
## **Atom Failed to activate the markdown-scroll-sync package**
[问题已经在这里得到解决](https://github.com/vincentcn/markdown-scroll-sync/issues/560)
***
引起这个问题是**markdown-scroll-sync**与**markdown-preview-plus**之间的冲突,你可以禁用**markdown-preview-plus**,然后你就会发现这个错误提示将不会在出现.
然而，真正有趣的是，markdown-preview-plus现在可以在其设置页面中同步滚动。
只要勾选:
```
Sync preview position when text in editor changes
Sync preview position when text editor is scrolled
Sync editor position when preview is scrolled
```
***
## Mincrosoft Visual Studio 2017 编译汇编文件
1. 新建-->项目-->Visual C++-->Windows控制台应用程序
2. 删除-->源文件(下的所有.cpp文件)-->新建/添加项-->XXX.cpp为XXX.asm 
3. 鼠标右键项目-->生成依赖项-->生成自定义-->勾选masm-->确定 
4. 鼠标右键.asm文件-->属性-->常规-->项类型-->Microsoft Macro Assembler 
5. Microsoft Macro Assembler-->Listing File-->Generate Preprocessed Source Listing-->否-->List All Available Information-->否 
---
需要再次检查的选项
* 打开项目属性-->连接器-->系统-->子系统-->控制台 (/SUBSYSTEM:CONSOLE)-->高级-->main
---
测试代码:<br/>
``` Assembly
.386
.model flat,stdcall
.stack 4096
ExitProcess PROTO,dwExitCode:DWORD

.data
.code
main PROC
	mov eax,5
	add eax,6

	INVOKE ExitProcess,0
main ENDP
END main
```
---
## 配置HBuilen连接夜神模拟器调试APP
打开控制台<br/>
cd 进入夜神模拟器安装bin目录<br/>
执行以下命令:<br/>
nox_adb connect 127.0.0.1:62001<br/>
nox_adb devices<br/>
***
然后进入HBuilder的tools\adbs目录<br/>
执行以下命令<br/>
adb connect 127.0.0.1:62001<br/>
adb devices<br/>
***
## JDK-9.0.1
环境变量:警告：请在环境变量中设置JAVA_HOME和PATH，例如：<br/>
  JAVA_HOME=C:\Program Files\Java\jdk1.7.0_60<br/>
  PATH=%PATH%;%JAVA_HOME%\bin;<br/>
***
## 易语言 取QQ头像
***
取QQ头像↓<br/>
HTTP读文件 (“http://q.qlogo.cn/headimg_dl?bs=qq&dst_uin=” ＋ QQ ＋ “&src_uin=www.feifeiboke.com&fid=blog&spec=100”)<br/>
取QQ昵称↓<br/>
HTTP读文件 (“http://qq.ico.la/api/qq=” ＋ QQ ＋ “&format=xml”)<br/>
取QQ昵称的接口返回的是UTF-8的编码，需要解码。<br/>
***
## GCC 编译C程序并输出汇编代码
1. 预处理，生成预编译文件:
Gcc –E hello.c –o hello.i
2. 编译，生成汇编代码:
Gcc –S hello.i –o hello.s
3. 汇编，生成目标文件:
Gcc –c hello.s –o hello.o
4. 链接，生成可执行文件:
Gcc hello.o –o hello
***
```
gcc hello.c -o hello		//编译C文件并重命名编译后文件的名字
gcc -S main.c -o main.s	//编译成汇编文件
```
***
## UTAU汉化版,可能出现的问题以及解决方法
如果UTAU汉化版不能正常运行,可以把那个English版装上,再用汉化版的解压出来的res文件夹覆盖.我的win8.1 64位就是这样用的<br/>
***
## OBS Win10 屏幕录制黑屏
1. 打开NVIDA控制面板-->管理3D设置-->程序设置-->添加-->OBS-->集成图形
2. 右键OBS.exe主程序-->兼容性-->以兼容的方式运行此程序(Win7)-->以管理员身份运行
***
## Eclipse Java Project 不支持System.out.printf()
* 因为可能是JDK版本太低,比如JDK1.4就不支持
* Windwos-->Preferences-->Java-->Compiler-->1.8或更高
***
## JetBrains Host 注册码失效
* C:\Windows\System32\drivers\etc\hosts
``` text
0.0.0.0 account.jetbrains.com
```
***
## 配置HBuiler连接夜神模拟器
* `cd` 进入夜神模拟器安装bin目录
``` text
nox_adb connect 127.0.0.1:62001
nox_adb devices
```
***
* `cd`然后进入HBuilder的tools\adbs目录
``` text
adb connect 127.0.0.1:62001
adb devices
```
## 下载XX99网页小游戏
1. F12-->NetWork-->过滤SWF-->查找过滤之后最有可能的主程序文件.swf
2. 使用浏览器运行小游戏,编写html代码
``` html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title></title>
	</head>
	<body>
		<embed src="勇者之路精灵物语速升版.swf" width="1024" height="800"></embed>
	</body>
</html>
```
* 保存并运行
***
## Notepad++单词和文字下面红色波浪线
* 插件-->DSpellCheck-->Spell Check Document Automatically
***
## IDEA 在同时使用一个以上JDK的版本问题
1. JDK1.6 不支持C格式,例如`System.out.printf("%3d",value);`
2. JDK1.10 不在支持`sun.jdbc.odbc.JdbcOdbcDriver`
3. 如果在IDEA中安装了两个版本的JDK,例如`JDK1.6`和`JDK1.10`
	* 如果默认JDK版本为`1.10`,则需要每次设置默认的JDK版本
	* 如果主要JDK版本为`1.10`,则需要每次在编译`Project`右键`Open Moudle Settings`**-->**`Project`**-->**`Project SDK`**切换JDK版本**.
***
## AndroidStudio Failed to resolve:com.android.support
1. 查看AndroidSDK版本-->Settings-->Appearance & Behavior-->System Settings-->Updates-->AndroidSDK Tools
2. Settings-->Appearance & Behavior-->AndroidSDK-->SDK Tools-->查看Android SDK Build-Tools版本是否和AndroidSDK Tools版本一致
3. Project-->Grade Script-->build.gradle-->修改comileSdkVersion和targetSdkVersion和compile修改为AndroidSDK Tools的版本号
4. Ctrl+S-->Try Again
***
## AndroidStudio Error running app: Instant Run requires 'Tools | Android | Enable ADB integration' to be enabled.
* Tools-->Android-->Enable ADB Integration
***
## AndroidStudio 显示行号/show line number
* Settings-->Editor-->General-->Appearance-->勾选show line numbers
***
## IDEA 中文乱码
* File-->Settings-->Editor-->File Encodings
	* Glodbal Encoding: GBK
	* Project Encoding: GBK
	* 添加当前工程路径,并设置编码
	* Default encoding for properties files: <System Default>
	* BOM for new UTF-8 files-->Create UTF-8 files:with NO BOM
***
## Eclipse打开IDEA导出的Eclipse工程乱码
* Window-->Preference-->General-->Workspace-->Text file encoding-->Other-->UTF-8
* 如果选中Workspace没有找到编码**Text file encoding**则选中当前工程在操作
* 显示所有中文的编码方式主要是GBK和UTF-8,UTF-8是国际通用的中文编码标准
***
## 在DiskGenius中建立新分区时报错
* 错误详情:
	1. $Bitmap中有标记为已使用的未用簇
	2. $MFT位图中有标记为已使用的魏永文件记录
* 解决方法:
	1. 以管理员身份运行cmd.exe
	2. 输入指令
		> 解释:其中f:是要修复的盘符,请根据您的当前环境更改
</br>
		> ```chkdsk /f /x f:```
***

## Diskgenius 新建并格式化分区时报错
* 当删掉一个分区时,重新建立分区并开始格式化分区时提示:无法保存分区
* 解决方法:此电脑(我的电脑/计算机)-->管理(鼠标右键)-->磁盘管理-->选择你要新建分区的空闲分区-->新建简单卷(硬盘)/格式化(移动磁盘/SD卡)
***

## Deepin Linux 15.9 因自带驱动导致无法进入
* 引导界面,按e修改配置文件
``` text
linux    /boot/vmlinuz-4.10.0-28-generic.efi.signed root=UUID=f1f30085-ee70-4367-befc-7b5f48cbcf5b ro splash quiet nouveau.modeset=0
```
* 开机进入界面后修改`/boot/grub/grub.cfg`文件进行永久修改
***

## 在 Deepin Linux 下修改 Hosts 文件
* 查看Hosts文件是否允许读写
``` text
ls -all /etc/hosts
```
* 如果当前用户没有权限,则提权并修改文件写入权限
``` text
sudo chmod 700 /etc/hosts
```
* 验证权限是否修改成功
``` text
ls -all /etc/hosts
```
* 使用Vim编辑Hosts文件
``` text
sudo vim /etc/hosts
```
* 进入插入模式,输入i
* 在最后一行添加地址
``` text
0.0.0.0 account.jetbrains.com
```
* 按下 **Esc** 输入 **:wq** 
* 验证地址是否成功写入
``` text
sudo cat /etc/hosts
```
***

## Windows Cmd: jar不是内部或外部命令
* 因为环境变量没有配置完整
* 原始配置环境变量
``` text
CLASSPATH
 .;%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar;

JAVA_HOME
 %JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;

Path
..\jdk-x.x.x
..\jre-x.x.x
```
* 可以看到`CLASSPATH`中第一个*;*之前`\lib`之后没有配置`jar.exe`运行环境
* 修正后的环境变量:
``` text
JAVA_HOME    
d:\Program Files\Java\jdkx.x.x_xx

CLASS_PATH  
.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar;

Path        
%JAVA_HOME%\bin;
```
* 可以看到`CLASS_PATH`第一个*;*之前多了一个`dt.jar`,主要就是这里的问题
***

## JavaEE 打包.jar文件
* 首先要注重说明的是本地电脑如果有多个Java运行环境的版本,建议删掉多余的,保留一个常用版本.
### 打包时的目录结构
* 打包不是直接从编译工程目录下直接打包,那样应该是不行的,我为了不出错,全部提出来(用到的).
* 示例结构:
``` text
C:\USERS\HIWIN10\DESKTOP\LANTALK
│  ConfigurationInformation.txt
│  DemoLANTalk.gif
│  imageFace.jpg
│  Java小白制作局域网聊天程序LANTalk.md
│  LANTalk.eml
│  LANTalk.iml
│  LANTalk.userlibraries
│  LANTalkLoading.gif
│  LANTalkLoadingUserInterface.gif
│  LANTalkLoading_.gif
│  MANIFEST.MF
│  后序.png
│  我的人生导演.png
│
└─src
        LANTalkClientWindowGUI.class
        LANTalkGetLocalHost.class
        LANTalkLoadingUserInterface.class
        LANTalkLoginWindowGUI.class
        LANTalkMain.class
        LANTalkRegisterWindowGUI.class
        LANTalkServerWindowGUI.class
        LANTalkUserInterface.class
```
1. 首先创建你的工程名称目录,比如这里第一行的`LANTalk`
2. 然后在`\LANTalk\<目录名>`这个目录放*字节码文件*`.class`
3. 然后`\LANTalk`这个目录下放`MANIFEST.MF`文件和一些资源文件
***
### MANIFEST.MF 文件编写格式
* 示例:
``` text
Manifest-Version: 1.0
Main-Class: LANTalkMain
Created-By: 1.10.0_2

```
* 第一行是当前项目版本号
* 第二行是主类入口
* 第三行是当前运行环境的版本`java -version`查看版本
* 最后一行留空,*在这里*总共是四行,最后一个空行不能删
* *:*后面需要有一个**空格**
* 第三行还能这样写`Created-By: 1.10.0_2 (Orcale Corporation)`
* 如果主类嵌套在一个以上的目录下需要在`MANIFEST.MF`文件修改`Main-Class: XXX.XX.LANTalk`
* [详情参见](https://www.jb51.net/article/131101.htm)
***
### Windows Cmd 下打包.jar文件
1. `jar cvfm LANTalk.jar MANIFEST.MF -C src/ .`
	* `LANTalk.jar`是你要打包成*.jar*文件的名称
	* `MANIFEST.MF`是要添加的*清单*文件
	* `src/ .`这个*src*是存放`.class`字节码的目录
2. `java -jar LANTalk.jar`
	* 运行测试是否成功打包
***

### Windows Cmd 运行.JAR文件抛异常: java.lang.IllegalArgumentException
* 找不到资源文件会抛出这个异常
* 比如:资源文件在工程的根目录下,在打包的时候可能会调用不到
* 解决方法:把资源全部释放到`.jar`文件的所在目录下
***

### Android Studio 日志代码补全调试没有输出
* 在AS中输入`logd`然后*table*补全
``` Java
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }
```
* 直接补全出来是无法再调试中看到(也有可能是我操作不对)
* 解决问题的写法是去掉冒号**:**
``` Java
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }
```
***

### Android onSaveInstenceState
* `onSaveInstenceState`方法的执行条件
> DataPreservationRecovery项目
1. `MainActivity`启动后打开`NormalActivity`时会执行`onSaveInstanceState`方法存储被 *停止* 的`MainActivity`的数据(tempData)
2. 当`NormalActivity`返回到`MainActivity`时`savedInstanceState`方法没有接收到`onSaveInstanceState`返回的数据(tempData)
3. 当`DialogActivity`启动时并不完全占用整块屏幕,因此`MainActivity`并没有 *停止* 只是被 *暂停* 且`onSaveInstanceState`没有执行.
4. 当`DialogActivity`返回到`MainActivity`时`savedInstanceState`方法依然没有接收到`onSaveInstanceState`返回的数据(tempData)
5. 当按下 *Home* 键使`MainActivity`不在占用整块屏幕时会执行`onSaveInstanceState`方法存储被暂停的`MainActivity`的数据(tempData),当输出被存储时`MainActivity`才会被 *停止*
6. 当屏幕方向被改变时( *竖屏* 切换到 *横屏* )导致`MainActivity`被销毁之前再次执行`onSaveInstanceState`方法,当屏幕停止改变方向时,程序重新创建`MainActivity`并执行`savedInstanceState`方法恢复在被系统回收之前的数据(屏幕更改之前),因为屏幕更改导致布局被更改.
***

### 使用百度URL搜索资源
#### 前言
我的浏览器默认的搜索引擎是 [萌娘百科](https://zh.moegirl.org) .<br/>
所以如果想搜索一些 *其他资源* 就无法用这个搜索引擎检索到(毕竟这是 **特殊需求专用** 的).<br/>
我经常都是打开浏览器然后 **Ctrl+T** 然后输入 `https://www.baidu.com/` 的主页地址,然后搜相应的信息,很 **麻烦**.<br/>
***
#### 解决方法
为了解决上面的问题,我思考着能不能直接在 **URL** 的基础上做修改呢!<br/>
在地址栏后面加入固定的 *操作符* (这么可能说不专业,但这样写就没问题)<br/>
``` text
例如:百度的主页
https://www.baidu.com/

例如搜索关键字:chrome
https://www.baidu.com/s?wd=chrome

```
***
