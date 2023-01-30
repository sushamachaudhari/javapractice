package day1.basicprogram;

public class isEvenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				

		/*	if(number%2==0) 
				{
					System.out.println(" Number is Even ");	
				}
				else
				{
					System.out.println(" Number is Odd");
				}*/
				//checkEvenOddNumber(89);
				
			//	checkEvenOrOdd(30);
			//	System.out.println(checkEvenOrOdd(30));
		
		//checkEvenOddNumber(100);
		//System.out.println(checkEvenOddNumber(100));
		
		checkEvenOddNumbers(100);
		
		
	}		
	
	/*	static boolean checkEvenOrOdd(int a)
			{
				if(a%2==0)
				{
					System.out.println("even number :"+a);
					return true;
				}
				else
				{
					System.out.println("odd number :"+a);
					return false;
				}
			}*/
		
/*		static void checkEvenOddNumber(int num1)
		{
		
			if(num1%2==0)
			{
				System.out.println("Given number is even number :"+num1);
				
				
			}
			else
			{
				System.out.println("Given number is odd number :"+num1);
				
			}
		
		}*/
			
		
	static int checkEvenOddNumbers(int num2)
		{
		
			if(num2%2==0)
			{
				System.out.println("Given number is even number :"+num2);
				return num2;
				
			}
			else
			{
				System.out.println("Given number is odd number :"+num2);
				return num2;
			}
		
		}
		
}
	

