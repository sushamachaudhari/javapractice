package package1;

public class protectedaccess {
	protected int accNum=12345;
	protected void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}

	public static void main(String[] args) {
		protectedaccess pra=new protectedaccess();
		System.out.println("acc number "+pra.accNum);
		pra.displayAccNum();
	}

}

class AccessProtectedMembers {
	public static void main(String[] args) {		
		protectedaccess pra=new protectedaccess();
		System.out.println("Accessing Protected members from child class");
		System.out.println(pra.accNum);
		pra.displayAccNum();
	}
}
/**
protected members are mainly accessible within package only but can we access from another package using inheritance
*/