package week3.day1;

public class SbiMdu extends SbiHo{
	
	
	
	  public void fixedDeposit(int rate){
	  
	  System.out.println("Child Class: "+rate);
	  
	  }
	 

	public static void main(String[] args) {
		/*
		 * SbiMdu sm = new SbiMdu();
		 * 
		 * sm.fixedDeposit(10);
		 */
		
		SbiHo sh = new SbiHo();
		
		sh.fixedDeposit(5);

	}

}
