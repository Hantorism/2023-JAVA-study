package Pratice08_InnerClass2;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

class TalkingClock {// outer class 
        private int interval; // interval between two announcements
        private boolean beep; // flag to turn beeps on or off
        
				// TalkingClock Constructor
        public TalkingClock(int interval, boolean beep) {
        	this.interval = interval;
        	this.beep = beep;
        }
        
        public void start() {
			// TODO : Make TimePrinter inner class
			class TimePrinter implements ActionListener
			{
				public void actionPerformed(ActionEvent event)
				{
					System.out.println("At the tone, the time is " + new Date());
					if (beep) // 내부 클래스에서 외부 클래스의 변수 사용 가능!
						 Toolkit.getDefaultToolkit().beep();
								
				}
			} 
			// Make InnerClass TimePrinter's instance
        	ActionListener listener = new TimePrinter();
        	Timer t = new Timer(interval, listener);
        	t.start(); // use Timer Class's start() method.
        }
} // end of class