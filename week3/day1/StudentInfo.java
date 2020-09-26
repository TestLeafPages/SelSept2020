package week3.day1;

public class StudentInfo {
	
	
	public void getStudentDetails(String name) {
		
		System.out.println(name);
	
	}
	
	
	public void getStudentDetails(int id) {
		System.out.println(id);

	}
	
	
	public void getStudentDetails(int id,String name) {
		System.out.println(id+" "+name);

	}
	
	
	public void getStudentDetails(String eMail,int phno) {
		System.out.println(eMail+" "+phno);

	}
	
	

	public static void main(String[] args) {
		
		StudentInfo si = new StudentInfo();
		
		si.getStudentDetails("Hari");
		
		si.getStudentDetails(100);
		
	    si.getStudentDetails(100, "Hari");
		
	    si.getStudentDetails("dsfs@sdfs.com", 5645645);
	    
	    
	     
	    
	    
	    
	    
	    
	}

}
