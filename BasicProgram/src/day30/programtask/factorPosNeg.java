package day30.programtask;

public class factorPosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=20;
		
		//System.out.println("Factors of "+number+" are: ");
		
	/*	for(int i=1;i<=number;i++)//number is divided by i --> i is factor
		{
			if(number%i==0)
			{
				System.out.print(i+" ");
			}
		}*/
		factor(20);

	}
	static void factor(int num)
	{
		System.out.println("factors of "+num+" are: ");
		for(int i=1;i<=num;i++)//number is divided by i --> i is factor
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
