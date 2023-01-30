package day30.programtask;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int number=1234;
			int revNumber=0;
			
	/*		for(int i=0;(number % 10) != 0;i++)
				{
				revNumber=(revNumber * 10) + (number % 10);
				number=number/10;
				//System.out.println(i);
				}
			System.out.println("Reverse Number => "+revNumber);*/
			
			
			while(number!=0)
			{
				 int rem=number%10;
				revNumber=revNumber*10+rem;
				number=number/10;
			}
			System.out.println(revNumber);
			
			revNumber(6548);
	}
	
	static void revNumber(int a)
	{
		int rev=0;
		for(int i=0;(a%10)!=0;i++)
		{
			rev=(rev*10)+(a%10);
			a=a/10;
			//num123 12 1
			//rem  3  2 1
			//rev  3 32 1
		}
		System.out.println("Reverse number => "+rev);
	}

}
