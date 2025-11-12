package cs265;

public class CS265_Lab_W03 {

	/** Utility function to find minimum of three numbers */
	private static int minimum(int a, int b, int c) {
		return Integer.min(a, Integer.min(b, c));
	}
	
	/**
	 * The edit distance (or the Levenshtein Distance) quantifies how
	 * (dis)similiar two strings are to one another. The algorithm works by
	 * counting the minimal number of single-number edits (i.e. deletions,
	 * substitutions, insertions) required to transform one string into the
	 * other.
	 * 
	 * For example, the Levenshtein Distance between 'a' and 'a' is 0, between
	 * 'aa' and 'ab' is 1, and between 'Software' and 'Hardware' is 4.
	 * 
	 * This function finds the Levenshtein Distance between String X and Y; m
	 * and n are the number of characters in X and Y respectively.
	 * 
	 * @param X first string
	 * @param m length of first string
	 * @param Y second string
	 * @param n length of second string
	 * @return the edit distance (or the Levenshtein Distance) that quantifies how
	 * (dis)similiar the two given strings are to one another
	 * @see <a href=
	 *      "https://www.techiedelight.com/levenshtein-distance-edit-distance-problem/">Read
	 *      More...</a>
	 */
	public static int editDistance(String X, String Y) {
		int m = X.length(); // determine the length of first text
		int n = Y.length(); // determine the length of second text
		// for all i and j, T[i,j] will hold the Levenshtein distance between
		// the first i characters of X and the first j characters of Y
		// note that T has (m+1)*(n+1) values

		int[][] T = new int[m + 1][n + 1];

		// source prefixes can be transformed into empty String by
		// dropping all characters

		for (int i = 1; i <= m; i++)
			T[i][0] = i; // (case 1)

		// target prefixes can be reached from empty source prefix
		// by inserting every character

		for (int j = 1; j <= n; j++)
			T[0][j] = j; // (case 1)

		int cost;

		// fill the lookup table in bottom-up manner
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (X.charAt(i - 1) == Y.charAt(j - 1)) // (case 2)
					cost = 0; // (case 2)
				else
					cost = 1; // (case 3c)

				T[i][j] = minimum(T[i - 1][j] + 1, // deletion (case 3b)
						T[i][j - 1] + 1, // insertion (case 3a)
						T[i - 1][j - 1] + cost); // replace (case 2 + 3c)
			}
		}

		return T[m][n];
	}

}
