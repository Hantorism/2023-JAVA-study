package GUI_8_Action4;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
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
        System.out.println("sceenWidth/4 : " + screenWidth/4 + " screenHeight/4 : " + screenHeight/4);
        this.setLocation(screenWidth/4, screenHeight/4);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel Panel = new JPanel();
        Panel.setBackground(Color.GRAY);
        Panel.setLayout(new GridLayout(4,1));
        
        JLabel label1 = new JLabel("하나씩 눌러보세요");
        label1.setFont(new Font(null, Font.BOLD, 20));
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.CENTER);

        
        JButton button1 = new JButton("showMessageDialog");
        button1.addActionListener(new MyActionListener());

        JButton button2 = new JButton("showConfirmDialog");
        button2.addActionListener(new MyActionListener());

        JButton button3 = new JButton("showInputDialog");
        button3.addActionListener(new MyActionListener());

        Panel.add(label1);

        Panel.add(button1);
         Panel.add(button2);
        Panel.add(button3);

        this.add(Panel);
    }
}

class MyActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        //JPanel parent = (JPanel) e.getSource();
        if( cmd.equals("showMessageDialog"))
        {
            JOptionPane.showMessageDialog( null, "안녕하세요");
        }
        
        else if ( cmd.equals("showConfirmDialog"))
        {
            int result = JOptionPane.showConfirmDialog(null, "아무거나 고르세요");

            if(result == JOptionPane.YES_OPTION)
                System.out.println("YES_OPTION");
            else if(result == JOptionPane.NO_OPTION)
                System.out.println("NO_OPTION");
            else if(result == JOptionPane.CANCEL_OPTION)
                System.out.println("CANCEL_OPTION");
        }

        else if ( cmd.equals("showInputDialog"))
        {
            String result = JOptionPane.showInputDialog(null, "입력하면 출력됩니다.");
            System.out.println(result);
        }
    
    }
}