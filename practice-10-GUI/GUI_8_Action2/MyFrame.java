package GUI_8_Action2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame{
    private static Toolkit kit = Toolkit.getDefaultToolkit();
    private int screenHeight = kit.getScreenSize().height;
    private int screenWidth = kit.getScreenSize().width;

    public MyFrame(){
        this.setTitle("GUI_8");
        this.setSize(screenWidth/4, screenHeight/2);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1,2));

        
        MyActionListener mac = new MyActionListener();
        JButton clickButton1 = new JButton("Don't Click Me");
        clickButton1.addActionListener(mac);
        JButton clickButton2 = new JButton("Please Click Me");
        clickButton2.addActionListener(mac);

        this.add(clickButton1);
        this.add(clickButton2);
    }
}

class MyActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        int result = JOptionPane.showConfirmDialog(null, e.getActionCommand(), "등장", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "예스!", "YES", result);
        } else
            JOptionPane.showMessageDialog(null, "노우!", "NO", result);
    }
}