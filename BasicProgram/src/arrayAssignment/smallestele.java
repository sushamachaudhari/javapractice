package arrayAssignment;

public class smallestele {

	public static void main(String[] args) {
		int[] arr= {10, 22, 8, 42, 66};
		 
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(min > arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("smallest element in array :"+min);

	}

}
