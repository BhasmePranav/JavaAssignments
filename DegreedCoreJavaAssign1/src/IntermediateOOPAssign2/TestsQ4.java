package IntermediateOOPAssign2;

public class TestsQ4 extends TryAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TryAbstract t = new TryAbstract();   gives error

		TestsQ4 t = new TestsQ4();
		t.print();
		t.delete();
	}

	@Override
	void delete() {
		// TODO Auto-generated method stub
		System.out.println("I m deleting .");
		
	}

}

//If class doesnt declare as abstract it gives error "Type must be abstract"
abstract class TryAbstract
{
	public void print()
	{
		System.out.println("I m printing .");
	}
	
	abstract void delete();
}
