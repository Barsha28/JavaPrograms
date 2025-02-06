package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintOnlyUniqueCharInAStringUsingHashMap {
public static void main(String[] args) {
	String s="mcdkcdvmm";
	LinkedHashMap<Character, Integer>map=new LinkedHashMap<Character, Integer>();
	for (int i = 0; i < s.length(); i++) {
		char ch=s.charAt(i);
		if(map.containsKey(ch)) {
			map.put(ch, map.get(ch)+1);
		}
		else {
			map.put(ch, 1);
		}
	}
	for(Map.Entry<Character, Integer>hash:map.entrySet()) {
		if(hash.getValue()==1) {
			System.out.print(hash.getKey());
		}
	}
	
}
}
