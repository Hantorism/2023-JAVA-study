package GUI_2_FrameClass;

import javax.swing.JFrame;
import java.awt.Toolkit;

public class MyFrame extends JFrame{

    private static Toolkit toolkit = Toolkit.getDefaultToolkit();
    private int screenWidth = toolkit.getScreenSize().width;
    private int screenHeight = toolkit.getScreenSize().height;

    public MyFrame(){
        setTitle("MyFrame");
        setSize(screenWidth/2, screenHeight/2);
        setLocation(screenWidth/4, screenHeight/4);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }    
}
