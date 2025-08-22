package ArrayPrograms;

import java.util.Arrays;

public class ShiftZero {

	public static void main(String[] args) 
	{
		int ar[]= {0,0,1,3,4,0};
		int b[]=new int[ar.length];
		int index=b.length-1;

		for(int i=ar.length-1;i>=0;i--)
		{
			if(ar[i]!=0)
			{
				b[index--]=ar[i];
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
