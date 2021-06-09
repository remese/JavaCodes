
public class Images {

	public static void main(String[] args) {
		int[][] MAT = { { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 1, 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

		int[][] A = MAT;
		System.out.println("The original array: ");
		displayArray(A);

//		// a)
//		System.out.println("\na) The inverted N × N two-dimensional array A: ");
//		displayArray(invert(A.length, A));

//		// c)
//		System.out.println("\nc) The image rotated clockwise by 90°: ");
//		displayArray(rotateC(A.length, A));

//		// d)
//		System.out.println("\nd) The image rotated clockwise by 90° (without the use of any additional arrays): ");
//		displayArray(rotateD(A.length, A));

	}

	public static int[][] invert(int N, int[][] A) {
		// code missing
		return A;
	}

	public static int[][] rotateC(int N, int[][] A) {
		int[][] B = new int[N][N];
		// code missing
		return B;
	}

	public static int[][] rotateD(int N, int[][] A) {
		// code missing
	return A;

	}

	public static void displayArray(int matrix[][]) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
	}

}
