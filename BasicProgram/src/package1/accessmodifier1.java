package package1;

import package2.accessmodifier;

public class accessmodifier1 extends accessmodifier{

	public static void main(String[] args) {
		
		accessmodifier1 ams=new accessmodifier1();
		//System.out.println("private num1 :"+ams.num1);
	//	System.out.println("default num2 :"+ams.num2);
		System.out.println("protected num3 :"+ams.num3);
		System.out.println("public num4 :"+ams.num4);
		
		System.out.println("############");
		
		accessmodifier am=new accessmodifier();
	//	System.out.println("private num1 :"+am.num1);
		// System.out.println("default num2 :"+am.num2);
	//	System.out.println("protected num3 :"+am.num3);
		System.out.println("public num4 :"+am.num4);
		

	}

}
