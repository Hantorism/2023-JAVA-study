package GUI_2_FrameClass;
import javax.swing.JFrame;
import java.awt.Toolkit;

public class Main{
    public static void main(String[] args){
        new MyFrame();
        //MyFrame myFrame = new MyFrame();
    }
}

class MyFrame extends JFrame{
    private static Toolkit toolkit = Toolkit.getDefaultToolkit();
    private int screenWidth = toolkit.getScreenSize().width;
    private int screenHeight = toolkit.getScreenSize().height;

    public MyFrame(){
        // JFrame myframe = new JFrame(); 생성자를 Overriding 하였으므로 필요 없음
        setTitle("MyFrame");
        setSize(screenWidth/2, screenHeight/2);
        setLocation(screenWidth/4, screenHeight/4);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }    
}

