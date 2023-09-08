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

	public void clockChange() {
		seconds += 1;
		if (seconds == 60) {
			minutes++;
			seconds = 0;
		}
		if (minutes == 60) {
			hours++;
			minutes = 0;
		}
		if (hours >= 13) {
			hours = 1;
		}
	}

}
