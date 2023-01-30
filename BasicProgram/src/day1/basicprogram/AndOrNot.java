package day1.basicprogram;

public class AndOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	boolean bool1=true, bool2=true;
		
		//Logical AND--> if both operands are true then only logical AND evaluate true
		System.out.println("\nFirst exp is true and second is true then result of logical AND is:"+(bool1 && bool2));
		
		//Logical OR-->only if either exp1 or exp2 is true
		System.out.println("\nFirst exp is true and second is true then result of logical OR is:"+(bool1 || bool2));
		
		//Logical Not-->true if exp1 is false and vice versa
		System.out.println("\nFirst exp is true and second is true then result of logical Not is:"+!(bool1 && bool2));*/
		
		
			
				int num1=20,num2=30;
				
				//boolean bool1=(num1==num2);
				//boolean bool2=(num1>num2);
				
				// Logical AND
				//System.out.println("bool1 && bool2 = " + ((num1==num2) && (num1>num2)));//
				//System.out.println("logical AND :"+(bool1 && bool2));
				System.out.println("Logical AND :"+((num1==num2) && (num1>num2)));

				// Logical OR
				//System.out.println("bool1 || bool2 = " + ((num1==num2) || (num1>num2))); //
				//System.out.println("logical OR :"+(bool1 || bool2));
				System.out.println("Logical OR :"+((num1==num2) || (num1>num2)));

				// Logical Not
				//System.out.println("!(bool1 && bool2) = " + !((num1==num2) && (num1>num2)));//
				//System.out.println("logical NOT  :"+!(bool1 && bool2));
				System.out.println("Logical NOT :"+!((num1==num2) && (num1>num2)));
				


	}

}
