package practice_1;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatedPal {
public static void main(String[] args) {
	String s="mom dad mom dad children dad";
	String a[]=s.split(" ");
	String repeated=null;
	int maxcount=0;
	LinkedHashMap<String, Integer>map=new LinkedHashMap<String, Integer>();
	
	for(String s1:a) {
		if(map.containsKey(s1)) {
			map.put(s1, map.get(s1)+1);
		}
		else {
			map.put(s1, 1);
		}
		String rev=new StringBuilder(s1).reverse().toString();
		if(rev.equals(s1)) {
			System.out.println("palindrome string :"+rev);
		}
	}
	for(Map.Entry<String, Integer>hash:map.entrySet()) {
		String key=hash.getKey();
		int value=hash.getValue();
		String rev=new StringBuilder(key).reverse().toString();
		if(rev.equals(key) && value>maxcount) {
			maxcount=value;
			repeated=key;
		}
	}
	if(repeated!=null) {
		System.out.println("most repeated palindrome :"+repeated+" count is "+maxcount);
	}
	else {
		System.out.println("no palindrome found");
	}
}
}
