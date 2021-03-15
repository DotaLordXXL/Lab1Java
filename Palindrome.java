public class Palindrome{
	public static void main(String[] args) {
		String[] arrayOfWords = {"java", "Palindrome", "madam", "racecar", "apple", "kayak", "song", "noon"};
		for (int i = 0; i < arrayOfWords.length; i++) {
			String s = arrayOfWords[i];
			if(isPalindrome(s)) {
				System.out.println(s + " is a palindrome");
			}
			else {
				System.out.println(s + " is not a palindrome");
			}
		}
	}
	public static String reverseString(String s) {
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 += s.charAt(i);
		}
		return s1;
	}
	public static boolean isPalindrome(String s) {
		String s1 = reverseString(s);
		if (s.equals(s1)) {
			return true;
		}
		else {
			return false;
		}
	}
}