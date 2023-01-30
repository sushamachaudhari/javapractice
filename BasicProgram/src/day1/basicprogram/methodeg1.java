package day1.basicprogram;
class overl
{
	static int multip(int p,int q)
	{
		int res=p*q;
		System.out.println("multiplication of p and q is :"+res);
		return p*q;
	}
	
	  static float multip(int a,float b)
	{
		float result=a*b;
		System.out.println("multiplication of p and q is :"+result);
		return result;
	}
	
	void multip(int a,int b,int c)
	{
		int voidresult3=a*b*c;
		System.out.println("multiplication of a b and c is :"+voidresult3);
	}
	
      void multip(float a,int b)
	{
		float voidresult2=a*b;
		System.out.println("multiplication of a b and c is :"+voidresult2);
	}
	
}
public class methodeg1 {

	public static void main(String[] args) {
		overl.multip(2, 6);
		System.out.println(overl.multip(3, 4));
		//System.out.println("\n");
		overl.multip(5, 2.5f);
		//System.out.println("\n");
		System.out.println("*************");
		overl ov=new overl();
		ov.multip(2, 3, 4);
		ov.multip(4.5f, 2);
		
		

	}

}
