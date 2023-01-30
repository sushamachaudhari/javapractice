package day1.basicprogram;

public class nonstaticLocalglobal {
	
	final int empId=25;
	

	public static void main(String[] args) {
		int age=24;
		System.out.println("I am local variable age :"+age);
		nonstaticLocalglobal ns=new nonstaticLocalglobal();
		System.out.println(ns.empId);
		ns.display();

	}
	
	void display()
	{
		int empId=45;
		System.out.println("\nI am local variable empId :"+empId);
	}
	
  /*   static int age=25;
	

	public static void main(String[] args) {
		int age=24;
		System.out.println("I am local variable age :"+age);
		
		System.out.println("I am global variable age :"+nonstaticLocalglobal.age);*/
	}
	
	


