package IntermediateOOPAssign2;

public class SingletoneClassQ1 {

	
		// TODO Auto-generated method stub
		
		String s;
		
		private static SingletoneClassQ1 s1;
		
		private SingletoneClassQ1()
		{
			s = "Pranav";
		}
		
		static SingletoneClassQ1 getInstance()
		{
			if(s1==null)
			{
				s1 = new SingletoneClassQ1();
			}
			return s1;
			
		}
		
		public static void main(String[] args)
		{
			System.out.println(getInstance());
		}

}

//class Try extends SingletoneClassQ1
//{
//
//}

