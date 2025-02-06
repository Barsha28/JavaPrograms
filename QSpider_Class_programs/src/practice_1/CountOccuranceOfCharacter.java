package practice_1;

import java.util.LinkedHashMap;

public class CountOccuranceOfCharacter {
	public static void main(String[] args) {
		String s="barsrha";
		char a[]=s.toCharArray();
		LinkedHashMap<Character, Integer>map=new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < a.length; i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}
			else {
				map.put(a[i], 1);
			}
		}
		System.out.println(map);
	}

}
