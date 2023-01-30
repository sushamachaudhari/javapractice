package arrayAssignment;

import java.util.Arrays;

public class copyArray {

	public static void main(String[] args) {
		int[] empid= {2,4,9,8,10};
		
		for(int i=0;i<empid.length;i++)
		{
			System.out.println(empid[i]);		
		}
		
		System.out.println("************");
		int[] empids=Arrays.copyOf(empid, 5);
		
		for(int k=0;k<empids.length;k++)
		{
			System.out.println(empids[k]);
		}
		System.out.println("*******************************");
		
		for(int num:empids)
		{
			System.out.println(num);
		}
		
		System.out.println("*************CopyRange array***************");
		int[] num2=Arrays.copyOfRange(empids, 2, 4);
		for(int a:num2){
			System.out.println(a);
		}
		
		//sort will sort the elements of an array in ascending order and stores in the same array
				Arrays.sort(empid);
				System.out.println("************num1 after sorting***************");
				for(int a:empid) {
					System.out.println(a);
				}
		
		
	}

}
