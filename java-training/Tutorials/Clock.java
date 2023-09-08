package Tutorials;

public class Clock implements Runnable {

	private int seconds, minutes, hours;

	private static Clock instance;

	public static Clock getInstance() {
		if (instance == null) {
			instance = new Clock();
		}
		return instance;
	}
	
	public void setTime(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

}
