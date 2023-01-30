package polymorphisamm;

public class methodoverloading {
	
	public void area()
	{
		System.out.println("find area ");
	}
	
	public void area(int r)
	{
		System.out.println("circle area :"+3.14*r*r);
	}
	
	public void area(double b,double h)
	{
		System.out.println("triangle area :"+0.5*b*h);
	}
	
	public void area(int b,int h)
	{
		System.out.println("rectangle area :"+b*h);
	}

	public static void main(String[] args) {
		methodoverloading mv=new methodoverloading();
		mv.area();
		mv.area(2.5,6.8);
		mv.area(20);
		mv.area(4,9);

	}

}
