package Array;
class Demo123{
	void display() {
		System.out.println("I am display() of class Demo123");
	}
}
public class objectclass2 extends Demo123{
	static int last_roll = 100;
	int roll_no;
	// Constructor
	objectclass2()
    {
        roll_no = last_roll;//100
        last_roll++;//101
    }
	void display() {
		System.out.println("I am display() of class ObjectClass2");
	}
	@Override
	public int hashCode() {
		return roll_no;
	}
	// Driver code

	public static void main(String[] args) {
		objectclass2 s = new objectclass2();
		// Below two statements are equivalent
				System.out.println(s);
				System.out.println(s.toString());
				System.out.println("hashCode() value from ObjectClass2: "+s.hashCode());//
				s.display();//
				
				Demo123 d2=new Demo123();
				System.out.println(d2);
				System.out.println("hashCode() value from Demo123: "+d2.hashCode());	
	

	}

}
