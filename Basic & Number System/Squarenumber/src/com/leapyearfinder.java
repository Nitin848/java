package com;

public class leapyearfinder {
	public static void main(String[] args) {
		int startYear = 100;
		int endYear = 200;

		System.out.println("Leap years between " + startYear + " and " + endYear + ":");
		for (int year = startYear; year <= endYear; year++) {
			if (isLeapYear(year)) {
				System.out.println(year);
			}
		}
	}

	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 != 0 || year % 400 == 0) {
				return true;
			}
		}
		return false;
	}
}



