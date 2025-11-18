package cs265;

public class CS265_Lab_W08 {

	/*
	 This method takes any string as input and checks if it is a palindrome or not.
	 If you don't know what a palindrome is check here
	 https://en.wikipedia.org/wiki/Palindrome

	 NAVAN is a palindrome,   HELLOOLLEH is a palindrome
	 UpAndDownnwoDdnApU is a palindrome etc.

	 This method checks if an input string is palindrome. However
	 the string MUST NOT contain any special characters. It can only contain A-Z (upper and lower case) and 0-9.
	 No spaces, no punctuation, no special characters etc are allowed.

	 The method returns true if the inputString is a palindrome. It returns
	 false otherwise.
	 */
	public static boolean isPalindrome(String inputString)
	{
		boolean isPalindrome = false;

		String reversed = new StringBuffer(inputString).reverse().toString();

		if (inputString.length()<=0)
		{
			isPalindrome = false;
		}
		else if (inputString.matches("[a-zA-Z0-9]+") ==false)
		{
			// we will not accept strings which have spaces or periods or
			// special characters. ONLY A-Z (lower and upper case)
			// or 0 - 9 (digits) accepted - no other character allowed.
			// so if there is even one character which is not a-z or A-Z or 0-9 then
			// this is not a palindrome
			isPalindrome = false;
		}
		else if (inputString.compareToIgnoreCase(reversed) == 0)
		{
			// then if the reverse is the same as the input string
			// then we have a palindrome!
			isPalindrome = true;
		}
		
		return isPalindrome;
	}

}