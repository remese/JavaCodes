public class ClosestPair {
	public static void main(String[] args) {
		double[][] POINTSXY = new double[][] { { -1, 3 }, { -8, -9 }, { 1, 19 }, { 2, 0.5 }, { 2, -1 }, { 3, 3 },
				{ 4, 2 }, { 4, -0.5 }, { 7, 8 }, { 3, 2 } };
		double DISTANCE;
		double distanceRounded;
		int p1x = 0;
		int p2x = 0;
		double CLOSEST = Math.pow((POINTSXY[1][0] - POINTSXY[0][0]) * (POINTSXY[1][0] - POINTSXY[0][0])
				+ (POINTSXY[1][1] - POINTSXY[0][1]) * (POINTSXY[1][1] - POINTSXY[0][1]), 0.5);
		for (int i = 0; i < POINTSXY.length - 1; i++) {
			for (int j = i + 1; j < POINTSXY.length; j++) {
				DISTANCE = Math.pow((POINTSXY[j][0] - POINTSXY[i][0]) * (POINTSXY[j][0] - POINTSXY[i][0])
						+ (POINTSXY[j][1] - POINTSXY[i][1]) * (POINTSXY[j][1] - POINTSXY[i][1]), 0.5);
				distanceRounded = Math.round(DISTANCE * 100) / 100.0;
				System.out.println("Distance between points (" + POINTSXY[i][0] + ", " + POINTSXY[i][1] + ") and ("
						+ POINTSXY[j][0] + ", " + POINTSXY[j][1] + ") is: " + distanceRounded);
				if (DISTANCE < CLOSEST) {
					p1x = i;
					p2x = j;
					CLOSEST = DISTANCE;
				}
			}
		}
		System.out.println("The smallest distance is " + Math.round(CLOSEST * 100) / 100.0 + " between points " + "("
				+ POINTSXY[p1x][0] + ", " + POINTSXY[p1x][1] + ") and (" + POINTSXY[p2x][0] + ", " + POINTSXY[p2x][1]
				+ ").");
	}

}
