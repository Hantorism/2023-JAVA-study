package GUI_1_Frame;

import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.Toolkit;
public class Frame_Method{

    public static void main(String[] args) {
		// -- Chapter 1. Frame 전체에 대한 설정하기 -- 
        // 1. "test"라는 이름의 프레임 생성 (프레임이란 사용자가 보는 창)
        JFrame myframe = new JFrame("test");

        // 아래와 완전히 동일하다.
        // JFrame myframe = new JFrame();
        // myframe.setTitle("test");

        // 2. 프레임을 보이게 설정 (설정하지 않으면 프레임이 보이지 않음)
        myframe.setVisible(true);

        // ----3. 프레임의 크기 및 위치 설정----
        // 3.1 프레임의 크기 및 위치를 수동으로 설정

        // 3.1.1 프레임의 크기를 420x420으로 설정
        myframe.setSize(420,420); 
        // 3.1.2 프레임의 위치를 특정 좌표로 설정
        myframe.setLocation(100, 100);
        // 3.1.3 프레임의 위치를 화면 정 가운데로 설정
        myframe.setLocationRelativeTo(null);

        // 3.2 프레임의 크기 및 위치를 본인의 모니터 크기에 맞게 자동으로 설정
        // 3.2.1 프레임의 크기를 본인의 모니터 크기에 맞게 자동으로 설정
        // a. Toolkit 클래스를 이용하여 사용자의 모니터의 크기를 알아낸다.
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        // b. 사용자의 모니터 크기를 이용하여 프레임의 위치와 크기를 설정한다.
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        // c. 프레임의 크기를 화면의 1/2 크기로 설정
        myframe.setSize(screenWidth/2, screenHeight/2);

        // 3.2.2 프레임의 위치를 모니터의 중앙으로 설정(Toolkit 이용)
        myframe.setLocation(screenWidth/4, screenHeight/4);
        // -----------------------------------

        // 4. 프레임을 닫을 때의 동작 설정
        // 4.1 프레임을 닫으면 프레임만 종료 (기본 값)
        myframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // 4.2 프레임을 닫아도 아무런 동작을 하지 않음
        myframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // 4.3 프레임을 닫으면 프로그램 종료
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 5. 프레임의 크기를 변경할 수 있는지 설정
        // 5.1 프레임의 크기를 변경하지 못하게 설정
        myframe.setResizable(false);
        // 5.2 프레임의 크기를 변경할 수 있게 설정 (기본 값)
        myframe.setResizable(true);
    }
}