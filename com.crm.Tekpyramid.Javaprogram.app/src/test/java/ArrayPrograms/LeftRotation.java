package ArrayPrograms;

import java.util.Arrays;

public class LeftRotation {

	public static void main(String[] args) {

		int ar[]= {1,2,3,4,5};
		for(int i=0;i<3 ;i++)
		{
			int temp=ar[0];

			for(int j=0;j<ar.length-1;j++)
			{
				ar[j]=ar[j+1];
			}
			ar[ar.length-1]=temp;
		}
		System.out.println(Arrays.toString(ar));	
	}

}
