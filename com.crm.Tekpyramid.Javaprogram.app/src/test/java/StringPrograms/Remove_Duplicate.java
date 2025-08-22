package StringPrograms;

import java.util.LinkedHashSet;

public class Remove_Duplicate {

	public static void main(String[] args) {

		String str="aabbccdde";
		
		LinkedHashSet set=new LinkedHashSet();
		
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		System.out.println(set);
	}

}
