package com.prova.entities.date;

import java.util.Arrays;

import com.prova.exceptions.DatesException;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date() {

	}

	public Date(int day, int month, int year) {
		this.day = 01;
		this.month = 01;
		this.year = 2000;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void advance() {
		validateDate(day, month, year);
		if (month == 2 && day < 28) {
			day++;
		} else if (month == 2 && day >= 28) {
			day = 1;
			month++;
		} else if (Arrays.asList(4, 6, 9, 11).contains(month) && day < 30) {
			day++;
		}else if(Arrays.asList(4, 6, 9, 11).contains(month) && day == 30) {
			day = 1;
			month++;
		}else if(Arrays.asList(1, 3, 5, 7, 8, 10, 12).contains(month) && day < 31) {
			day++;
		}else if(Arrays.asList(1, 3, 5, 7, 8, 10, 12).contains(month) && day == 31) {
			day = 1;
			month++;
		}	
		
		if (month == 13) {
			month = 1;
			year++;
		}
	}

	private void validateDate(int day, int month, int year) {
		if ((month > 12 || month <= 0)) {
			throw new DatesException("The month must be between 1 and 12!");
		}
		if (day > 31 || day <= 0) {
			throw new DatesException("The day must be between 1 and 31!");
		}
		if (year < 2000) {
			throw new DatesException("The year needs to be from 2000 onwards!");
		}
		if (month == 2 && day > 28) {
			throw new DatesException("This month is only 28 days old!");
		}
	}

	@Override
	public String toString() {
		return " " + day + "/" + month + "/" + year;
	}

}