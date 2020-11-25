
public class Employee {
	//instance variables
	private String firstName;
	private String lastName;
	private double salary;
	
	//constructor
	public Employee () {
		firstName="FName";
		lastName="LName";
		salary=1;
	}
	
	//set method first name
	public void setFName(String firstName) {
		this.firstName=firstName;
		
	}
	//set method last name
	public void setLName(String lastName) {
		this.lastName=lastName;
		
	}
	//set method salary
	public void setSalary(double salary){
		if (salary>0) {
			this.salary=salary;
		}
		else if (salary<0){
			this.salary=0;
			}
	}
	//get method first name
	public String getFName() {
		return firstName;
	}
	//get method last name
	public String getLName() {
		return lastName;
	
}
	//get method salary
	public double getSalary() {
		return salary;
	}

	//string toString method
	public String toString() {
		String employeeDesc="Employee name is " + firstName + " " + lastName + " and employee salary is " + salary + ".";
		return employeeDesc;
	}
}