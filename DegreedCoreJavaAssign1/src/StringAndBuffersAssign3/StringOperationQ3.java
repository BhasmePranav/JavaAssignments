package StringAndBuffersAssign3;

public class StringOperationQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Java String Pool Pefers to collection of string which are stored in heap memory";
		String s1 = new String("Java String Pool Pefers to collection of string which are stored in heap memory");
		
		//Q1
		String lowercase = s.toLowerCase();
		System.out.println("LowerCase String is : "+lowercase);
		
		//Q2
		String uppercase = s.toUpperCase();
		System.out.println(uppercase);
		
		//Q3
		System.out.println(s.replace('a', '$'));
		
		//Q4
		System.out.println(s.contains("collection"));
		
		//Q5
		System.out.println(s.equals("Java String Pool Pefers to collection of string which are stored in heap memory"));
		
		//Q6
		System.out.println("It was : "+(s==s1)+" but not it is : "+(s.equals(s1)));
		
	}

}
