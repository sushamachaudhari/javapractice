package arrayAssignment;

public class evenposition {

	public static void main(String[] args) {
int[] arr= {4, 8, 12, 22, 30, 48, 62};
		
		//System.out.println("length :"+arr.length);

		//int even=arr[2];
		for(int i=1;i<arr.length;i=i+2)
		{
			System.out.println("even "+arr[i]);
		}
		
		System.out.println("***********************");

		for(int i=0;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
		}
		
	}

}
