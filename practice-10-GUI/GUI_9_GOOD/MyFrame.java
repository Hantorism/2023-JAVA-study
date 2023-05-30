package GUI_9_GOOD;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame{
    private static Toolkit kit = Toolkit.getDefaultToolkit();
    private int screenHeight = kit.getScreenSize().height;
    private int screenWidth = kit.getScreenSize().width;

    private JPanel TextPanel = new JPanel();
    private JPanel buttonPanel = new JPanel();
    private JLabel Title = new JLabel();

    public MyFrame(){
        defaultSetting(); // For Frame
        textPanelSetting("버튼을 클릭하세요"); // For Panel
        buttonPanelSetting(); // For Panel
    }

    void defaultSetting(){
        this.setTitle("GUI_9");
        this.setSize(screenWidth/4, screenHeight/2);
        this.setLocation(screenWidth/4, screenHeight/4);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
    }

    void textPanelSetting(String title){
        TextPanel.setBackground(Color.WHITE);
        TextPanel.setLayout(new GridLayout(1,1));
        Title.setText(title);
        Title.setOpaque(true);
        Title.setFont(new Font(null, Font.BOLD, 20));
        Title.setHorizontalAlignment(JLabel.CENTER);
        Title.setVerticalAlignment(JLabel.CENTER);
        Title.setBackground(Color.PINK);
        TextPanel.add(Title);
        this.add(TextPanel, BorderLayout.NORTH);
    }

    void buttonPanelSetting(){
        buttonPanel.setLayout(new GridLayout(3,2));
        MakeButton("빨강빨강", Color.RED);
        MakeButton("노랑노랑", Color.YELLOW);
        MakeButton("파랑파랑", Color.BLUE);
        MakeButton("초록초록", Color.GREEN);
        MakeButton("보라보라", Color.MAGENTA);
        MakeButton("주황주황", Color.ORANGE);
        this.add(buttonPanel, BorderLayout.CENTER);
    }

    void MakeButton(String name, Color c1){
        JButton bt = new JButton(name);
        bt.setBackground(Color.BLACK);
        bt.setOpaque(true);
        buttonPanel.add(bt);
        ColorActionListener CA = new ColorActionListener(c1);
        bt.addActionListener(CA);
    }

    class ColorActionListener implements ActionListener{
        private Color BackGroundColor;
        public ColorActionListener(Color c1){
            this.BackGroundColor = c1;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton)e.getSource();
            System.out.println("눌린 버튼: " + e.getActionCommand());
            button.setBackground(BackGroundColor);
            Title.setBackground(BackGroundColor);
        }
    }
}

