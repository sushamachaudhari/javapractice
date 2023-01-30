package day1.basicprogram;

public class nonstaticBlocks {
	
	
	nonstaticBlocks()
	{
		System.out.println("zero param");
	}
	
	nonstaticBlocks(int a)
	{
		System.out.println("int- param");
	}
	
	{
		System.out.println("running non-static blocks");
	}
	
	static {
		System.out.println("running static blocks1");
	}
	
	
	public static void main(String[] args) {
	
		System.out.println("\nmain() start");
		nonstaticBlocks b1=new nonstaticBlocks();
		System.out.println("**********");
		nonstaticBlocks b2=new nonstaticBlocks(10);
		System.out.println("main() ends");

	}
	
	{
		System.out.println("running non-static blocks2");
	}
	
	static {
		System.out.println("running static blocks2");
	}
	

}
