package package2;

import package1.privateaccess;

public class privateaccessmodifier {

	public static void main(String[] args) {
		privateaccess pa=new privateaccess();
		System.out.println(pa.accnum);
		pa.displayaccNum();

	}

}
