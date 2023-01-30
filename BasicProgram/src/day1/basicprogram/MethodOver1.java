package day1.basicprogram;

/* class adder{
	
	static int add(int a,int b)
	{
		return a+b;
	}
	
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
}

public class MethodOver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("methodoverloading :"+adder.add(10,10));
	System.out.println("methodoverloading :"+adder.add(10,10,10));

	}

}*/


class adder{
	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public void add(int a,int b,char c)
	{
		System.out.println(a+"  "+b+"  "+c);
	}
}

public class MethodOver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adder ad=new adder();
		
		ad.add(10,10);
		ad.add(10,10,'a');
		
		System.out.println(ad.add(20, 13));
	//System.out.println("\n methodoverloading :"+ad.add(10,10));
//	System.out.println("methodoverloading :"+ad.add(10,10,'a'));

	
	}

}
