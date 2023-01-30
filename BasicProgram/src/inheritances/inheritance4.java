package inheritances;

//parent class/super class/base class
class fruit {
	fruit(){
		System.out.println("fruit class cons..");
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
	public void shape() {
		System.out.println("parent Apple is round");
	}
}
//child class/sub-class of fruit
class apple extends fruit {
	apple(){
		//super(); //java compiler will write default super()
		System.out.println("Apple class Cons..");
	}
	public void shape() {
		System.out.println("child Apple is round");
	}
}

public class inheritance4 {

	public static void main(String[] args) {
		apple fr = new apple(); // object of child class
		fr.taste(); // call method of parent class
		fr.shape(); // call method of child class

	}

}
