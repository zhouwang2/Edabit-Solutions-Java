public class Challenge {
	public static int[][] squarePatch(int n) {
		
		int[][] array = new int[n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				array[i][j] = n;
			}
		}
		return array;
		
	}
}
