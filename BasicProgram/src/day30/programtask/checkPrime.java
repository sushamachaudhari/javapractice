package day30.programtask;

public class checkPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int num=30;
		boolean f=false;
		
		for(int i=2;i<=num/2;++i)
		{
			if(num%i==0)
			{
				f=true;
				break;
			}
		}
		
		if(!f)
		{
			System.out.println(num+" is a prime number");
		}
		else
		{
			System.out.println(num+" is not a prime number");	
		}*/
		//prime(30);
		
		//using for loop
/*		int num=13,count=0;
		for(int i=2;i<num;i++)
				if(num%i==0)
				 count++;
		
		if(count>0)
		{
			System.out.println(num+" number is prime");
		}else
		{
			System.out.println(num+" number is not prime");
		}*/
			
		
		int num=12,i=2,count=0;
		while(i<num)
		{
			if(num%i==0)
			{
				count++;
			}
			i++;
		}
		
		if(count==0)
		{
			System.out.println("\n"+num+" is a prime");
		}
		else
		{
			System.out.println("\n"+num+" is not prime");
		}
				
		
		
	}
	

		
		
	

}
