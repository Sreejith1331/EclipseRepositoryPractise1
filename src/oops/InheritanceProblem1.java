package oops;

public class InheritanceProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee objEmp = new Employee();
		objEmp.name="Abhijith";
		objEmp.address="Mangalasserry House";
		objEmp.age=27;
		objEmp.phoneNo=3214569870l;
		objEmp.salary=40000;
		objEmp.specialization="Automation Testing";
		objEmp.printDetails();
		System.out.println("Specialization: "+objEmp.specialization);
		
		System.out.println("---------------------------------------------");
		
		Manager objMgr = new Manager();
		objMgr.address="Mundakkal house";
		objMgr.age=34;
		objMgr.department="Software Testing";
		objMgr.name="Mahesh";
		objMgr.phoneNo=9876543210l;
		objMgr.salary=100000;
		objMgr.printDetails();
		System.out.println("Department: "+objMgr.department);
	}

}

class Member{
	public String name, address;
	public int age, salary;
	public long phoneNo;
	
	public void printDetails() {
		System.out.println("Member's Name: "+name);
		System.out.println("Phone No: "+phoneNo);
		System.out.println("Age: "+age);
		System.out.println("Current Address: "+address);
	}
}

class Employee extends Member{
	public String specialization;
}

class Manager extends Member{
	public String department;
}
