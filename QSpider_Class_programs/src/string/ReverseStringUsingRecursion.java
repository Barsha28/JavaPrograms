package string;

public class ReverseStringUsingRecursion {
	public class ReverseStringEasy {
	    public static void main(String[] args) {
	        String input = "dataaaa1111dd";
	        String reversed = reverse(input);
	        System.out.println("Reversed String: " + reversed);
	    }

	    public static String reverse(String str) {
	        // Base case: If the string is empty or has only one character, return the string
	        if (str.length() <= 1) {
	            return str;
	        }
	        // Recursive case: Last character + reverse of the remaining string
	        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
	    }
	}

}
