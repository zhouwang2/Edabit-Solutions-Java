public class SideLengths {
  public static double[] otherSides(int n) {
		
		double[] array = new double[2];
		
		array[0] = (double) n * 2;
		array[1] = (double) n * Math.sqrt(3);
		
		return array;
		
  }
}
