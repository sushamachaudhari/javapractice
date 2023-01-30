package AbstractProgram;
interface Printable1 {
	void print();
}
interface Showable1 {
	void print();
}
public class interface5 implements Printable1, Showable1 {
	public void print() {
		System.out.println("Hello");
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface5 obj = new interface5();
		obj.print();
	/*	Showable1 obj1 = new interface5();
		obj1.print();
		Printable1 obj2 = new interface5();
		obj2.print();*/
	}

}
