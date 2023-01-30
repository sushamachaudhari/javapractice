package day1.basicprogram;

public class thisKeyword12 {
	
		int variable = 5;	
		int age=10;
		
		public static void main(String args[]) 
		{
			thisKeyword12 obj=new thisKeyword12();
			obj.method(20);
			obj.method();	
			System.out.println("obj GV variable: "+obj.variable);//
			thisKeyword12 obj2=new thisKeyword12();
			System.out.println("obj2 GV variable: "+obj2.variable);//
		}
		
		void method(int variable) 
		{
			System.out.println("Value of variable :" + variable);//
			System.out.println("GV Value of variable :" + this.variable);//
			this.variable=variable;
			System.out.println("Value of variable :" + variable);//
			System.out.println("GV Value of variable :" + this.variable);//
		}
		
		void method() 
		{
			int variable = 40;
			System.out.println("Value of variable :" + variable);
			
	
	}

}
