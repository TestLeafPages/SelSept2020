package week7.day1;

public class Employees {
	int empId;
	String empName;
	static String compName;
	
	Employees(int id, String name, String company){
		empId = id;
		empName = name;
		compName = company;
	}
	
	
	public static void getDetails() {
		System.out.println("i am a static method");

	}
	

	public static void main(String[] args) {
		Employees emp1 = new Employees(100,"Hari","TestLeaf");
		
		Employees emp2 = new Employees(200,"Prasad","TestLeaf Software solutions");
		
		
		
		System.out.println(emp1.empId);
		System.out.println(emp1.empName);
		System.out.println(compName);
		

		System.out.println("*******************************");
		
		
		
		System.out.println(emp2.empId);
		System.out.println(emp2.empName);
		System.out.println(compName);
		
		

	}

}
