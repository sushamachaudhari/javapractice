package AbstractProgram;
abstract class Shape {
	abstract void draw();
	void color(int p)
	{
		System.out.println("color parent class :"+p);
	}
}
// In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape {
	protected void draw() {
		super.color(20);
		System.out.println("drawing rectangle");
	}
}
class Circle1 extends Shape {
	public void draw() {
		System.out.println("drawing circle");
	}
}
// In real scenario, method is called by programmer or user
public class abstract3 {

	public static void main(String[] args) {
		Shape s = new Circle1();
		s.draw();
		Rectangle r=new Rectangle();
		r.draw();

	}

}
