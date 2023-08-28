package com.itacademy.home13.task4;

import java.util.Random;

public class Time {
	private int hour;
	private int minutes;
	private int second;

	public Time() {
		Random rand = new Random();
		this.hour = rand.nextInt(0, 24);
		this.minutes = rand.nextInt(0, 60);
		this.second = rand.nextInt(0, 60);
	}

	public Time(int hour, int minute, int second) {
		if (hour < 0 || minute < 0 || second < 0) {
			throw new RuntimeException("Value can't be negative");
		}
		if (hour > 23) {
			this.hour = hour % 24;
		} else {
			this.hour = hour;
		}
		if (minute > 59) {
			this.minutes = minute % 60;
		} else {
			this.minutes = minute;
		}
		if (second > 59) {
			this.second = second % 60;
		} else {
			this.second = second;
		}
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minutes;
	}

	public int getSecond() {
		return second;
	}

	public String getTimeFormated() {
		String vtime;
		String vhour = String.valueOf(hour);
		String vminuite = String.valueOf(minutes);
		String vsecond = String.valueOf(second);

		if (hour <= 9) {
			vhour = "0" + hour;
		}
		if (minutes <= 9) {
			vminuite = "0" + minutes;
		}
		if (second <= 9) {
			vsecond = "0" + second;
		}
		vtime = vhour + ":" + vminuite;
		return vtime;
	}

	public boolean compareTime(Time t1, Time t2) {
		int t1second, t2second;

		t1second = t1.getHour() * 3600 + t1.getMinute() * 60 + t1.getSecond();
		t2second = t2.getHour() * 3600 + t2.getMinute() * 60 + t2.getSecond();

		return t1second <= t2second;
	}
}
