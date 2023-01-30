package day30.programtask;

public class isPosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
	/*	if(number>0)
		{
			System.out.println("Number is Positive");
		}
		else 
		{
			System.out.println("Number is Negative");
		}*/
		
		
/*		if(number>0)
		{
			System.out.println("Number is Positive");
		}
		else if(number<0)
		{
			System.out.println("Number is Negative");
		}
		else
		{
			System.out.println("Zero");
		}*/
		isPositiveNeg(-8);
	}
	
	
	static void isPositiveNeg(int num)
	{
		if(num>0 )
		{
			System.out.println("Number is positive ");
		}else if(num<0)
		{
			System.out.println("Number is Negative");
		}else
		{
			System.out.println("Zero");
		}
		
		
	}

}
