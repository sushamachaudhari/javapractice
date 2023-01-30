package day1.basicprogram;

public class MethodBasic {

	public static void main(String[] args) {
		
		addTwoNumber(20,30);
		//addTwoNumber(100,50);
		addTwoNumber(10,20,50);
		
		System.out.println("\n Addition of two numbers :"+addTwoNumber(20,20,20));
		
		// TODO Auto-generated method stub

	}
	
	
	public static void addTwoNumber(int num1, int num2)
	{
		int res=num1+num2;
		System.out.println("\nNum1  :"+num1);
		System.out.println("Num2  :"+num2);
		System.out.println("Result :"+res);
		
	}
	
	public static int addTwoNumber(int a,int b,int c)
	{
		int res=a+b+c;
		System.out.println("\nNum1  :"+a);
		System.out.println("Num2  :"+b);
		System.out.println("num c :"+c);
		System.out.println("Result :"+res);
		return res;
	}
	

}
