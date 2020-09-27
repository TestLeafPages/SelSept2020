package week3.day2;

public class IOB implements CIBIL {
	
	
	public void loanForFarmers() {
		System.out.println("loan for farmers");

	}
	

	public static void main(String[] args) {
		
		IOB  iob = new IOB();
		
		iob.minimumBalance();
		iob.maximumLoanAmount();
		
		
		iob.loanForFarmers();
		
		
		

	}


	public void minimumBalance() {
		System.out.println(1000);
		
	}

	
	public void maximumLoanAmount() {
		System.out.println(1000000);
		
	}



	public void getCreditScore() {
		System.out.println(95);
		
	}

	
	

	

	
}
