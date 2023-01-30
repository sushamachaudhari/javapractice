package day1.basicprogram;

public class finalKeyword1 {
	
final int empId=90;
	 double salary;
	
	
	
	finalKeyword1(int a,double b)
	{
		int empId=50;
		//empId=a;
		salary=b;
		//salary=a;
		System.out.println(empId+" "+salary+" ");
	}

	public static void main(String[] args) {
		int b=21;

	System.out.println(b);
	finalKeyword1 f2=new finalKeyword1(55,28000.2);
	System.out.println("f2 :"+f2.salary);
	//f2.run();
		finalKeyword1 f1=new finalKeyword1(22,23000.2);
		//run();
		System.out.println("f1 :"+f1.salary);
		
		
	

	}

}
