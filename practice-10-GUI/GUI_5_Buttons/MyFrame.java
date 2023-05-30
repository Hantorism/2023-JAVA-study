package GUI_5_Buttons;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Toolkit;

public class MyFrame extends JFrame{
    private static Toolkit kit = Toolkit.getDefaultToolkit();
    private int screenHeight = kit.getScreenSize().height;
    private int screenWidth = kit.getScreenSize().width;

    public MyFrame(){
        this.setTitle("GUI_5");
        this.setSize(screenWidth/2, screenHeight/2);
        this.setLocation(screenWidth/4, screenHeight/4);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Senario 1 */ 
        // JButton b1 = new JButton("Click Me");
        // this.add(b1);

        /* Senario 2 */
        JButton b1 = new JButton("North");
        JButton b2 = new JButton("Center");
        this.add(b1, "North");
        this.add(b2);

    }
}
