package Assign2;

public class Assignment2 {
	
	public void revNumber(int a)
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

	public static void main(String[] args) {
	
			Assignment2 ass=new Assignment2();
			ass.revNumber(2345);
	}

}
