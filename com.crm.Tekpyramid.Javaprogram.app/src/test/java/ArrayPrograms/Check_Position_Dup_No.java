package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Check_Position_Dup_No {

	public static void main(String[] args) {

		int[] a= {1,2,3,1,2,3,3,4};

		LinkedHashMap<Integer,ArrayList>map=new LinkedHashMap();

		for(int i=0;i<a.length;i++)
		{
			if(map.containsKey(a[i]))
			{
				map.get(a[i]).add(i);
			}
			else
			{
				map.put(a[i],new ArrayList());
			}
		}
		System.out.println(map);
	}

}
