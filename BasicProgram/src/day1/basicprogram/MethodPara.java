package day1.basicprogram;

public class MethodPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getAverage(10,20,30);
		getAverage();

	}
	
	public static void getAverage(int a,int b,int c) {
					int avg;
					avg=(a+b+c)/3;
					System.out.println("Number 1 :"+a);
					System.out.println("Number 2 :"+b);
					System.out.println("Number 3 :"+c);
					System.out.println("\t\tAverage :"+avg);
	}
	
	public static void getAverage() {
		int a=10,b=30,c=40,avg;
		avg=(a+b+c)/3;
		System.out.println("Number 1 :"+a);
		System.out.println("Number 2 :"+b);
		System.out.println("Number 3 :"+c);
		System.out.println("\t\tAverage :"+avg);
}

}
