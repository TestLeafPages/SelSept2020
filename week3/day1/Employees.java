package week3.day1;

public class Employees extends Company {
	
	String empName;
	int empId;

	
	
	
	Employees(){
		this(300);
		System.out.println("Default Constructor");
		empName = "Hari";
		empId = 100;
	}
	
	Employees(String empName , int empId){
		
		this();	
		
		System.out.println("Parameterized constructor");
		this.empName = empName;
		this.empId = empId;
		
		
		
		
	}
	
   Employees(int empId){
						
		System.out.println("constructor with 1 arg");
		this.empId = empId;
			
	}
	

	public static void main(String[] args) {

	//  ClassName objName = new Constructor
		Employees emp  = new Employees("Prasad",200);
		
		
		System.out.println(emp.empName);
		System.out.println(emp.empId);

	}

}
