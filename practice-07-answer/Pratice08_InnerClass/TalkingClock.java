package Pratice08_InnerClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;

// outer class 
class TalkingClock {
        private int interval; // interval between two announcements
        private boolean beep; // flag to turn beeps on or off
        
		// TalkingClock Constructor
        public TalkingClock(int interval, boolean beep) {
        	this.interval = interval;
        	this.beep = beep;
        }
        
		// TODO : TimePrinter 클래스를 start() 메소드의 지역 내부 클래스로 만들기
		// TimePrinter inner class 시작
        public class TimePrinter implements ActionListener
        {
        	public void actionPerformed(ActionEvent event)
        	{
        		System.out.println("At the tone, the time is " + new Date());
        		if (beep) // 내부 클래스에서 외부 클래스의 변수 사용 가능!
					Toolkit.getDefaultToolkit().beep();
							
        	}
        } // inner class 끝
        
        public void start() {
			// TODO : Make TimePrinter inner class here.

			// Make InnerClass TimePrinter's instance
        	ActionListener listener = new TimePrinter();
        	Timer t = new Timer(interval, listener);
        	t.start(); // use Timer Class's start() method.
        }
} // end of class