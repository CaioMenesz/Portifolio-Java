package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramExercice2 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Name: ");
		emp.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		emp.GrossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		emp.Tax = sc.nextDouble();
		
		System.out.println("Employee: " + emp);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.IncreaseSalary(percentage);
		
		System.out.println("Updated data: " + emp);
		
		sc.close();
		
	}
}