package day1.basicprogram;

public class thisRef {
	int age;
	
	void call()
	{
		System.out.println("i am call method");
	}
	
	void m(int age)
	{
		System.out.println("local age :"+age);
		System.out.println("global age :"+this.age);
		
		this.call();
		System.out.println("this keyword value is: "+this);//print same reference id
	}
	public static void main(String[] args) {
		thisRef ref=new thisRef();
		
		System.out.println("object ref value is: "+ref);//print reference id
		ref.m(25);
	

	}

}
