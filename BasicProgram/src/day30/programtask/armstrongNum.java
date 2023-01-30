package day30.programtask;

public class armstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153,cnt=0,temp=num,arm=0;
		
		for(int i=0;i<=num;i++)
		{
			if((num=num/10)>=0)
			{
				cnt++;
			}
		}
		num=153;
		System.out.println("count: "+cnt);
		System.out.println(num);
		
		int rem=0;
		for(int j=0;j<=temp;j++)
		{
			rem=temp%10;
			arm=(int)(arm + (Math.pow(rem, cnt)));
			temp=temp/10;
			j=0;
		}
		
		//System.out.println(arm);
		
		if(arm==num)
		{
			System.out.println(num+" is Armstrong Number");
			
		}
		else
		{
		System.out.println(num+" is Not Armstrong Number");
		}
		

	}

}
