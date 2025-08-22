package ArrayPrograms;

import java.util.Arrays;

public class LeftRotation1 {

	public static void main(String[] args) {

		int ar[]= {1,2,3,4,5};
		int temp=ar[0];

		for(int i=0;i<ar.length-1;i++)
		{
			ar[i]=ar[i+1];
		}
		ar[ar.length-1]=temp;
		System.out.println(Arrays.toString(ar));
	}

}
