package day1.basicprogram;

public class finalParameter {
	
	int cube(final int n)
	{
		System.out.println(n);
		int b = n*n*n;
		System.out.println("cube is :"+b);
		return b;
	}

	public static void main(String[] args) {
		
		finalParameter fp=new finalParameter();
		//System.out.println(fp.cube(5));
		fp.cube(5);
	}

}
