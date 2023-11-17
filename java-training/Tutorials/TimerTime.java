package practice;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTime {

	public static void main(String[] args) {
		Timer timer = new Timer();
		
		TimerTask timertask = new TimerTask() {
			@Override
			public void run() {
				System.out.println("Timer expired");
			}
		};
		
		timer.scheduleAtFixedRate(timertask, 1000, 1000);
	}

}
