package day30.programtask;

public class countNumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4214, cnt=1;
		if(num!=0)
		{
			for(int i= 0;i<=num;i++)
			{
				
				System.out.println("Number of digit :"+cnt);
			}
		}
		for(; num != 0;num /= 10,++cnt)
		{
			System.out.println("Number of digit :"+cnt);
		}
		
		
		while(num!=0)
		{
			if((num=num/10)>=0)
				{
				cnt++;
				}
		}
		
		System.out.println(cnt);
	}//not understand

}
