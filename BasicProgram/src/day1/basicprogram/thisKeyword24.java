package day1.basicprogram;

public class thisKeyword24 {
	 int a;
	    int b;     
	    // Parameterized constructor
	    thisKeyword24(int p, int q)
	    {
	    	System.out.println("*****");
	        this.a = p;
	        this.b = q;
	    } 
	    void display()
	    {
	        //Displaying value of variables a and b
	        System.out.println("a = " + a + "  b = " + b);
	    } 

	public static void main(String[] args) {
		thisKeyword24 object = new thisKeyword24(10, 20);
       object.display();
        System.out.println(object.a+" "+object.b);//
        thisKeyword24 object2 = new thisKeyword24(102, 201);
        object2.display();
        System.out.println(object2.a+" "+object2.b);//

	}

}
