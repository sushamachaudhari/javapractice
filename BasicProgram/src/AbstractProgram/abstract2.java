package AbstractProgram;
abstract class Bike1 {
	abstract void run();
	void speed(int spd) {
		System.out.println("Bike speed: "+spd);
	}
	Bike1()
	{
		System.out.println("zero parent constructer");
	}
	Bike1(int p)
	{
		this();
		System.out.println("int parent constructor p :"+p);
	}
}
class Honda4 extends Bike1 {
	void run() {
		System.out.println("running safely");
	}
	/* void speed(int spd) {
		System.out.println("Honda4 speed: "+spd);
		super.speed(120);
	}*/
	void color() {
		System.out.println("Honda1 color is blue");
	}
	
	Honda4()
	{
	   this(10);
		System.out.println("constructor");
	}
	
	Honda4(int b)
	{
		super(20);
		System.out.println("int child constructer b:"+b);
	}
}
public class abstract2 {

	public static void main(String[] args) {
		Honda4 obj = new Honda4();
		obj.run();
		obj.speed(60);
		obj.color();		
		//Bike1 b1=new Bike1();
		//Bike1 b2=new Honda4();
		//b2.run();
		//b2.speed(20);
		//b2.color();

	}

}
