package GUI_3_FrameClass2;

import javax.swing.JFrame;
import java.awt.Toolkit;

public class MyFrame extends JFrame{
    private static Toolkit kit = Toolkit.getDefaultToolkit();
    private int screenHeight = kit.getScreenSize().height;
    private int screenWidth = kit.getScreenSize().width;

    public MyFrame(){
        this.setTitle("GUI_3");
        this.setSize(screenWidth/2, screenHeight/2);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}