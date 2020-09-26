package week3.day1;

public class SbiHo {
	
	public void fixedDeposit(int rate) {
		System.out.println("Parent Class: "+rate);

	}

	public static void main(String[] args) {
		SbiHo sh = new SbiHo();
		
		sh.fixedDeposit(5);

	}

}
