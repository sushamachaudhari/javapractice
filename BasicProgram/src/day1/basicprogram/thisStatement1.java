package day1.basicprogram;

/* class A10 {
	A10() {
		System.out.println("hello zero");
	}
	A10(double d) {		
		System.out.println("hello double " + d);
	}
	A10(int x) {
		System.out.println("Hello int " + x);
	}
}
public class thisStatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 A10 a1=new A10();
		 A10 a2=new A10(10);
		 A10 a3=new A10(10.23);
	}

}*/

class A10 {
	A10() {
		this(25.5);
		System.out.println("hello zero");
	}
	A10(double d) {
		this(20);
		System.out.println("hello double " + d);
	}
	A10(int x) {
		System.out.println("Hello int " + x);
	}
}
public class thisStatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 A10 a1=new A10();
		// A10 a2=new A10(10);
		 //A10 a3=new A10(10.23);
	}

}


