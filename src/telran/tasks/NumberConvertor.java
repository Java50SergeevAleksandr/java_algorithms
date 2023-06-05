package telran.tasks;

public class NumberConvertor {
	public static String toBinaryStr(int number) {
//		converts non-negative integer number to String with binary form of the given number.
//		    DON'T use the existing method Integer.toBinaryString()
		String res = "";
		
		while(number != 0) {
			int reminder = number%2;
			number = number/2;
			res = ("" + reminder).concat(res);
		}		
		
		return res;
	}
	
	
	
}
