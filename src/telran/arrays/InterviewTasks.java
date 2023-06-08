package telran.arrays;

public class InterviewTasks {
	static public boolean isSumTwo(short[] array, short sum) {
		// array of positive numbers or 0
		// {1, 2, 30, 2, 2}. sum = 4
		// helper = {false, true, true, false, false}
		boolean[] helper = new boolean[sum > 0 ? sum + 1 : Short.MAX_VALUE + 1];
		boolean res = false;
		int index = 0;
		while (index < array.length && !res) {
			short num = (short) (sum - array[index]);
			if (num >= 0) {
				if (helper[num]) {
					res = true;
				} else {
					helper[array[index]] = true;
				}
			}
			index++;

		}
		return res;

	}

	public static void sort(short[] array) {

		// array - array of the positive or 0 number
		// sorting with complexity O[N]

		int[] helper = new int[Short.MAX_VALUE];
		int j = 0;

		for (int i = 0; i < array.length; i++) {
			helper[array[i]]++;
		}

		for (int i = 0; i < helper.length; i++) {

			while (helper[i] > 0) {
				array[j] = (short) i;
				j++;
				helper[i]--;
			}
		}
	}

	public static short getMaxWithNegativePresentation(short[] array) {

		// returns maximal positive number having an negative value with the same abs
		// value, if no such numbers returns -1

		short res = -1;
		byte codeExist = 3;
		byte[] helper = new byte[Short.MAX_VALUE];

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0 && helper[array[i]] == -1) {
				helper[array[i]] = codeExist;
			}

			if (array[i] >= 0 && helper[array[i]] != codeExist) {
				helper[array[i]] = 1;
			}

			if (array[i] < 0 && helper[Math.abs(array[i])] == 1) {
				helper[Math.abs(array[i])] = codeExist;
			}

			if (array[i] < 0 && helper[Math.abs(array[i])] != codeExist) {
				helper[Math.abs(array[i])] = -1;
			}
		}

		int i = helper.length - 1;
		
		while (i >= 0) {
			if (helper[i] == codeExist) {
				res = (short) i;
				i = -1;
			}
			i--;
		}

		return res;
	}
}
