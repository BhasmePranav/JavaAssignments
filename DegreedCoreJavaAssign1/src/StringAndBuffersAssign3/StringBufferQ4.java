package StringAndBuffersAssign3;

public class StringBufferQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sbs = new StringBuffer("StringBuffer");
		StringBuffer sbs1 = new StringBuffer("is a peek class of String");
		StringBuffer sbs2 = new StringBuffer("the functionallity of class");
		
		sbs = sbs.append(sbs1.append(sbs2));
		System.out.println(sbs);

	}

}
