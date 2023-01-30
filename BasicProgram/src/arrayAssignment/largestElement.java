package arrayAssignment;

public class largestElement {

	public static void main(String[] args) {
		int[] arr= {8, 20, 26, 80, 50, 75,81};
		
		System.out.println("length of array :"+arr.length);
		
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max < arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("largest element in array is :"+max);

	}

}
