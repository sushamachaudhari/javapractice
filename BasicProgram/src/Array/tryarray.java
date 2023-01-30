package Array;

public class tryarray {

	public static void main(String[] args) {
		int age[]=new int[4];
		//or
		int empid[]= {1, 3, 5, 7, 9};
		for(int k=0;k<empid.length;k++)
		{
			System.out.println(empid[k]);
		}
		
		System.out.println("\n");
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		age[0]=2;
		age[1]=6;
		age[2]=8;
		age[3]=10;
		
		System.out.println("******************");
		
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		
		System.out.println("\narray length :"+age.length+"\n");
	//int age[]={ 2, 6, 8, 12 };
		
		for(int i=0;i<age.length;i++)
		{
			System.out.println(age[i]);
			
		}
		
		System.out.println("\n");
		for(int a:age)
		{
		System.out.println(a);	
		}

	}								

}
