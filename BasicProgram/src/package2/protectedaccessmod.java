package package2;

import package1.protectedaccess;
public class protectedaccessmod extends protectedaccess{

	public static void main(String[] args) {
		
		protectedaccessmod pram=new protectedaccessmod();
		System.out.println("Accessing Protected members from another class outside of package");
		System.out.println(pram.accNum);
		pram.displayAccNum();

	}

}
