package com.str;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GameMain extends JFrame implements ActionListener{

    //初始化下来列表数组元素
    String str[] = {"勇者之路精灵物语速升版","双刃战士","疯狂小人战斗","高楼爆破2","黄金矿工双人版"};

    //创建控件
    ImageIcon log = new ImageIcon("Log.jpg");       //创建Log
    JLabel BiaoQian = new JLabel("4399小游戏离线启动器");
    JComboBox ZuHeKuang = new JComboBox();      //创建下拉列表
    JLabel ZhuangTaiBiaoQian = new JLabel("状态:未启动");

    GameMain(){
        //设置窗体参数
        super("OffGame");
        setSize(300,300);
        setVisible(true);
        setLocationRelativeTo(null);

        //设置窗体布局
        setLayout(new GridLayout(1,2));
        //创建面板
        JPanel JPLog = new JPanel(new FlowLayout());                        //Log
        JPanel JPData = new JPanel(new GridLayout(1,3));
        //添加面板到容器
        getContentPane().add(JPLog);
        getContentPane().add(JPData);
        JPLog.add(log);

        //添加控件到面板
        //创建监听器并绑定监听对象
    }
    //处理监听事件
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String args[]){
        new GameMain();
    }
}
