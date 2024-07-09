public class Employee 
{
	// Instance variable
	private String name;
	private String department;
	private int salary;
	
	public Employee(String arg1,String arg2,int arg3)  // constructor
	{
		//assign value to instance variable using this
		this.name=arg1;
		this.department=arg2;
		this.salary=arg3;
	}
	//method
	public void ShowEmployeeDetails()
	{
		System.out.println("Employee name : "+this.name);
		System.out.println("Employee department : "+this.department);
		System.out.println("Employee salary : "+this.salary);
		System.out.println("-----------------------------------");
	}
}
