package day1.basicprogram;

public class forloop {

	public static void main(String[] args) {
		
		int i;
		int k='a';
		System.out.println(k);
		for(i=0;i<5;i++)
		{
			System.out.println("hello sushama");
		}
		
	/*	System.out.println("\n");
		for(i=0;i<=6;i++)
		{
			System.out.println(i);
		}
			
		System.out.println("\n");
		for(char j='a';j<='d';j++)
		{
			System.out.println(j+" ");
		}
		
		System.out.println("\n");
		for(char j='z';j>='r';j--)
		{
			System.out.println(j+" ");
		}*/
		
	/*		for (i = 0; i < 3; ++i)
			{
				System.out.println("******************* Hello i: " + i);
				for (int j = 0; j < 2; j++)
				{
					System.out.println("############### hi j: " + j);
					for (k = 0; k < 2; k++) 
					{
						System.out.println("bye k: " + k);
					}
				}
			}*/
		
		for (i = 0; i < 10; i++) {
			System.out.println(i);
			i = i + 1;
		}
		System.out.println("*********************************");
		for (i = 0; i <= 10; i++) {
			if (i % 2 == 0) 
			{
				System.out.println(i);
			}
		}
		
		for (i = 0; i < 3; ++i) 
		{
			System.out.println("Hello i= " + i);
			for(int j=0;j<2;j++) 
			{
				System.out.println("Bye j= "+j);
			}
		}
		
		for (i = 0; i < 3; ++i) {
			System.out.println("Hello i= " + i);
			for(int j=0;j<2;j++) {
				System.out.println("\tHi j= "+j);
				for(k=0;k<2;k++) {
					System.out.println("\t\tBye k= "+k);
				}
			}
		}
		
	}

}
