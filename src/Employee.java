
public class Employee {
	private String name;
	private int salary;
	
	public Employee(String employeeName, int employeeSalary){
		name = employeeName;
		salary = employeeSalary;
	}

	// Set the name in object
	public void setName(String employeeName) {
		name = employeeName;
	}

	// Retrieve the name
	public String getName() {
		return name;
	}

	public void setSalary(int employeeSalary) {
		if (salary < 500 || salary > 20000) {
			salary = 500;
		}
		salary = employeeSalary;
	}

	public int getSalary() {
		return salary;
	}
}
