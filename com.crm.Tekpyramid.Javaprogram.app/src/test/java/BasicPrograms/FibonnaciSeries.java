package BasicPrograms;

public class FibonnaciSeries {

	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		
		for(int i=1;i<=100;i++)
		{
			System.out.print(a +" ");

			int c=a+b;
			a=b;
			b=c;
		}

	}

}
