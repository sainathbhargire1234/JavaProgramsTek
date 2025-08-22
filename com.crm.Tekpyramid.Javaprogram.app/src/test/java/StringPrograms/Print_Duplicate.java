package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Print_Duplicate {

	public static void main(String[] args) {

		String str="RRUUPESH";

		LinkedHashMap<Character,Integer> hash=new LinkedHashMap();

		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(hash.containsKey(ch)) 
			{
				hash.put(ch, hash.get(ch)+1);
			}
			else

				hash.put(ch, 1);
		}
		for(Entry<Character,Integer>map:hash.entrySet())
		{
			if(map.getValue()>1)
			{
				System.out.println(map.getKey());
			}
		}
	}

}

