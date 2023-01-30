package day1.basicprogram;

public class methodassign {;
	
	static int age1;
	static double salary1=2536.0326;
	int age2;
	double salary2=568.898;
	
	//method--->
	void display()
	{
		System.out.println("Hello I am Non static method display() ");
	}
	
	double getInterest(int amount, int numofyrs,double irt)
	{
		System.out.println("Hello I amNon static method  GetInterest(int,int,double)");
		return 253.5465;
	}
	
	 static int display2()
	{
		System.out.println("\nHello, I am static method display2() ");
		return 2;
	}
	
	static  double getInterest2(int amount, int numofyrs,double irt)
		{
			System.out.println("\nHello, I am static method getInterest2(int,int,double)");
			return 250.5465;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//access static member
		System.out.println("****Access Static Variable****\n");
		System.out.println("Static member overloading access directly :"+age1);
		System.out.println("Static member overloading access standard way :"+methodassign.age1);
		
		System.out.println("\nStatic member overloading access directly :"+salary1);
		System.out.println("Static member overloading access standard way :"+methodassign.salary1);
		
//access static method
		System.out.println("\n****Access Static Method****\n");
		display2();
		getInterest2(2000,2,4);
		methodassign.display2();
		methodassign.getInterest2(2000,2,4);
		
		System.out.println("Static method overloading access  :"+display2());
		System.out.println("Static method overloading access  :"+getInterest2(2000,2,4));
		
		double gv=getInterest2(2000,2,4);
		System.out.println(" static future use :"+gv);
				
//access non static member	
		System.out.println("\n****Access Non-Static Variable****\n");
		
		methodassign ma=new methodassign();
		
		System.out.println("\nStatic member overloading access directly :"+ma.age2);
		System.out.println("Static member overloading access directly :"+ma.salary2);
		
		System.out.println("\n****Access Non-Static Method****\n");
		ma.display();
		ma.getInterest(3000,4,6);
		
		
		double vg=ma.getInterest(3000,4,6);
		System.out.println(vg);
	//	System.out.println("\nStatic member overloading access directly :"+ma.display());
	//	System.out.println("Static member overloading access directly :"+ma.getInterest(2000,2,3));
	
	}

}
