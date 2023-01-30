package day30.programtask;

public class displayText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	for(int i=0;i<5;i++)
		{
			System.out.println("Hello, This is Sushama");
		}
		
		System.out.println("******");
		
		for(int num=1;num<=5;num++)
		{
			System.out.println(num+" ");
		}*/
		disText('a');
		disNumber(1);

	}
	
	static void disText(char ch)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Sushama,this side ");
		}
	}
	
	static void disNumber(int c)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(" "+i);
		}
	}

}
