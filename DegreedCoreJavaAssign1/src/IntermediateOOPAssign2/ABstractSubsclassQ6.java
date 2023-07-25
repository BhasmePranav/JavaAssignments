package IntermediateOOPAssign2;

public class ABstractSubsclassQ6 {
	
	public ABstractSubsclassQ6()
	{
		FilePersistence fp = new FilePersistence();
		fp.persist();
		DatabasePersistence dp = new DatabasePersistence();
		dp.persist();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ABstractSubsclassQ6 abs = new ABstractSubsclassQ6();

	}

}



abstract class Persistence
{
	abstract void persist();
}
class FilePersistence extends Persistence
{

	@Override
	void persist() {
		// TODO Auto-generated method stub
		System.out.println("Saved .");
		
	}
	
}
class DatabasePersistence  extends Persistence
{

	@Override
	void persist() {
		// TODO Auto-generated method stub
		System.out.println("Saved .");
	}
	
}
