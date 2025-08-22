package ArrayPrograms;

public class Minimun_And_Maximum_No {
	
	public static void main(String[] args) {
		
		int ar[]= {100,1,122,300,12};
		
		int max=ar[0];
		int min=ar[0];
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
			if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}

}
