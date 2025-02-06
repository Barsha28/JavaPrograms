package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatedPalindrome {
    public static void main(String[] args) {
        String s = "mom dad mom dad children dad";
        String[] s1 = s.split(" ");
        int maxcount = 0;
        String repeated = null;

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // Count word frequencies and identify palindromes
        for (int i = 0; i < s1.length; i++) {
            // Count the frequency of each word
        	if(map.containsKey(s1[i])) {
        		map.put(s1[i], map.get(s1[i])+1);
        	}
        	else {
        		map.put(s1[i], 1);
        	}
            // Check if the word is a palindrome
            String rev = new StringBuilder(s1[i]).reverse().toString();
            if (rev.equals(s1[i])) {
                System.out.println("Palindrome string: " + rev);
            }
        }

        // Find the most repeated palindrome
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            // Check if the key is a palindrome and its count is the highest
            String rev = new StringBuilder(key).reverse().toString();
            if (rev.equals(key) && value > maxcount) {
                repeated = key;
                maxcount = value;
            }
        }

        // Print the most repeated palindrome
        System.out.println(repeated+" is most repeated");
//        if (repeated != null) {
//            System.out.println("Most repeated palindrome: " + repeated + " (repeated " + maxcount + " times)");
//        } else {
//            System.out.println("No palindrome found.");
//        }
    }
}
