
public class SmallestDifference {
	public static void main(String[] args) {
		int[][] A = { { -22, 12, -33 }, { 33, 62, 21 }, { 54, 22, 42 } };
		int MIN = Math.abs(A[0][0]);
		//int MIN = Math.abs(A[0][0] - A[0][1]);
		boolean FLAG = true;
		int INDEXROW = 0;
		int INDEXCOL = 0;

		// The outer loop controls the number of rows and the
		// the inner loop controls the number of columns.
		for (int I = 0; I < A.length; I++) {
			for (int J = 0; J < A[I].length - 1; J++) {
				System.out.println(
						"|A[" + I + "][" + J + "]-A[" + I + "][" + (J + 1) + "]| = " + Math.abs(A[I][J] - A[I][J + 1]));
				if (Math.abs(A[I][J] - A[I][J + 1]) < MIN) {
					MIN = Math.abs(A[I][J] - A[I][J + 1]);
					INDEXROW = I;
					INDEXCOL = J;
				}
			}
		}
		// The outer loop controls the number of columns and
		// and the inner loop controls the number of rows.
		for (int J = 0; J < A[0].length; J++) {
			for (int I = 0; I < A.length - 1; I++) {
				System.out.println(
						"|A[" + I + "][" + J + "]-A[" + (I + 1) + "][" + J + "]| = " + Math.abs(A[I][J] - A[I + 1][J]));
				if (Math.abs(A[I][J] - A[I + 1][J]) < MIN) {
					MIN = Math.abs(A[I][J] - A[I + 1][J]);
					INDEXROW = I;
					INDEXCOL = J;
					FLAG = false;
				}
			}
		}
		if (FLAG == true) {
			System.out.println("The smallest difference is " + MIN + " between array elements A[" + INDEXROW + "]["
					+ INDEXCOL + "] and [" + INDEXROW + "][" + (INDEXCOL + 1) + "].");
		} else {
			System.out.println("The smallest difference is " + MIN + " between array elements A[" + INDEXROW + "]["
					+ INDEXCOL + "] and [" + (INDEXROW + 1) + "][" + INDEXCOL + "].");
		}
	}
}
