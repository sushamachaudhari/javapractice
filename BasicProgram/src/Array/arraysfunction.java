package Array;
import java.util.Arrays;

public class arraysfunction {

	public static void main(String[] args) {
		
		int[] num= {20,28,36,44,52,66,10,8};
		for(int num1:num)
		{
			System.out.println(num1);
		}
		
		System.out.println("****copy of arrays**** ");
		int[] num2=Arrays.copyOf(num, 8);
		for(int nm:num2)
		{
			System.out.println(nm);
		}
		
		System.out.println("****compare two arrays**** ");
		System.out.println("is num and num2 are same? "+Arrays.equals(num, num2));
		
		System.out.println("****sort of arrays**** ");
		Arrays.sort(num2);
		for(int n:num2)
		{
			System.out.println(n);
		}
		
		System.out.println("****after sorting compare two arrays**** ");
		System.out.println("is num and num2 are same? "+Arrays.equals(num, num2));
		
		System.out.println("*************CopyRange array***************");
		int[] num3=Arrays.copyOfRange(num, 0, 5);
		for(int a:num3){
			System.out.println(a);
		}
		

	}

}
