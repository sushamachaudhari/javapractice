package day1.basicprogram;

class A{
	A()
	{
		System.out.println("zero");
	}
	A(int c)
	{
		//this.A();
     System.out.println("int constructor");
     
	}
	
		A(char d)
	{
			//this.A();
			this.n();
		     System.out.println("d :"+d);
	}
	void m(int b)
	{
		System.out.println("hello M");
		System.out.println(b);
	}
	
	void n()
	{
		this.m(3);
		System.out.println("hello N");
		//this.m();
	}
}

public class thisMethod {
	void methodOne() {
		System.out.println("Inside method ONE");
	}
	
	void methodTwo()
	{
		System.out.println("Inside method two");
		this.methodOne();
	}

	public static void main(String[] args) {
		thisMethod obj=new thisMethod();
		obj.methodTwo();
		System.out.println("***");
		//A a=new A();
		//a.n();
		A a1=new A('v');
		
		

	}

}
