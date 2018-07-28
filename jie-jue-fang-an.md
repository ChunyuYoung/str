# 解决方案

## MIUI相册：xiaomi云服务文件路径

默认文件路径:C:\Users\Administrator\AppData\Local\MiCloudPC\app-0.1.16

## Visual Studio 2017

### visual c++项目在编译检查scanf\(\)报错提示使用scanf\_s\(\)

1. 项目属性
2. 配置属性
3. c/c++
4. 常规
5. SDL检查设置为:否

### visual c++项目编译完不提示"按任意键结束"

1. 项目属性
2. 连接器
3. 系统
4. 子系统
5. 控制台\(/SUBSYSTEM:CONSOLE\)

* 调试方法:生成\(生成解决方案-生成"xxx"\(如果提示成功0个,则重新生成\)-编译\) -调试\(开始执行\(不调试\)/ctrl+f5\)

## 如何判断真假?

### 首先我们先来介绍三种符号:

* && 与运算
* \|\| 运算
* ! 非运算

#### && 运算

* "真&&真"为真
* "真&&假"为假
* "假&&真"为假
* "假&&假"为假

#### \|\| 运算

* "真\|\|真"为真
* "真\|\|假"为真
* "假\|\|真"为真
* "假\|\|假"为假

#### ! 运算

* "!真"为假
* "!假"为真

### 例如

* `int a = 4, b = 8, c = 10;`
* `(a < b) && (b < c) 为真 (a < b) || (a < c) 为真 a < b 为真, !(a < b) 为假`

## Notepad++ 编译运行C文件

### 编译并运行:单击菜单,选择最上选项”运行“,或直接按下F5.弹出运行窗口

* `输入:cmd /k gcc -o "$(CURRENT_DIRECTORY)$(NAME_PART).exe" "$(FULL_CURRENT_PATH)" && CLS && "$(CURRENT_DIRECTORY)$(NAME_PART).exe" & PAUSE & EXIT单击运行即可.`

### 也可以先编译再运行

#### 编译:

* `输入:cmd /k gcc -Wall -o "$(CURRENT_DIRECTORY)$(NAME_PART).exe" "$(FULL_CURRENT_PATH)" & PAUSE & EXIT`

#### 运行:

* `输入:cmd /k "$(CURRENT_DIRECTORY)$(NAME_PART).exe" & PAUSE & EXIT`

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

## Windows快速启动程序方法

1. 设置path环境变量,添加绝对文件路径即可\(在系统盘新建一个winrun\)
2. 组合键:WIN+R
3. 输入事先设置好的名字回车即可打开\(输入的名字就是winrun下的快捷键名字,比如:vs\)

## 再与SQL Server建立链接时报错

1. 打开SQL Server配置管理器
2. 点击SQL express的协议,我们需要启动所有状态
3. 选择TCP/IP,点击右键,选择属性,修改连接数据库的端口地址

* IP13 IP位本机IP,TCP端口为1433,然后选择启动 已启用:是 
* IP8 IP地址为:127.0.0.1 已启用:是
* IPALL TCP端口为1433
* 然后应用确定,并重新启动服务

## Microsoft SQL Server 2008 配置之后,找不到Microsoft SQL Server Management Studio 管理器

* 虽然安装了Mincrosoft Visual Studio XXXX的版本编译器,你都会发现只有"配置工具"没有"管理器" 虽然可以用vs里面的但是我相信对于初学者来说是一脸懵逼,管理器这东西需要单独下载 百度搜索"Microsoft SQL Server Management Studio 17"下载

## 在Mincrosoft Visual Studio编写代码的时候,某些情况下会发现光标变成方块,且输入字符时会替换掉后面的字符

* 按一下键盘上的 insert

## Windows上安装了Visual Studio快速启动方法

1. win+r
2. devenv
3. 回车

* 这个方法并不适用某些版本

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

### 进入操作系统之后发现每次启动都需要更改引导文件

1. 打开终端
2. `sudo gedit /boot/grub/grub.cfg`
3. 看到如下代码:修改倒数第二行quiet splash为nomodeset
4. 然后在找到倒数第四行的末尾添加:

   ```text
   acpi_osi=Linux nomodeset
   ```

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

## 关闭Linux启动动画

1. 打开终端
2. 输入:`sudo gedit /etc/default/grub`
3. 找到:`grub_cmdline_linux_default="quiet splash`
4. 然后删除:`"quiet splash"`为`""`\(留空\)或者`"text"`

* 某些操作系统需要更新修改的grub文件才能生效`sudo update-grub`
* 但是某些操作系统的更新了grub文件会被重置为初始状态
* 请根据需求做出修改

## VMware虚拟机安装Linux出现卡在启动界面

1. 虚拟机设置
2. 显示器
3. 取消勾选3D图形

## Windows 10 下更改文件夹背景颜色

1. WIN+R
2. 输入:`regedit`
3. 找到:`HKEY_CURRENT_USER\Control Panel\Colors`
4. 在右边找到windwos双击设置\(RGB\)颜色
5. 默认为255 255 255\(设置你喜欢的颜色\)

* 代码编辑器保护眼睛颜色为:30 30 30 一般的重启计算机/注销会生效

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

## 鼠标右键菜单弹出的位置跑到左边了

1. 控制面板
2. 平板电脑设置
3. 其他
4. 惯用左手

## 程序快捷方式有小箭头图标

* 工具:Dism++

1. 打开Dism++
2. 工具优化
3. 隐藏桌面小箭头

## 之前用F12调试那些收费的网站资源是通过网页启动加载资源从中截取数据实现的

### 但是现在的网站为了避免这种事情的发生,从而使用了调用资源的方式,也就是说吧资源 存储在一个变量里面,在用的时候直接使用js调用并加载

1. 查看网页源码
2. 找到播放按钮的布局位置
3. 从而找到JS代码的位置就能获取资源

## 调整光标粗细

1. 设置
2. 轻松实用
3. 其它选项
4. 视觉选项

## 我的世界低版本打开高版本存档报错\(Android\)

1. 新建地图
2. 然后输入\(打不开高版本地图\)相同的种子
3. 然后创建世界 然后打开文件管理器将高版本minercraftworld下的db文件夹覆盖到新建地图目录下\(替换db文件夹\)

## VMware 安装 MacOS 10.13启动报错

1. 打开该目录
2. 找到macOSxx.xx.vmx文件\(这里的文件是：macOS 10.12 \(2\).vmx\)
3. 右键用记事本方式打开
4. 找到 smc.present = “TRUE”在smc.present = “TRUE”下面
5. 手动添加一行smc.version= "0"然后保存关闭
6. 再重新启动虚拟机

## CK-DE Direct运行库修复后依然报错

1. 打开控制面板
2. 程序和功能
3. 启用或关闭windows功能
4. 勾选旧版本组件
5. DirectPlay
6. 确定\(可以不联网\)

