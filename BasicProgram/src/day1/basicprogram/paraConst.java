package day1.basicprogram;

public class paraConst {
	int roll;
	double salary;
	int age1;
	
	paraConst(int a,double b,int c)
	{
		roll=a;
		salary=b;
		age1=c;
	}
	
	void display()
	{
		System.out.println(roll+" "+salary+" "+age1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=1;
		System.out.println(age);
		paraConst c1=new paraConst(101, 25000.45,20);
			c1.display();
			
			c1.age1=25;
			System.out.println("age1 :"+c1.age1);
			paraConst c2=new paraConst(301,45000.45,21);
			c2.display();
			
	}

}
