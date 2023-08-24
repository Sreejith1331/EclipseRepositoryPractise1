package firstpkg;

public class FirstConstructor {
	
	String empName;
	String empDesignation;
	int empId;
	
	//creating parameterised constructor
	public FirstConstructor(String empName, String empDesignation, int empId)
	{
		this.empName=empName;
		this.empDesignation=empDesignation;
		this.empId=empId;
	}
	
	public FirstConstructor() 
	{
		
	}
	
	public void DisplayDetails()
	{
		System.out.println("Employee Name: " + this.empName);
		System.out.println("Employee Designation: "+this.empDesignation);
		System.out.println("Empoyee ID: "+this.empId);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstConstructor objFC1 = new FirstConstructor();	//default constructor
		objFC1.empName = "Abhijith";
		objFC1.empDesignation= "Developer";
		objFC1.empId=1;
		objFC1.DisplayDetails();
		
		FirstConstructor objFC2 = new FirstConstructor("Binoy","Tester",2);
		objFC2.DisplayDetails();
	}

}
