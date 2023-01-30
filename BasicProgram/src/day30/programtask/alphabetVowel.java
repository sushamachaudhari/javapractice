package day30.programtask;

public class alphabetVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char c1='s';
		
	/*	if(c1== 'a')
		{
			System.out.println("This character is vowel :"+c1);
		}
		else if(c1=='e')
		{
			System.out.println("This character is vowel :"+c1);
		}
		else if(c1=='i')
		{
			System.out.println("This character is vowel :"+c1);
		}
		else if(c1=='o')
		{
			System.out.println("This character is vowel :"+c1);
		}
		else if(c1=='u')
		{
			System.out.println("This character is vowel :"+c1);
		}
		else
		{
			System.out.println("Character is Consonant");
		}*/
		
		checkVowel('b');
	}
		static void checkVowel(char ch2)
		{
			
			if(ch2== 'a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u')
			{
				System.out.println("Given Number is Vowel :"+ch2);
			}
			else
			{
				System.out.println("Given Number is Not Vowel :"+ch2);
			}
		}
	}

