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

	public String getTime() {
		return hours + ":" + minutes + ":" + seconds;
	}
	
	@Override
	public void run() {
		var clock = Clock.getInstance();
		clock.setTime(12, 59, 50);
		while (true)
			try {
				System.out.println(clock.getTime());
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				clock.clockChange();
			}
	}

	public static void main(String[] args) {
		new Clock().run();
	}

}
