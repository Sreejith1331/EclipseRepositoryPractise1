package oops;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees objEmp1 = new Employees();
		
		objEmp1.setEmpName("Abhijith");
		System.out.println("Employee Name: "+ objEmp1.getEmpName());
		objEmp1.setEmpDesignation("Software Developer");
		System.out.println("Employee Designation: "+ objEmp1.getEmpDesignation());
	}

}

class Employees{
	private String empName;
	private String empDesignation;
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpDesignation() {
		return empDesignation;
	}
	
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	
}
