package com.principal;

import java.util.Scanner;

import com.prova.entities.date.Date;
import com.prova.exceptions.DatesException;

public class TestDate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Date date = new Date();
      
		System.out.println("Enter day : ");
		int day = sc.nextInt();
		System.out.println("Enter month: ");
		int month = sc.nextInt();
		System.out.println("Enter year : ");
		int year = sc.nextInt();

		date.setYear(year);
		date.setMonth(month);
		date.setDay(day);

		try {
			date.advance();
			System.out.println("Current date after the advance method: ");
			System.out.println(date);
		} catch (DatesException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}
