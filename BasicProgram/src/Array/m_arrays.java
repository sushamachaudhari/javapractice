package Array;

public class m_arrays {

	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		System.out.println("length of arrays :"+arr.length);//number of rows
		
		for(int i=0;i<arr.length;i++)//row count
		{
			for(int j=0;j<arr[i].length;j++)//cell count on current row
			{
				System.out.print(arr[i][j]+"");
			}
			System.out.println();
		}
		
		System.out.println("*****************************");
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		// printing 2D array
		for (int i = 0; i < arr.length; i++) {// to get row num
			for (int j = 0; j < arr[i].length; j++) {// to get column for above row
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println("***************************");
		
			//declaring and initializing 2D array  
			int arr1[][] = { { 2, 4, 6 }, { 8, 10 }, { 12,8,9,4} };//each entry is one row
			//printing 2D array  
			for (int m = 0; m < arr1.length; m++) {
				for (int j = 0; j < arr1[m].length; j++) {
					System.out.print(arr1[m][j] + " ");
				}
				System.out.println();
			}
			System.out.println("***************************");
			
			char[] charArr[]= {{'a','b'},{'e','c','d'},{'x','y','z'}};
			for (int i1 = 0; i1 < charArr.length; i1++) {
				for (int j = 0; j < charArr[i1].length; j++) {
					System.out.print(charArr[i1][j] + " ");
				}
				System.out.println();
			}
		}

	}


