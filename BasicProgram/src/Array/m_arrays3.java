package Array;
class TestSample{
	void callMe() {
		System.out.println("Hello");
	}
}
public class m_arrays3  extends TestSample{

	static int last_roll = 100;
	int roll_no;
	// Constructor
	m_arrays3()
    {
        roll_no = last_roll;
        last_roll++;
    }
	@Override
	public int hashCode() {
		return 505;
	}
	@Override
    public String toString()
    {
        return "BasicCoreJava";
    }
	// Driver code

	public static void main(String[] args) {
		m_arrays3 s = new m_arrays3();
		// Below two statements are equivalent
		System.out.println(s.hashCode());
		System.out.println(s);
		 TestSample t1=new TestSample();
		 System.out.println(t1);
		 System.out.println(t1.hashCode());
		 

	}

}
