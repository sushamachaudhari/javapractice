package day30.programtask;

public class sumNaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int i,num=10,sum=0;
		
		for(i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum Of First 10 Natural Numbers is :"+sum);*/
		
		sumNatNumber(10);
	}
	static void sumNatNumber(int a)
	{
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			sum=sum+i;
		}
		System.out.println(" "+sum);
	}

}
