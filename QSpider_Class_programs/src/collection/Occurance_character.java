package collection;

import java.util.LinkedHashSet;

public class Occurance_character {

	public static void main(String[] args) {
		String s1="dataaaa1110";
		LinkedHashSet<Character>ch=new LinkedHashSet<Character>();
		for(int j=0;j<s1.length();j++) {
			ch.add(s1.charAt(j));
		}
	}

}
