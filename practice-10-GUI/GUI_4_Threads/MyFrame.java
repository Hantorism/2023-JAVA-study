package GUI_4_Threads;

import javax.swing.JFrame;

import java.awt.Toolkit;

public class MyFrame extends JFrame{
    private static Toolkit kit = Toolkit.getDefaultToolkit();
    private int screenHeight = kit.getScreenSize().height;
    private int screenWidth = kit.getScreenSize().width;

    public MyFrame(){
        this.setTitle("GUI_3");
        this.setSize(screenWidth/2, screenHeight/2);
        this.setLocation(screenWidth/4, screenHeight/4);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
