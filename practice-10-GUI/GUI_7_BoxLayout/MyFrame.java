package GUI_7_BoxLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
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

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
                                // new BoxLayout(Container target, int axis)
        LayoutManager layout_Y = new BoxLayout(p1, BoxLayout.Y_AXIS);
        LayoutManager layout_X = new BoxLayout(p2, BoxLayout.X_AXIS);
        // BoxLayout은 컴포넌트를 추가할때마다, 컴포넌트의 크기를 최대 크기로 설정하여 배치한다.
        // 배치하는 방향은 생성자의 두번째 인자로 결정한다.

        p1.setLayout(layout_Y);
        p2.setLayout(layout_X);

        p1.add(new JButton("Button 1"), "North"); // North는 적용되지 않는다. Y축 정렬이기 때문에.
        p1.add(new JButton("Button 2"));
        p1.add(new JButton("Button 3"));

        p2.add(new JButton("Button 1"), "North"); // North는 적용되지 않는다. X축 정렬이기 때문에.
        p2.add(new JButton("Button 2"));
        p2.add(new JButton("Button 3"));

        p1.setBackground(new java.awt.Color(255, 255, 0));
        p2.setBackground(new java.awt.Color(255, 0, 0));

        this.add(p1, "North");
        this.add(p2, "South");
    }
}

