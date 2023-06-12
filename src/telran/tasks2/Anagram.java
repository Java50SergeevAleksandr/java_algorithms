package telran.tasks2;

public class Anagram {
//	Please write method
//
//	   public static boolean isAnagram(String sourceWord, String targetWord)
//
//	which checks, that string named targetWord is the "anagram" of string named sourceWord.
//
//	One word is called the "anagram" of the other word, if it is built from exactly the
//	same letters (with same count of each letter) as the source word.
//
//	The Requirements:
//	- the method checks words, ignoring the case ('A' considered equal to 'a', etc.)   
//	- it is supposed that words are built only from letters A-Z and a-z
//	- if any word contains any other symbol, the error message is printed and method returns false.
//	- THINK, how to implement the FASTEST POSSIBLE implementation of this method, working O(N).
	public static boolean isAnagram(String sourceWord, String targetWord) {
		int sourceWordLength = sourceWord.length();
		int targetWordLength = targetWord.length();

		if (sourceWordLength != targetWordLength) {
			System.out.printf("first word have length: %d , second word have length: %d \n", sourceWordLength,
					targetWordLength);
			return false;
		}

		boolean res = true;
		sourceWord = sourceWord.toLowerCase();
		targetWord = targetWord.toLowerCase();
		short[] lookupTable = new short['z' - 'a' + 1];

		fillLookupTable(sourceWord, lookupTable, true);
		fillLookupTable(targetWord, lookupTable, false);

		int index = 0;
		while (res && index < lookupTable.length) {
			if (lookupTable[index] != 0) {
				res = false;
				System.out.printf("difference at symbol: %c \n", (char) (index + 'a'));
			}
			index++;
		}

		return res;
	}

	private static void fillLookupTable(String word, short[] lookupTable, boolean isSourceWord) {
		int factor = isSourceWord ? 1 : -1;
		for (int i = 0; i < word.length(); i++) {
			lookupTable[word.charAt(i) - 'a'] += factor;
		}
	}

}
