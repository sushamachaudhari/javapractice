package day1.basicprogram;

public class Unaryope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int a=10;
				int b=a;
				System.out.println("a :"+a);
				System.out.println("b :"+b);
				
		/* Pre - first perform the operation then use the updated value
		 Post- first use the value then perform the operation */
				
				int k=++a;
				System.out.println("k :"+k);
				System.out.println("a :"+a);
				
				int j=k++;
				System.out.println("k :"+k);
				System.out.println("j :"+j);
				
				int r=21;
				System.out.println("\n r :"+r++);
				System.out.println("\n r :"+r);
				System.out.println("\n r :"+ ++r);
				System.out.println("\n r :"+r);
				
				
				int x=105;
				System.out.println("\n x :"+ ++x);
				System.out.println("\n r :"+ x--);
				System.out.println("\n r :"+ x++);
				System.out.println("\n r :"+ --x);				
	}

}
