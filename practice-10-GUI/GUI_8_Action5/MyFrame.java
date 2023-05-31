package GUI_8_Action5;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

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

    public MyFrame(){
        this.setTitle("GUI_8");
        this.setSize(screenWidth/4, screenHeight/2);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel Panel = new JPanel();
        Panel.setBackground(Color.magenta);
        Panel.setLayout(new GridLayout(4,1));
        
        JLabel label1 = new JLabel("아래에 입력하세용");
        label1.setFont(new Font(null, Font.BOLD, 20));
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.CENTER);

        Panel.add(label1);

        JTextField textField = new JTextField(30); // 
        textField.setFont(new Font(null, Font.PLAIN, 20));
        textField.setHorizontalAlignment(JTextField.CENTER);

        Panel.add(textField);

        JTextArea textArea = new JTextArea(7, 30);
        textArea.setFont(new Font(null, Font.PLAIN, 20));
        textArea.setEditable(false);

        Panel.add(textArea);

        JButton button = new JButton("입력");
        button.setFont(new Font(null, Font.PLAIN, 20));
        button.addActionListener(new MyActionListener(textArea, textField));

        Panel.add(button);

        this.add(Panel);
    }
}

class MyActionListener implements ActionListener{
    private JTextArea textArea;
    private JTextField textField;

    public MyActionListener(JTextArea textArea, JTextField textField){
        this.textArea = textArea;
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String text = textField.getText();
        textArea.append(text + "\n");
        textField.selectAll();
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
}