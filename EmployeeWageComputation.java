package EmployeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {

	static int wagePerHour = 20;
	static int fullDayHour = 8;
	static int partTimeHour = 8;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation ");
		Random inp = new Random();
		int isPresent = inp.nextInt(2);

		if (isPresent == 0) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
 
		int dailyWage = 0;
	    dailyWage = fullDayHour*wagePerHour;
		dailyWage = partTimeHour*wagePerHour;
    
		System.out.println("Daily wage of Employee is " + dailyWage); 
		
		dailyWage = fullDayHour* 10;
	    System.out.println("Employee is Part time");
	    System.out.println("Part Time Employee daily wage is " + dailyWage +"Rs");
         
	    isPresent = inp.nextInt(2);

		switch (isPresent) {
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

	}

}
