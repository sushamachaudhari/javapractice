package day1.basicprogram;

class Student{
	int rollno;
	float fee;
	
	Student(int a,float b)
	{
		rollno=a;
		fee=b;
		
	}
	
	void display()
	{
	
		System.out.println("rollno :"+rollno+"\tfee :"+fee);
	}
}

public class thisKeyword {

	public static void main(String[] args) {
		Student s1=new Student(30,6000);
		s1.display();

	}

}
