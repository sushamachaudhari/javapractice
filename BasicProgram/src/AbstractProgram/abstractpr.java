package AbstractProgram;

abstract class country1{
	abstract void name();
	void display(char s)
	{
		System.out.println("country name :"+s);
	}
}

class state1 extends country1{
	 void name() {
		super.display('I');
		System.out.println("country name is Maharashtra");
	}
	
	void display()
	{
		System.out.println("state1 display");
	}
	
	
}
public class abstractpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		state1 sts=new state1();
		sts.name();
		sts.display();
		
		country1 cn=new state1();
		cn.name();
		
		

	}

}
