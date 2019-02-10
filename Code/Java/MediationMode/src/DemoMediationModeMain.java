import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import javax.swing.JFrame;

public class DemoMediationModeMain extends JFrame{
    JMenu menu;
    JMenuItem copyItem,cutItem,paseItem;
    JTextArea text;
    DemoMediationModeMain(){
        super("复制黏贴");
        setVisible(true);
        setSize(100,100);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        menu.add(copyItem);
        menu.add(cutItem);
        menu.add(paseItem);
        getContentPane().add(menu);
        getContentPane().add(text);
    }
    public void openMenu(){
        Clipboard clipboard = text.getToolkit().getSystemClipboard();
        String str = text.getSelectedText();
        if(str == null){
            copyItem.setEnabled(false);
            cutItem.setEnabled(false);
        }
        else{
            copyItem.setEnabled(true);
            cutItem.setEnabled(true);
        }
        boolean bool = clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor);
        if (bool){
            paseItem.setEnabled(true);
        }
    }
    public void paste(){
        text.paste();
    }
    public void copy(){
        text.copy();
    }
    public void cut(){
        text.cut();
    }
    public void registerMenu(JMenu menu){
        this.menu = menu;
    }
    public void registerPasteItem(JMenuItem item){
        paseItem = item;
    }
    public void registerCopyItem(JMenuItem item){
        copyItem = item;
        copyItem.setEnabled(false);
    }
    public void registerCutItem(JMenuItem item){
        cutItem = item;
        cutItem.setEnabled(false);
    }
    public void registerText(JTextArea text){
        this.text = text;
    }
    public static void main(String args[]){
        new DemoMediationModeMain();
    }
}
