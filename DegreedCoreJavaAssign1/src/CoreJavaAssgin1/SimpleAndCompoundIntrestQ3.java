package CoreJavaAssgin1;

public class SimpleAndCompoundIntrestQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int principle = 50000;
		double rate = 8.5;
		int time = 2;
		int si , ci;
		
		si = (int) (principle*rate*time)/100;
		System.out.println("Simple intrest is : "+si);
		ci = (int) (principle*Math.pow((1+(rate/100)),time))-principle;
		System.out.println("Compound intrest is : "+ci);

	}

}
