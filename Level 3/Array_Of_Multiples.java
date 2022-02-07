import java.util.*;

public class Program {
	public static int[] arrayOfMultiples(int num, int length) {
		
		int[] array = new int[length];
		
		for(int i = 0; i < length; i++){
			array[i] = num * (i + 1);
		}
		return array;
		
	}
}
