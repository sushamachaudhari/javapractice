package day1.basicprogram;

public class MethodOverloading {
	//Non-static method in methodoverloading
/*	public void square()
	{
		System.out.println("No parameter method called");
	}

	public void square(int a)
	{
		int squaree=(a*a);
		System.out.println("\nmethod with int datatype called :"+squaree);
	}
	
	public void square(float number)
	{
		float num=(number*number);
		System.out.println("\nmethod with float datatype called :"+num);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

			MethodOverloading md=new MethodOverloading();
			md.square();
			md.square(5);
			md.square(2.5f);
	}*/

	public static void square()
	{
		System.out.println("No parameter method called");
	}

	public static void square(int a)
	{
		int squaree=(a*a);
		System.out.println("\nmethod with int datatype called :"+squaree);
	}
	
	public static void square(float number)
	{
		float num=(number*number);
		System.out.println("\nmethod with float datatype called :"+num);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		square(3.5f);

		/*	square();
			square(6);
			square(4.5f);
			
			//using standard way
			System.out.println("****************");
			MethodOverloading.square();
			MethodOverloading.square(6);
			MethodOverloading.square(4.5f);*/
	}
	
	
	
	
	
	
	
}
