package package1;

public class publicaccess {
	public int accNum=12345;
	public void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}

	public static void main(String[] args) {
		publicaccess pub=new publicaccess();
		System.out.println(pub.accNum);
		pub.displayAccNum();

	}

}

class AccessPublicMembers {

	public static void main(String[] args) {		
		publicaccess pub=new publicaccess();
		System.out.println("Accessing Default members from child class");
		System.out.println(pub.accNum);
		pub.displayAccNum();
	}
}
/**
member can be access from anywhere but make sure that class should be declared as public
*/

