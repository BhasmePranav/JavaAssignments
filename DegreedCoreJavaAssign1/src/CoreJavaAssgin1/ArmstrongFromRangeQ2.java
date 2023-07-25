package CoreJavaAssgin1;

public class ArmstrongFromRangeQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isArmstrong(153);
		
		for(int i = 100 ; i<=999 ; i++)
		{
			if(isArmstrong(i))
			{
				System.out.println(i);
			}
		}

	}
	
	
	public static boolean isArmstrong(int a)
	{
		int t = a;
		int result = 0 ;
		while(a>0)
		{
			int rem = a%10;
			result = (int) (result+Math.pow(rem, 3));
			a = a/10;
		}
		
		if(result == t)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
