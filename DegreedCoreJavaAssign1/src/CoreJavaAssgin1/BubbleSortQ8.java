package CoreJavaAssgin1;

public class BubbleSortQ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {5,12,14,6,78,19,1};
		for(int i = 0 ;i<a.length-1;i++)
		{
			for(int j = 0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
			}
		}
		
		for(int x : a)
		{
			System.out.print(x+" ");
		}

	}

}
