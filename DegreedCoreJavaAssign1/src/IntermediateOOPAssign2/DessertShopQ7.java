package IntermediateOOPAssign2;

import java.util.Scanner;

public class DessertShopQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your role : ");
		String a = sc.next();
		
		if(a.equals("Owner"))
		{
			System.out.println("Enter ur choice 1 for Add , 2 for Delete");
			int x = sc.nextInt();
			switch(x)
			{
				case 1:
				{
					add();break;
				}
				case 2:
				{
					delete();break;
				}
				
			}
		}
		else if(a.equals("Customer"))
		{
			System.out.println("Enter ur choice 1 for Order Candy , 2 for Cookie , 3 for IceCream");
			int x = sc.nextInt();
			switch(x)
			{
				case 1:
				{
					Candy c = new Candy();
					c.getCost();
					break;
				}
				case 2:
				{
					Cookie ck = new Cookie();
					ck.getCost();
					break;
				}
				case 3:
				{
					iceCream ic = new iceCream();
					ic.getCost();
					break;
				}
				
			}
		}
		

	}

	private static void delete() {
		// TODO Auto-generated method stub
		System.out.println("Candy , Cookiee , IceCream Deleted");
	}

	private static void add() {
		// TODO Auto-generated method stub
		
		System.out.println("Candy , Cookiee , IceCream Added");
		
	}

	

}


abstract class DessertItems
{
	abstract void getCost();
}
class Candy extends DessertItems
{
	int tax = 20;
	int dollar = 4;
	@Override
	void getCost() {
		// TODO Auto-generated method stub
		System.out.println("Price for Candy is :"+((dollar*60)+tax));
		
	}
	
}

class Cookie extends DessertItems
{
	int tax = 12;
	int dollar = 5;

	@Override
	void getCost() {
		// TODO Auto-generated method stub
		System.out.println("Price for Cookie is :"+((dollar*60)+tax));
		
	}
	
}

class iceCream extends DessertItems
{
	int tax = 18;
	int price = 100;
	@Override
	void getCost() {
		// TODO Auto-generated method stub
		System.out.println("Price for IceCream is :"+(price+tax));
		
	}
	
}