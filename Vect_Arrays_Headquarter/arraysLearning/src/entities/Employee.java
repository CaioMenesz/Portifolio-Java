package entities;

public class Employee {
	
	private Integer id;
	private String employee;
	private Double salary;
	
	public Employee(Integer id, String employee, Double salary) {
		this.id = id;
		this.employee = employee;
		this.salary = salary;
	}
	
	public Integer getId() {
		return id;
	}
	public String getEmploye() {
		return employee;
	}
	public void setEmploye(String employe) {
		this.employee = employe;
	}
	public Double getSalary() {
		return salary;
	}
	
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;
	}
	
	public String toString() {
		return id + ", " + employee + ", " + String.format("%.2f", salary);
	}
	
}
