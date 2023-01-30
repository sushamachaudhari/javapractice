package day30.programtask;

public class quotRem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		printQuotientRem(25,6);
	}
	static void printQuotientRem(int num3,int num4)
	{
		int rem=num3%num4;
		int q=num3/num4;
		System.out.println("Remainder is : "+rem);
		System.out.println("Quotientis is : "+q);
	}

}
