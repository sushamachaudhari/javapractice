package day30.programtask;

public class largestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=20,b=30,c=40;
			
	/*		if(a>b && a>c)
			{
				System.out.println("A is largest number");
				
				if(b>a && b>c)
				{
					System.out.println("B is largest number");
				}
				else
				{
				 	System.out.println("c is not largest number");
				}
			
				}
				else
				{
					System.out.println("C is largest number");
				}*/
			
	/*		if(a>b && a>c)
			{
				System.out.println("A is largest number");
			}
			else if(b>c && b>c)
			{
				System.out.println("B is largest number");
			}
			else if(c>a && c>b)
			{
				System.out.println("C is largest number");
			}
			else
			{
				System.out.println("Not Any");
			}
			System.out.println("\nProgram Ends");*/
			findLargeNum(8,4,6);
	}
				 	
		static void findLargeNum(int a,int b,int c)
		{
			if((a>b && a>c) || (b>a && b>c))
			{
				System.out.println(" A largest number is :"+a);
			}
			else if(c>a && c>b)
			{
				System.out.println("C largest number is :"+c);
			}
			else
			{
				System.out.println("B largest number is :"+b);
			}
			
		}
	
	
	

}
