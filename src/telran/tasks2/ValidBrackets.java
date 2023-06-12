package telran.tasks2;

public class ValidBrackets {
//	Check that 3 types of brackets: (), [], {} are used properly in text represented by String.
//
//	public static boolean hasValidBrackets(String text) {
//	     //TODO
//	}
//
//
//	The brackets could be nested.
//
//	Correct nesting example:	aaaaaa (sdfsdfdsf[dfd(f)f] zcvzxcv {{[ghjk]}} asd )
//
//	Incorrect examples:
//	    a. invalid brackets order   )dfgswfgsf(
//	    b. invlaid nesting order:   [werwert(wertwrtw] wertrt)

	public static boolean hasValidBrackets(String text) {
		boolean res = true;
		try {
			res = checkBrackets(text);
		} catch (Exception e) {
			res = false;
			System.out.println("Error " + e.getMessage());
		}
		return res;
	}

	private static boolean checkBrackets(String text) {
		int level = 0;
		char[] arrayLevels = new char[text.length()];

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '[' || text.charAt(i) == '(' || text.charAt(i) == '{') {
				arrayLevels[level] = text.charAt(i);
				level++;
			}
			if (text.charAt(i) == ']' || text.charAt(i) == ')' || text.charAt(i) == '}') {
				level--;
				if (level < 0 || arrayLevels[level] != mirror(text.charAt(i))) {
					throw new IllegalArgumentException("Wrong bracket: " + text.charAt(i) + " at index: " + i);
				}
			}
		}

		return level == 0 ? true : false;
	}

	private static char mirror(char c) {
		char res = ' ';

		switch (c) {
		case ')':
			res = '(';
			break;
		case ']':
			res = '[';
			break;
		case '}':
			res = '{';
			break;
		}

		return res;
	}
}
