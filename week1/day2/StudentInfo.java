package week1.day2;

public class StudentInfo {
	
	
	public String getStudentName() {
		
		//System.out.println("Hari");
		
		return "Hari";

	}
	
	
	public void printStudentDetails(String name, int id) {
		System.out.println(name+id+" student details");

	}
	
	
	public static void main(String[] args) {
		
		StudentInfo si = new StudentInfo();
		
		String studentName = si.getStudentName();
		
		System.out.println(studentName);
		
		si.printStudentDetails("Hari",123);
		
				
		
		
		
		

	}

}
