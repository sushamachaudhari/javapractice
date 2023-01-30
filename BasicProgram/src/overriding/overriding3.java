package overriding;
class ABC {
	public void myMethod() {
		System.out.println("method of ABC class");
	}
}

public class overriding3 extends ABC {
	public void myMethod() {
		// This will call the myMethod() of parent class
		super.myMethod();
		System.out.println("Overriding method of Class Overriding3");
	}

	public static void main(String[] args) {
		overriding3 obj = new overriding3();
		obj.myMethod();

	}

}
