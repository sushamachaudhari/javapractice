package day1.basicprogram;

class students{
	int rollno;
	float fee;
	
	students(int rollno,float fee)
	{
		System.out.println("local variable rollno :"+rollno);
		System.out.println("local variable fee :"+fee);
		System.out.println("\nGlobal variable rollno :"+this.rollno);
		System.out.println("global variable fee :"+this.fee);
		
		this.rollno=rollno;
		this.fee=fee;
		
		System.out.println("\nlocal variable rollno :"+rollno);
		System.out.println("local variable fee :"+fee);
		System.out.println("\nGlobal variable rollno :"+this.rollno);
		System.out.println("global variable fee :"+this.fee);
	}
	
	void display()
	{
		System.out.println("\nrollno :"+rollno+"\tfee :"+fee);
	}
}

public class thisKeyword01 {

	public static void main(String[] args) {
		students s2=new students(11,5000f);
		s2.display();
		

	}

}
