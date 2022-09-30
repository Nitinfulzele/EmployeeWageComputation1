package EmployeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {

	static int wagePerHour = 20;
	static int fullDayHour = 8;
	static int partTimeHour = 8;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation ");
		Random inp = new Random();
		int empPresent = inp.nextInt(2);

		if (empPresent == 0) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}

		// calculate daily employee wage

		int dailyWage = 0;
		int dailyWage2 = 0;

		dailyWage = fullDayHour * wagePerHour;
		dailyWage = partTimeHour * wagePerHour;

		System.out.println("Daily wage of Employee is " + dailyWage);

		dailyWage2 = partTimeHour * 10;
		System.out.println("Employee is Part time");
		System.out.println("Part Time Employee daily wage is " + dailyWage2 + " Rs ");

		// solved using switch case
		empPresent = inp.nextInt(2);
		switch (empPresent) {
		case 0:
			System.out.println("Employee is Present");
			break;
		case 1:
			System.out.println("Employee is Part Time");
			break;
		case 2:
			System.out.println("Employee is Absent");
			break;

		}

		// Calculate monthly wage

		int monthlyWage = 0;
		int monthDays = 20;

		monthlyWage = dailyWage * monthDays;
		System.out.println("Monthly wage of Employee is " + monthlyWage);

		monthlyWage = dailyWage2 * monthDays;
		System.out.println("Monthly wage of part time Employee is " + monthlyWage);

		// calculate wage till condition reached for month
		int isWorking;
		int totalMonthlyWage2 = 0;
		int workingDays = 0;
		int workingHour = 0;

		while (workingHour <= 100 && workingDays <= 20) {

			int isworking = inp.nextInt(2);
			workingDays = workingDays + 1;

			switch (isworking) {
			case 0:
				totalMonthlyWage2 = totalMonthlyWage2 + wagePerHour * 4;
				workingHour = workingHour + 4;
				break;
			case 1:
				totalMonthlyWage2 = totalMonthlyWage2 + wagePerHour * 8;
				workingHour = workingHour + 8;
				break;
			}
		}
		System.out.println("Employee Total monthly wage is " + totalMonthlyWage2);
	}
}
