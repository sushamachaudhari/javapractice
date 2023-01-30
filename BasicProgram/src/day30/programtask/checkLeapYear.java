package day30.programtask;

public class checkLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = 2023;
		if (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR");
		} else {
			System.out.println("COMMON YEAR or NON LEAP YEAR");
		}
		
		
		boolean res=checkLeapYear(2023);
		System.out.println("\n2023 result  status1: "+res);
				
		System.out.println("***********");
		boolean res1=checkLeapYear(2024);
		System.out.println("\n2024 result status2: "+res1);
		
		
		
	}
	static boolean checkLeapYear(int year1) {
		if (((year1 % 4 == 0) && (year1 % 100 != 0)) || (year1 % 400 == 0)) {
			System.out.println("\nLEAP YEAR");
			return true;
		} else {
			System.out.println("Non leap year");
			return false;
		}
		
		
		
	}

}
