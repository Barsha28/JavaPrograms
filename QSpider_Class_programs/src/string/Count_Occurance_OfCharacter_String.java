package string;

import java.util.LinkedHashMap;

public class Count_Occurance_OfCharacter_String {

	public static void main(String[] args) {
		String s="dataaaa 1111ddl5";
		LinkedHashMap<Character,Integer>map=new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)&& ch!=' ') {
				map.put(ch,map.get(ch)+1);
			}
			else {
				if(ch!=' ')
				map.put(ch, 1);
			}
		}
		System.out.println(map);


	}

//	        String s = "dataaaa 1111ddl5";  // Input string
//	        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
//
//	        // Count character occurrences, ignoring spaces
//	        for (int i = 0; i < s.length(); i++) {
//	            char ch = s.charAt(i);
//	            if (ch != ' ') {  // Exclude spaces
//	                map.put(ch, map.getOrDefault(ch, 0)+1);
//	                
//	            }
//	        }
//
//	        // Display results
//	        for (Character key : map.keySet()) {
//	            System.out.println(key + " : " + map.get(key));
//	        }
//	    }
	}



