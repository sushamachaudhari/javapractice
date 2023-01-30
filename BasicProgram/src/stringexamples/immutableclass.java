package stringexamples;
public final class ImmutableClass {
	/**
	 * Class and its data members should be declared as final
	 * Constructor should be parameterized, so that above data members can be initialize 
	 * Only getter() method should be written in the class for data members
	 */
	final String name;
	final double salary;
	ImmutableClass(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
}
public class immutableclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableClass obj=new ImmutableClass("Pune",656535);
		System.out.println(obj.getName());
		System.out.println(obj.getSalary());
//		obj.name="nbjh";
//		obj.salary=356565;
		
		

	}

}
