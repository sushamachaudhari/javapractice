package day1.basicprogram;

public class StaticNonPra {
	
	static int empID=1400;
	double salary=35000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=23;
		System.out.println("Local Variable Age is   :"+age);
		age=24;
		System.out.println("Local Variable Age is   :"+age);
		
		System.out.println("\nStatic global variable empID is  :"+empID);
		System.out.println("Static global variable empID is  :"+StaticNonPra.empID);
		
		StaticNonPra nn=new StaticNonPra();
	
		System.out.println("\nNonstatic global variable Salary is  :"+nn.salary);
		nn.salary=40000;
		System.out.println("\nNonstatic global variable Salary is  :"+nn.salary);
		
		StaticNonPra mm=new StaticNonPra();
		System.out.println("\nNonstatic global variable Salary is  :"+mm.salary);

	}

}
