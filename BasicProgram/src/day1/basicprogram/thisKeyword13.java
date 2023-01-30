package day1.basicprogram;

public class thisKeyword13 {

	int variable=51;
	
	public static void main(String[] args) {
		thisKeyword13 obj = new thisKeyword13();
		obj.method(20);
		obj.method();
		System.out.println("Value of Instance variable :" + obj.variable);//
	}
	void method(int variable) {
		System.out.println("Value of Local variable :" + variable);//
		variable = 10;
		System.out.println("Value of Local variable :" + variable);//
		System.out.println("Value of Instance variable :" + this.variable);//
		this.variable=variable;
		System.out.println("Value of Local variable :" + variable);//
		System.out.println("Value of Instance variable :" + this.variable);//
	}
	void method() {
		int variable = 40;
		System.out.println("Value of Instance variable :" + this.variable);//
		System.out.println("Value of Local variable :" + variable);//
		this.variable=variable;
		System.out.println("Value of Local variable :" + variable);//
		System.out.println("Value of Instance variable :" + this.variable);//

	}

}
