package telran.tasks;


public class LongestSubsequence {
	public static int maxSubsequenceLength(int[] arr) {

//	The method accepts array of integers and returns 
//	the length of longest sub-sequence, consisting of repeating number.
//
//	For example, if input is
//	    1,3,3,2,8,8,8,5,6,6
//	the result is 3 - the length of longest subsequence 8,8,8
//
//	The non-repeating number would  be considered as "subsequence of length 1".
//	The result for empty array would be 0.
//
//	Think how to write it in one pass through array.
//
//	Implement the tests.
		if (arr.length == 0) {
			return 0;
		}
		int resultsValue = 0;
		int count = 1;
		int symbol = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (i != arr.length - 1 && arr[i + 1] == symbol) {
				symbol = arr[i];
				count++;

			} else if (i != arr.length - 1) {
				resultsValue = Math.max(resultsValue, count);
				symbol = arr[i + 1];
				count = 1;
			} else {
				resultsValue = Math.max(resultsValue, count);
			}
		}
		
		return resultsValue;

	}
}
