package package2;

import package1.publicaccess;
public class publicaccessmod {

	public static void main(String[] args) {
		publicaccess pub=new publicaccess();
		System.out.println("Accessing Default members from another class outside package");
		System.out.println(pub.accNum);
		pub.displayAccNum();

	}

}
