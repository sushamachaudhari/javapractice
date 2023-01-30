package day1.basicprogram;

public class finalKeyword2 {
	
/*	final int speedLimit=50;//blank final variable

	
			finalKeyword2(){
				
				System.out.println(speedLimit);
			}
	public static void main(String[] args) {
		finalKeyword2 f2=new finalKeyword2();
		//System.out.println(f2.speedLimit);*/

		final static int speedLimit;//blank final variable
		final int speedLimit1;
		
		/*finalKeyword2(){
			speedLimit=90;
			System.out.println(speedLimit);
		}*/
		static {
			speedLimit=50;
			System.out.println(speedLimit);
		}
		
	/*    {
		speedLimit1=20;
		System.out.println(speedLimit1);
		}*/
	    finalKeyword2(){
	    	speedLimit1=10;
	    	System.out.println(speedLimit1);
	    }		
	    
	    finalKeyword2(int a)
	    {
	    	
	    	speedLimit1=30;
	    	System.out.println(a);
	    	System.out.println(speedLimit1);
	    }
		
public static void main(String[] args) {
	//finalKeyword2 f2=new finalKeyword2();
	//System.out.println("f2 :"+f2.speedLimit);
		System.out.println("************");
		finalKeyword2 f2=new finalKeyword2();
		//System.out.println(f2.speedLimit1);
		finalKeyword2 f1=new finalKeyword2(5);
		
	}

}

