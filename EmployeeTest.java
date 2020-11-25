
public class EmployeeTest {

	public static void main(String[] args) {
		//create new objects
		Employee E1F=new Employee();
		Employee E2F=new Employee();
		
		//set values for object one
		E1F.setFName("Jane");
		E1F.setLName("Neverbottom");
		E1F.setSalary(15.76);
		
		//set values for object two
		E2F.setFName("Rodger");
		E2F.setLName("Chase");
		E2F.setSalary(-27.0);
		
		//print object's new values
		System.out.println(E1F.getFName() + " " + E1F.getLName() + "'s salary is " + E1F.getSalary());
		System.out.println(E2F.getFName() + " " + E2F.getLName() + "'s salary is " + E2F.getSalary());
		
		//update salary by 10%
		E1F.setSalary(E1F.getSalary()*1.10);
		E2F.setSalary(E2F.getSalary()*1.10);

		//print new salary after raise
		System.out.println(E1F.getFName() + " " + E1F.getLName() + "'s updated salary is " + E1F.getSalary());
		System.out.println(E2F.getFName() + " " + E2F.getLName() + "'s updated salary is " + E2F.getSalary());

	}

}
