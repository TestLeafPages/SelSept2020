package week3.day2;

public class TNGovt extends FinanceMinistry{

	
	public void agriLoan() {
		System.out.println(7000);

	}
	
	public void covidCompensation() {
		System.out.println(2000);
		
	}
	
	public void eduLoan() {
		System.out.println(10000);

	}
	
	public static void main(String[] args) {
		
		FinanceMinistry tg = new TNGovt();
		
		tg.covidCompensation();
		tg.agriLoan();
		
		
	}

}
