package GUI_8_Action3;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
        this.setLayout(new GridLayout(1,2));

        JPanel LeftPanel = new JPanel();
        LeftPanel.setBackground(Color.RED);
        LeftPanel.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));
        
        JLabel label1 = new JLabel("빨강색 버튼");
        label1.setPreferredSize(new Dimension(100, 40));
        label1.setFont(new Font(null, Font.BOLD, 20));
        LeftPanel.add(label1);
        JButton button1 = new JButton("Button1");
        button1.setPreferredSize(new Dimension(100, 40));
        LeftPanel.add(button1);


        JPanel RightPanel = new JPanel();
        RightPanel.setBackground(Color.GREEN);
        RightPanel.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));
    
        JLabel label2 = new JLabel("초록색 버튼");
        label2.setPreferredSize(new Dimension(100, 40));
        label2.setBackground(Color.WHITE); // JLabel은 기본적으로 투명하다.
        label2.setOpaque(true);
        label2.setFont(new Font(null, Font.BOLD, 20));
        RightPanel.add(label2);
        JButton button2 = new JButton("Button2");
        button2.setPreferredSize(new Dimension(100, 40));
        button2.addActionListener(new MyActionListener());
        RightPanel.add(button2);

         /* ActionListener */
         button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button1");
            }
        });

        this.add(LeftPanel);
        this.add(RightPanel);
    }
}

class MyActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        // 클릭된 버튼의 라벨을 가져온다.
        JButton button = (JButton)e.getSource();
        System.out.println(button.getText());
    }
}