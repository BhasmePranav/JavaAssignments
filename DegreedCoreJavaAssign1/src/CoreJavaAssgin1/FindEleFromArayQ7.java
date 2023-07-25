package CoreJavaAssgin1;

import java.util.Scanner;

public class FindEleFromArayQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("Elememt want to find : ");
		int target = sc.nextInt();
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]==target)
			{
				System.out.println("Element found : ");
			}
			
			
		}
		
	}

}
