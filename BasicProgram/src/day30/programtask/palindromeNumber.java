package day30.programtask;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem,sum=0,temp;
		int number=121;
		
		temp=number;
		
		while(number>0)
		{
			rem=number%10;
			sum=(sum*10)+rem;
			number=number/10;
		}
		
		if(temp==sum)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not Palindrome number");
		}
		
	}

}
