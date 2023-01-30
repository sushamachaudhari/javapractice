package day1.basicprogram;

public class constOverloading {
	constOverloading()
	{
		System.out.println(" This is Zer-parameterized Constructer");
	}
	
	constOverloading(char c)
	{
		System.out.println(" This is Single-parameterized Constructer");
	}
	
	constOverloading(int a,int b)
	{
		System.out.println(" This is int-int parameterized Constructer");
	}
	
	constOverloading(double a,int b)
	{
		System.out.println(" This is Double-int parameterized Constructer");
	}
	
	constOverloading(int a,double b)
	{
		System.out.println(" This is int-Double parameterized Constructer");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constOverloading c1=new constOverloading();
		constOverloading c2=new constOverloading('s');
		constOverloading c3=new constOverloading(40,60);
		constOverloading c4=new constOverloading(20.2,50);
		constOverloading c5=new constOverloading(10,30.2);
	}

}
