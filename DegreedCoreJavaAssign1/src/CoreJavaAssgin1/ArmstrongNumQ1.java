package CoreJavaAssgin1;

public class ArmstrongNumQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 101;
		int result = isArmstrong(a);
		if(result==a) System.out.println(a+ " is Armstrong Number"); else System.out.println(a+ " is not Armstrong Number");

	}
	
	public static int isArmstrong(int a)
	{
		int res = 0;
		while(a>0)
		{
			int rem = a%10;
			res = (int) (res+Math.pow(rem, 3));
			a = a/10;
		}
		System.out.println("Result is : "+res);
		return res;
		
		
	}

}
