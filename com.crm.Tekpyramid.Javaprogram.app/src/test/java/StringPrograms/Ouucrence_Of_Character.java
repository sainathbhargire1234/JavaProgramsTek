package StringPrograms;

import java.util.LinkedHashMap;

public class Ouucrence_Of_Character {

	public static void main(String[] args) {

		String str="aabbabac";

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
		System.out.println(hash);
	}
}