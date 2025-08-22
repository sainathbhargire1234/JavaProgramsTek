package BasicPrograms;

public class PrimeNo {

	public static void main(String[] args) {

		int num=50;
		boolean flag=true;  //we consider each no is prime
		
		for(int i=2;i<num-1;i++)
		{
			if(num%2==0)
			{
				flag=false; //num is not prime
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(num +"Num is prime");
		}
		else 
		{
			System.out.println(num +": Num is Not prime");
		}
	}

}
