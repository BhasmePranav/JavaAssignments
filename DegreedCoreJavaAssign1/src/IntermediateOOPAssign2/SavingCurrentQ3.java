package IntermediateOOPAssign2;

public class SavingCurrentQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int amount = 1000;
		double rate = 8.5;
		
		System.out.println("Balance in saving account : "+calculateBalance(amount , rate));
		System.out.println("Balance in Current account : "+amount);
		

	}
	
	public static double calculateBalance(int fdAmount , double interstRate)
	{
		
		return fdAmount*interstRate;
		
	}
	
	public static double calculateBalance(double cashCredit)
	{
		return cashCredit;
		
	}

}


