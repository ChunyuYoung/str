public class LANTalkMain {
    public static void main(String args[]){
        //测试:从登陆界面启动
//        LANTalkLoginWindowGUI win = new LANTalkLoginWindowGUI();

        //调试:直接加载用户界面
//        LANTalkUserInterface win = new LANTalkUserInterface();

        //调试:直接加载服务器端
        LANTalkServerWindowGUI win = new LANTalkServerWindowGUI();
        win.validate();     //刷新实例化对象的布局
    }
}
