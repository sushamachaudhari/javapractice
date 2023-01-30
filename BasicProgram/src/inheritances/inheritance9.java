package inheritances;

class A2 {
	void msg() {
		System.out.println("Hello");
	}
}
class B2 {
	void msg() {
		System.out.println("Welcome");
	}
}

public class inheritance9 extends A2{
	inheritance9(){
		super();//confusion  ambiguity
	}

	public static void main(String[] args) {
		inheritance9 obj = new inheritance9();
		obj.msg();

	}

}

/**
is java supports multiple inheritance or not?
why java doesn't support multiple inheritance using classes?
*/