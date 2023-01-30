package AbstractProgram;
interface Printable2 {
	void print();
}
interface Showable2 extends Printable2 {
	void show();
	
	//public abstract void print(); ---> inherited method
}
public class interface6 implements Showable2{
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface6 obj = new interface6();
		obj.print();
		obj.show();
		Printable2 obj2 = new interface6();
		obj2.print();
		//obj2.show();
		System.out.println("***************");
		Showable2 obj3 = new interface6();
		obj3.print();
		obj3.show();
	}

}
