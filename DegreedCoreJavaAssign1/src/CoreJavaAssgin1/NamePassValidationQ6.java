package CoreJavaAssgin1;

import java.util.Scanner;

public class NamePassValidationQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String userName = "Pranav";
		String password = "1234";
		
		System.out.println("Enter UserName : ");
		String uname = sc.next();
		System.out.println("Enter Password : ");
		String upass = sc.next();
		int count = 0;
		
		
		while(count<3)
		{
			if(uname.equals(userName) && upass.equals(password))
			{
				System.out.println("Welcome . ");
				break;
			}
			else
			{
				count++;
			}
		}
		
		if(count==3)
		{
			System.out.println("Contact Admin .");
		}

	}

}
