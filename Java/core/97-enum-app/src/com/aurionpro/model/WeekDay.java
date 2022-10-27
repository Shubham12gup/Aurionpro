package com.aurionpro.model;


public enum WeekDay {

	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY(5), SATURDAY(6), SUNDAY(7);

	public int value;

	private WeekDay(int value) {
		this.value = value;
	}

	private WeekDay() {
	}
	
	private static void IsWeekend(WeekDay day) {
		if (day.equals(SATURDAY) || day.equals(SUNDAY)) {
			System.out.println("It is week end");
		}
		else {
			System.out.println("It is a week day");
		}
		
	}
	public static void main(String[] args) {
		for (WeekDay day : WeekDay.values()) {
			System.out.println(day + " " + day.value);
			IsWeekend(day);
		}
	}

}
