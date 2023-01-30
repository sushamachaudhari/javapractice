package day30.programtask;

public class swapiing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		swapTwoNumber(5,4);
		swappingNum(6,3);
		
	}
	
	static void swapTwoNumber(int a,int b)
{
	/*int swap=a+b;//swap=5+4=9
	a=swap-b;// 4=9-5=4
	b=swap-a;*/

		int swap=a;//swap=a+b;5+4=9
		a=b;//swap=swap-b;9-4=5
		b=swap;
	System.out.println("number a :"+a);
	System.out.println("number b :"+b);
	//System.out.println("number b :"+swap);

}
	
	static void swappingNum(int x,int y)
	{
		int swapp=0;
		swapp=x+y;
		x=swapp-x;
		y=swapp-x;
		System.out.println(x+" "+y+" ");
		
	}
}


