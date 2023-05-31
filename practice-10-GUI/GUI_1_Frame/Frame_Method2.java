package GUI_1_Frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Frame_Method2 {
    public static void main(String[] args) {
        // Chapter1. Frame 전체에 대한 설정하기
        JFrame myframe = new JFrame("GUI");
        myframe.setVisible(true);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        myframe.setSize(screenSize.width/2, screenSize.height/2);
        myframe.setLocation(screenSize.width/4, screenSize.height/4);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setResizable(false);

        // chapter2. ContentPane에 대한 설정하기
        // 1. ContentPane의 배경색을 변경
        myframe.getContentPane().setBackground(Color.yellow);
        // 2. ContentPane의 Layout을 null로 설정(기본 값은 BorderLayout)
        myframe.getContentPane().setLayout(null);
        

        // Chapter3. MenuBar에 대한 설정하기
        // 1. MenuBar 생성
        MyMenuBar mymenubar = new MyMenuBar();
        // 2. MenuBar를 Frame에 추가
        myframe.setJMenuBar(mymenubar);
    }
}

class MyMenuBar extends JMenuBar{
    public MyMenuBar(){
        this.add(new JMenu("Test"));
        this.add(new JMenu("Test2"));
    }
}
