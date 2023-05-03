package Pratice08_InnerClass;

import javax.swing.JOptionPane;

public class TalkingClockTest{
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();
        
        // keep program running until user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
