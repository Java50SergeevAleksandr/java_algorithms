package telran.arrays;

public class MatricesInt {

	public static int[][] multiplyConstant(int[][] matrix, int constant) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] *= constant;
			}
		}
		return matrix;
	}

	public static int[] getColumn(int[][] matrix, int column) {
		int[] resArr = new int[matrix.length];

		for (int i = 0; i < resArr.length; i++) {
			resArr[i] = matrix[i][column];
		}

		return resArr;
	}

	public static int[][] transpMatrix(int[][] matrix) {
		int[][] resArr = new int[matrix[0].length][matrix.length];

		for (int i = 0; i < resArr.length; i++) {
			for (int j = 0; j < resArr[i].length; j++) {
				resArr[i][j] = matrix[j][i];
			}
		}

		return resArr;

	}

}
