package practice_1;

import java.util.LinkedHashMap;
import java.util.Map;

public class PalindromeString {
	public static void main(String[] args) {
		String s="mom dad children dad dad mom";
		String a[]=s.split(" ");
		LinkedHashMap<String, Integer>map=new LinkedHashMap<String, Integer>();
String largestPalindrome="";
		for(String s1:a) {
			String pal="";
			for(int i=s1.length()-1;i>=0;i--) {
				pal=pal+s1.charAt(i);
			}
			if(pal.equalsIgnoreCase(s1)) {
				System.out.println(s1+" is a palindrome string");
			}
			
				if(map.containsKey(s1)) {
					map.put(s1, map.get(s1)+1);
				}
				else {
					map.put(s1, 1);
				}
		}
		System.out.println(map);
		for(Map.Entry<String, Integer>hash:map.entrySet()) {
			if(hash.getValue()>1) {
				System.out.println(hash.getKey());
			}
		}
	}

}
