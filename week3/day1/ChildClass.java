package week3.day1;

public class ChildClass extends Parent1  {
	
	public void childMethod() {
		System.out.println("child method");

	}
	
	public static void main(String[] args) {
		Parent1 cc = new ChildClass();
		cc.commonMethod();
		cc.parentMethod();
		
		
	}

}


