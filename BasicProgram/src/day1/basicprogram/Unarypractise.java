package day1.basicprogram;

public class Unarypractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b;
		b=a + a++ + a++ + ++a;
		System.out.println("\n value of a is :"+a);
		System.out.println("value of b is :"+b);
		
		a=1;
		b=a + ++a + a++ + ++a;
		System.out.println("\n value of b is :"+b);
		System.out.println("value of a is :"+a);
		
		a=-1;
		b=a + a++ + --a + a--;
		// b  -1 -1 -1 -1
		//a   -1  0 -1 -2
		System.out.println("\n value of b is :"+b);
		System.out.println("value of a is :"+a);
		
		
		

	}

}
