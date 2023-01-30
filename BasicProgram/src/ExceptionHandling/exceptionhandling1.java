package ExceptionHandling;

public class exceptionhandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program starts from here...");
		//4. abnormal statements
		String s="abc";  
		int num=Integer.parseInt(s);//NumberFormatException  
		System.out.println("num: "+num);
		System.out.println("Programs ends here...");

	}

}
