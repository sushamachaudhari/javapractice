package collection;

import java.util.ArrayList;
import java.util.List;

 class Book{
	int id;
	String name, author;
	int quantity;
	public Book(int id,String name,String author,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.quantity=quantity;
	}
	
}

/* class Book {
	int id;
	String name, author, publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}*/
public class Arraylistexample5 {

	public static void main(String[] args) {
		List<Book> list=new ArrayList<Book>();
		System.out.println("is empty :"+list.isEmpty());
		
		Book b1=new Book(101,"sush","sushama",2);
		Book b2=new Book(102,"Rani","sushamaRani",4);
		
		System.out.println("this list elements are :"+list);
		
		list.add(b1);
		list.add(b2);
		
		System.out.println("this list elements are :"+list);
		System.out.println(list.get(0).id);
		System.out.println(b1.name);
		
		for(Book b:list)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.quantity);
		}
		System.out.println("*****************");
		
		list.add(new Book(103,"sushhh","rani",6));
		for(Book b:list)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.quantity);
		}
		
/*		List<Book> list = new ArrayList<Book>();//Generic
		// Creating Books
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(new Book(104, "Let us Code it", "xyz", "pqr", 5));
		
		System.out.println("List of Book class elements: "+list);
		System.out.println(list.get(0).name);
		//				   b1.name
		System.out.println(b1.name);
		// Traversing list
		for (Book b : list) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		
	}*/
	}
}
