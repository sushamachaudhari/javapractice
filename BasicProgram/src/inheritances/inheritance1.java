package inheritances;


class testing10{
	//default constructor
	void callingFromVoda() {
		System.out.println("Vodaphone network busy");
	}
}
class testing20 extends testing10{
	//default constructor with default super()
	void callingFromIdea() {
		System.out.println("Get Idea sirji");
	}
}
class testing30 extends testing20{
	//default constructor with default super()
	void callingFromAirtel() {
		System.out.println("try evrything");
	}
}

public class inheritance1 extends testing30{

	void callingMe() {
		System.out.println("I am calling....");
	}
	
	public static void main(String[] args) {
		
		inheritance1 e1=new inheritance1();
		e1.callingMe();
		e1.callingFromAirtel();
		e1.callingFromIdea();
		e1.callingFromVoda();

	}

}
