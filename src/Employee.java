
public class Employee implements Comparable<Employee> {
	private int employeeId;
	private String employeeName;
	private double salary;
	private int employeeAge;
	private String designation;
	
	public Employee() {}
	public Employee(int employeeId,String employeeName,double salary,int employeeAge,String designation) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
		this.employeeAge=employeeAge;
		this.designation=designation;		
	}
	public int getEmployeeId() {
		return this.employeeId;
	}
	public String getEmployeeName() {
		return this.employeeName;
	}
	public double getSalary() {
		return this.salary;
	}
	public int getEmployeeAge() {
		return this.employeeAge;
	}
	public String getDesignation() {
		return this.designation;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", employeeAge=" + employeeAge + ", designation=" + designation + "]";
	}	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.employeeAge-o.employeeAge;
	}	
}
