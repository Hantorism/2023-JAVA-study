package GUI_6_ButtonOnPanel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Toolkit;

public class MyFrame extends JFrame{
    private static Toolkit kit = Toolkit.getDefaultToolkit();
    private int screenHeight = kit.getScreenSize().height;
    private int screenWidth = kit.getScreenSize().width;

    public MyFrame(){
        this.setTitle("GUI_6");
        this.setSize(screenWidth/2, screenHeight/2);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /* Senario 1 */
        // JPanel p1 = new JPanel();
        // JButton b1 = new JButton("A");
        // JButton b2 = new JButton("B");

        // p1.add(b1); // add button to panel
        // p1.add(b2); // add button to panel

        // this.add(p1); // add panel to frame

        /* Senario 2 */
        JPanel p1 = new JPanel();
        JButton b1 = new JButton("A");
        JButton b2 = new JButton("B");
        p1.add(b1); p1.add(b2);
        this.add(p1, "North");

        JPanel p2 = new JPanel();
        JButton b3 = new JButton("C");
        JButton b4 = new JButton("D");
        p2.add(b3); p2.add(b4);
        this.add(p2, "South");

        JPanel p3 = new JPanel();
        JButton b5 = new JButton("E");
        p3.add(b5);
        this.add(p3);
        
        p1.setBackground(new java.awt.Color(255, 255, 0));
        p2.setBackground(new java.awt.Color(255, 0, 0));
        p3.setBackground(new java.awt.Color(0, 255, 0));
    }
}

