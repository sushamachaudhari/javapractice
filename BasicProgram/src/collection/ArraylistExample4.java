package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistExample4 {

	public static void main(String[] args) {
		ArrayList<String> arrl=new ArrayList<String>();
		System.out.println(arrl.isEmpty());
		
		arrl.add("Aniket");
		arrl.add("Anuu");
		arrl.add("Bhagu");
		arrl.add("Ladu");
		
		System.out.println("Arraylist arrl :"+arrl);
		System.out.println("***************************");
		
		ArrayList arrlt=new ArrayList<String>();
		arrlt.add("Uday");
		arrlt.add("Pranav");
		arrlt.add("Rita");
		arrlt.add("Anuu");
		
		System.out.println("Arraylist arrl :"+arrlt);
		System.out.println("***************************");
		
	//	arrl.retainAll(arrlt);
	//	System.out.println("after retainall element :"+arrl);
		
//		arrlt.retainAll(arrl);
	//	System.out.println("after retainall element :"+arrlt);
		
		Iterator it=arrl.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
