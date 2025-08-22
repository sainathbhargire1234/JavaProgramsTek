package BasicPrograms;

public class Palimdrome_Number {
	public static void main(String[] args) {

		int num=955499;
		int rev=0;
		int temp=num;
		
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
			if(temp==rev)
			{
				System.out.println(temp +": palimdrome");
			}
			else 
			{
				System.out.println(temp +":Not palimdrome");

			}
	}

}
