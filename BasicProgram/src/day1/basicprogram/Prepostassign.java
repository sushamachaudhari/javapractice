package day1.basicprogram;

public class Prepostassign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int a=0,b;
		b= a++ + ++a + ++a + a;
		/*init-->  0  2  3   3--> a=3
	 	  Final--> 0  2  3   3--> b=8
				   1      */
		System.out.println(a);//
		System.out.println(b);
		System.out.println("\n");
		
		
		a=0;
		b= a-- + --a + --a + a;
		/*init-->  0  -2 - 3  -3--> a=-3
	 	  Final--> 0  -2  -3  -3--> b=-8
				  -1      */
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("\n");
		
		a=0;
		b= --a + --a + --a + a + ++a + a++;
		/*init-->  -1  -2 - 3  -3  -2  -2--> a=-1
	 	  Final--> -1  -2  -3  -3  -2  -1--> b=-13
				  -1      */
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("\n");
		
		a=0;
		b= a--+ a + ++a + a++ + ++a + a++ + a;
		/*init-->  -1  -2 - 3  -3  -2  -2--> a=-1
	 	  Final--> -1  -2  -3  -3  -2  -1--> b=-13
				  -1      */
	
		System.out.println("a :"+a);
		System.out.println(b);
		System.out.println("\n");
		
		
		
		
		a=1;
		b=a;
		
		System.out.println("b :"+b);
		

	}

}
