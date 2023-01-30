package day1.basicprogram;


/*class A2 {
	A2() {
		this(5);
		System.out.println("hello a");
	}
	A2(int x) {
		System.out.println(x);
	}
}
class thisState{
	public static void main(String args[]) {
		A2 a = new A2();
	}
}*/

/* class Student101
{
	int rollno;
	float fee;
	
	Student101(int rollno) 
	{
		this.rollno = rollno;
	}
	
	Student101(int rollno, float fee) 
	{
		//this.rollno=rollno;// reusing constructor or
		this(rollno);
		this.fee = fee;
	}
	
	void display() 
	{
		System.out.println(rollno + " " + fee);
	}
}

class thisState{
	public static void main(String args[]) {
		
		System.out.println("**********************Creating S1 object***************************");
		Student101 s1 = new Student101(111);//
		System.out.println(s1.rollno + " " + s1.fee);//
		System.out.println("**********************Creating S2 object***************************");
		Student101 s2 = new Student101(112, 6000f);//
		System.out.println(s2.rollno + " " + s2.fee);//
		System.out.println("*****************Display()*************************");
		s1.display();//
		s2.display();//
	}
}*/

class Student102 {
	int rollno;
	float fee;
	
	Student102(int rollno)
	{
		this.rollno = rollno;	
	}
	
	Student102(int rollno, float fee)
	{
		this(rollno);// C.T.Error
		this.fee = fee;		
	}
	void display() 
	{
		System.out.println(this.rollno + " " +this.fee);
	}
}
class thisState{
	public static void main(String args[]) {
		Student102 s1 = new Student102(111);
		Student102 s2 = new Student102(112, 6000f);
		s1.display();
		s2.display();

	}
}
