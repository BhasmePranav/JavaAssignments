package CoreJavaAssgin1;

import java.util.Scanner;

public class ResultByMarkQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Subject 1 Mark : ");
		int s1 = sc.nextInt();
		System.out.println("Subject 2 Mark : ");
		int s2 = sc.nextInt();
		System.out.println("Subject 3 Mark : ");
		int s3 = sc.nextInt();
		
		if(s1>60 && s2>60 && s3>60)
		{
			System.out.println("Passed .");
		}
		else if((s1>60 && s2>60) || (s1>60 && s3>60) || (s3>60 && s2>60) )
		{
			System.out.println("Promoted.");
		}
		else
		{
			System.out.println("Failed . ");
		}
		

	}

}
