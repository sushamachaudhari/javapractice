package polymorphisamm;

public class compiletime {
	
	static void sum(int a,int b)
	{
		int c=a+b;
		System.out.println("addition of two number :"+c);
		
	}
	
	static void sum(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("addition of two number :"+d);
		
	}

	public static void main(String[] args) {
		
		
			compiletime.sum(10,4,6);
			compiletime.sum(10,4);
	}

}

/**
 * When a method gets to know its implementation at the time of compilation is known as compile
 * time poly this can be achieved by using static method overloading
 */
