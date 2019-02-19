import java.awt.*;
import java.applet.*;
public class DemoAppletMain extends Applet{
    Button button1,button2;
    int sum;
    public void init(){
        button1 = new Button("Yes");
        button2 = new Button("No");
        add(button1);
        add(button2);
    }
    public void start(){
        sum = 0;
        for(int i =1;i<-100;i++){
            sum = sum + i;
        }
    }
    public void stop(){

    }
    public void destroy(){

    }
    public void paint(Graphics graphics){
        graphics.setColor(Color.PINK);
        graphics.drawString("What's this?",20,60);
        graphics.setColor(Color.YELLOW);
        graphics.drawString("sum = "+ sum,20,100);
    }
}
