package string;

public class LongestPalindromeString {

	public static void main(String[] args) {
//		String s="madam level malayalam";
//		String []s1=s.split(" ");
//		int max=0;
//		for (int i = 0; i < s1.length; i++) {
//			String snew="";
//			for (int j = s1.length-1; j >=0 ; j--) {
//				snew=snew+s1[i].charAt(j);
//			}
//			if(s1[i]==snew) {
//				if(s1[i].length()>max) {
//					max=s1[i].length();
//				}
//			}
//		}
//		System.out.println(max);
//	}
        String s = "madam level malayalam";
        String[] s1 = s.split(" ");
        int max = 0;
        String longestPalindrome = "";

        for (int i = 0; i < s1.length; i++) {
            String word = s1[i];
            String reversed = "";

            // Reverse the current word
            for (int j = word.length() - 1; j >= 0; j--) {
                reversed = reversed + word.charAt(j);
            }

            // Check if the word is a palindrome
            if (word.equals(reversed)) {
                if (word.length() > max) {
                    max = word.length();
                    longestPalindrome = word;
                }
            }
        }
        System.out.println("Longest Palindrome Length: " + max);
        System.out.println("Longest Palindrome: " + longestPalindrome);
    }
//	 String s = "madam level malayalam";
//     String[] words = s.split(" ");
//     int maxLength = 0;
//     String longestPalindrome = "";
//
//     for (String word : words) {
//         String reversed = new StringBuilder(word).reverse().toString();
//
//         // Check if the word is a palindrome
//         if (word.equals(reversed)) {
//             if (word.length() > maxLength) {
//                 maxLength = word.length();
//                 longestPalindrome = word;
//             }
//         }
//     }
//
//     System.out.println("Longest Palindrome Length: " + maxLength);
//     System.out.println("Longest Palindrome: " + longestPalindrome);
// }
//
}
