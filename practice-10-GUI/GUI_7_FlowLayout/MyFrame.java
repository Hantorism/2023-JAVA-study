package GUI_7_FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;

public class MyFrame extends JFrame{
    private static Toolkit kit = Toolkit.getDefaultToolkit();
    private int screenHeight = kit.getScreenSize().height;
    private int screenWidth = kit.getScreenSize().width;

    public MyFrame(){
        this.setTitle("GUI_7");
        this.setSize(screenWidth/2, screenHeight/2);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setResizable(false);

        JPanel BigPanel = new JPanel();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
                                
        LayoutManager flowLayoutManager1 = new FlowLayout(); // Default : FlowLayout.CENTER, 5, 5
        LayoutManager flowLayoutManager2 = new FlowLayout(FlowLayout.RIGHT, 10, 10);
    
        p1.setLayout(flowLayoutManager1);
        p2.setLayout(flowLayoutManager2);

        p1.add(new JButton("Button 1"));
        p1.add(new JButton("Button 2"));
        p1.add(new JButton("Button 3"));
        p1.add(new JButton("Button 4"));

        p2.add(new JButton("Button 1"));
        p2.add(new JButton("Button 2"));
        p2.add(new JButton("Button 3"));
        p2.add(new JButton("Button 4"));

        p1.setBackground(Color.YELLOW);
        p2.setBackground(Color.PINK);

        BigPanel.setLayout(new GridLayout());
        BigPanel.add(p1);
        BigPanel.add(p2);

        this.add(BigPanel);
    }
}



