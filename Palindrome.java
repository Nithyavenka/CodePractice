
public class Palindrome {
	public static boolean isPalindrome(String s) {
		String rev = "";
		boolean ans = false;
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		if (s.equals(rev)) {
			ans = true;
		}
		return ans;

	}

	public static void main(String[] args) {
		String s = "mada";
		boolean A = isPalindrome(s);
		System.out.println(A);

	}

}
