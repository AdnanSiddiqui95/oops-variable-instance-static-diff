
public class EmployeeAA {

	public static void main(String[] args) {
		//command to create three reference variable
		Employee o1,o2,o3;
		//command to create three object from class Employee
		o1=new Employee("Adnan Siddiqui","Human Resource",85000);
		o2=new Employee("Kamran Siddiqui","Dev",80000);
		o3=new Employee("Alhan Siddiqui","Exp",75000);
		
		o1.ShowEmployeeDetails();
		o2.ShowEmployeeDetails();
		o3.ShowEmployeeDetails();
	}

}
