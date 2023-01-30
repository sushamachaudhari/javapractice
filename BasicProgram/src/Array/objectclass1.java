package Array;


public class objectclass1 extends Demo {
	//driver code

	public static void main(String[] args) {
		
		objectclass1 ob=new objectclass1();
		// Below two statements are equivalent
				System.out.println(ob);//s.toString() -->string representation of an object
				System.out.println(ob.toString());//string representation of an object
				System.out.println(ob.hashCode());//it convert hexadecimal address in to decimal and return the value
				Demo d1=new Demo();
				System.out.println(d1);
				System.out.println(d1.toString());	
				System.out.println(d1.hashCode());//	

	}

}
