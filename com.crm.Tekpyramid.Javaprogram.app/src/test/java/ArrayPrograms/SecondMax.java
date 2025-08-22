package ArrayPrograms;

public class SecondMax {

	public static void main(String[] args) {

		int []ar= {100,200,300,400,500};
		
		int max=Integer.MIN_VALUE;
		int secmax=Integer.MAX_VALUE;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				secmax=max;
				max=ar[i];
			}
			else if(ar[i]>secmax && ar[i]!=max)
			{
				secmax=ar[i];
			}
		}
		System.out.println(max);
		System.out.println(secmax);
	}

}
