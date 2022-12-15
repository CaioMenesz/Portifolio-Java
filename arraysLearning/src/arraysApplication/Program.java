package arraysApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How much employes will be registered? ");
		int N = sc.nextInt();
	
		for(int line = 0; line < N; line++) {
			System.out.println();
			System.out.println("Employee #" + (line+1) + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String employee = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, employee, salary);
			
			list.add(emp);
		}
		
		System.out.println("Enter the employee id that will have the salary increase: ");
		int idsalary = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("That id does not exist!");
		} else {
			System.out.println("Enter the pecentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);	
		}
		
		System.out.println("\nList of employees: ");
		for(Employee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
		
	}

}