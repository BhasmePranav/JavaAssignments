package IntermediateOOPAssign2;

public class DrawShapesQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle();
		Line l = new Line();
		Circle c = new Circle();
		
		r.draw();
		l.draw();
		c.draw();

	}

}

abstract class Shaper
{
	abstract void draw();
	
}

class Rectangle extends Shaper
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("I am drawing rectangle.");
		
	}
	
}

class Line extends Shaper
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("I am drawing Line.");
		
	}
	
}

class Circle extends Shaper
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("I am drawing Circle.");
		
	}
	
}
