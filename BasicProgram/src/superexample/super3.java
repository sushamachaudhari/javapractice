package superexample;
/* class Person {
	int id;
	String name;
	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
class Emp extends Person {
	float salary;
	Emp(int id, String name, float salary) {
		super(id, name);// reusing parent constructor
		this.salary = salary;
	}
	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}*/
class Animal6 {
	String color = "white of red";
}
class Dog6 extends Animal6 {
	String color = "black";
	void printColor() {
		System.out.println("Dog color is : "+color);// prints color of Dog class
		System.out.println("Animal color is: "+super.color);// prints color of Animal class
	}
}
public class super3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog6 d = new Dog6();
		d.printColor();
		String s1="12 servers";
		System.out.println(s1.matches(".+[\\s]servers"));
		System.out.println(s1.indexOf("shailesh"));
		String[]  str=s1.split("shailesh");
	}

}
