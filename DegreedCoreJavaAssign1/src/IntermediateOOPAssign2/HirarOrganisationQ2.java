package IntermediateOOPAssign2;

public class HirarOrganisationQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		Manager m = new Manager();
		Labour l = new Labour();
		e.calculateSalary(100);
		m.calculateSalary(100);
		l.calculateSalary(100);
	}

}

class Employee
{
	public void calculateSalary(int bsal)
	{
		System.out.println("Salary for Employee is : "+bsal*12);
	}
	
}

class Manager extends Employee
{
	int incentive = 1000;
	public void calculateSalary(int bsal)
	{
		System.out.println("Salary for Manager is : "+((bsal*12)+incentive));
	}
}

class Labour extends Employee
{
	int overtime = 800;
	public void calculateSalary(int bsal)
	{
		System.out.println("Salary for Labour is : "+((bsal*12)+overtime));
	}
}