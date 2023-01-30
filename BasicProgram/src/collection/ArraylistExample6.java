package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class ArraylistExample6 {

	public static void main(String[] args) {
		
		ArrayList arr=new ArrayList();
		System.out.println("this arraylist are empty :\t"+arr.isEmpty());
		
		System.out.println("Arraylist elements are :\t"+arr);
		System.out.println("size of arraylist :\t\t"+arr.size());
		
		arr.add("Sushama");
		arr.add("Sush");
		arr.add("Rani");
		arr.add("SushamaRani");
		System.out.println("Arraylist elements are :\t"+arr);
		
		System.out.println("\t********************************************************");
		
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
		System.out.println("\t***********************************************************");
		
		for(Object b:arr)
		{
		System.out.println(b);	
		}
		System.out.println("\t***********************************************");
		
		Iterator itr=arr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		arr.add(2,"susha");
		System.out.println("Arraylist elements are :\t"+arr);
		arr.add("sushhhhhh");
		System.out.println("Arraylist elements are :\t"+arr);
		arr.set(2, "Shrush");
		System.out.println("Arraylist elements are :\t"+arr);
		
		
		
	}

}
