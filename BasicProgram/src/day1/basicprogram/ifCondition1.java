package day1.basicprogram;

public class ifCondition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =19;
		int weight=51;
		
		if (age >= 18)
		{
			System.out.println("Candidate age is :"+age);
				
							if(weight > 50)
							{
								System.out.println("\n You Are eligible to donate blood ");
							}
							else
							{
								System.out.println("\n You Are NOT eligible to donate blood ");
							}
		}
		else
		{
			System.out.println("\n Age must be  greater than 18 ");
		}
		}

	}


