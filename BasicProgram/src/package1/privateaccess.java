package package1;

public class privateaccess {
	private int accnum=1002;
	private void displayaccNum()
	{
		System.out.println("accnum :"+accnum);
	}

	public static void main(String[] args) {
		privateaccess pa=new privateaccess();
		System.out.println(pa.accnum);
		pa.displayaccNum();

	}

}

class AccessPrivateMembers2 {

	public static void main(String[] args) {
		
		privateaccess pa=new privateaccess();
		//System.out.println(pa.accnum);
		//pa.displayAccNum();
	}
}