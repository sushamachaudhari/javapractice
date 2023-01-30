package day1.basicprogram;

public class MethodAreaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double AreaC=Circle(4);
		System.out.println("Area of circle :"+AreaC);
		
		// Circle(4);
		
		double AreaR=Rectangle(4,8);
		System.out.println("Area of Rectangle :"+AreaR);
	}
	public static Double Circle(double r)
	{
		//int r=4;	
		double AreaofCircle=(3.14*r*r);
		System.out.println("Radius of circle :"+r);
		return AreaofCircle;
	
		//double AreaofCircle=(3.14*r*r);
		//System.out.println("area of circle :"+AreaofCircle);
		//return AreaofCircle;
		
	}
	 static double Rectangle(double l,double w)
	 {
		 double AreaofRec=(l*w);
		 System.out.println("\nlength of circle :"+l+"\nwidth of circle :"+w);
			return AreaofRec;
		 
	 }
 

}
