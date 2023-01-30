package arrayAssignment;

public class evenoddnumbers {

	public static void main(String[] args) {
	 int[] arr= {2, 6, 8, 11, 12, 54, 34};
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 if(arr[i]%2==0)
		 {
			 System.out.print("\t"+arr[i]);
		 }
	 }
	
	 
     System.out.println("\n");
	 System.out.println("*************");
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 if(arr[i]%2!=0)
		 {
			 System.out.println("odd number :"+arr[i]);
		 }
	 }
	}

}
