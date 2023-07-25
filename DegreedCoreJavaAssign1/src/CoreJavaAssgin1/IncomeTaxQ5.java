package CoreJavaAssgin1;

import java.util.Scanner;

public class IncomeTaxQ5 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter CTC : ");
		int ctc  = sc.nextInt();
		
		char x = 0 ;
		if(ctc<180000)
		{
			x = 'A';
		}
		else if(ctc>180001 && ctc<300000)
		{
			x = 'B';
		}
		else if(ctc>300001 && ctc<500000)
		{
			x = 'C';
		}
		else if(ctc>500001 && ctc<1000000)
		{
			x = 'D';
		}
		
		
		
		switch(x)
		{
		case 'A' :
		{
			System.out.println("U have to pay tax of amount : nil");break;
		}
		case 'B' :
		{
			System.out.println("U have to pay tax of amount : "+ctc*0.10);break;
		}
		case 'C' :
		{
			System.out.println("U have to pay tax of amount : "+ctc*0.20);break;
		}
		case 'D' :
		{
			System.out.println("U have to pay tax of amount : "+ctc*0.30);break;
		}
		}

	}

}
