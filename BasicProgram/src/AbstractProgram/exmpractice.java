package AbstractProgram;

interface country
{
	int age=24;
	void draw();
    public void paint();
}

interface maharashtra
{
	char name='s';
	void run();
	abstract void talk();
} 

interface pune extends maharashtra
{
	void smile();
}

class gaon implements pune
{
	public void smile()
	{
		
		System.out.println("i'm smiling gaon");
	}
	
	public void talk()
	{
		System.out.println("i'm talking gaon");
	}
	
	public void run()
	{
		System.out.println("i'm running gaon");
	}
}

class taluka implements country
{
	public void draw()
	{
		System.out.println("i'm drawing taluka");
	}
	
	public void paint()
	{
		System.out.println("i'm painiting taluka");
	}
}

class dist implements maharashtra
{
	public void talk()
	{
		System.out.println("i'm dist maha talk ");
	}
	public void run()
	{
		System.out.println("i'm running dist maharashtra");
	}
}

class state implements country,maharashtra
{
	int salary=12;
	public void talk()
	{
		System.out.println("i'm dist talk ");
	}
	public void run()
	{
		System.out.println("i'm running maharashtra");
	}
	public void draw()
	{
		System.out.println("i'm drawing state ");
	}
	
	public void paint()
	{
		System.out.println("i'm painting state");
	}
}
 
class khor1
{
	int salary=1;
	void happy()
	{
		System.out.println("happy");
	}
}

class khor extends khor1
{
	double salary=35000;
	//System.out.println("salary :"+salary);
	//System.out.println("khor1 salary :"+this.salary);
	
}


public class exmpractice {

	public static void main(String[] args) {
		System.out.println("country age :"+country.age);
		state st=new state();
		st.draw();
		st.paint();
		st.run();
		
		System.out.println("maha name :"+maharashtra.name);
		System.out.println("maha salary :"+st.salary);
		System.out.println("*************");
		dist dt=new dist();
		dt.talk();
		dt.run();
		System.out.println("*************");
		taluka tl=new taluka();
		tl.draw();
		tl.paint();
		System.out.println("*************");
		gaon ga=new gaon();
		ga.smile();
		ga.talk();
		ga.run();
	}

}
