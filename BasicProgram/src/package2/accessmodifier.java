package package2;

public class accessmodifier {
	
	private int num1=10;
	int num2=20;
	protected int num3=30;
	public int num4=40;
	
	public static void main(String[] args) {
		
		accessmodifier am=new accessmodifier();
		System.out.println("private num1 :"+am.num1);
		System.out.println("default num2 :"+am.num2);
		System.out.println("protected num3 :"+am.num3);
		System.out.println("public num4 :"+am.num4);

	}

}
class modifiers{
	public static void main(String[] args) {
		
		accessmodifier am=new accessmodifier();
		//System.out.println("private num1 :"+am.num1);
		System.out.println("default num2 :"+am.num2);
		System.out.println("protected num3 :"+am.num3);
		System.out.println("public num4 :"+am.num4);
		
	}
	
}
