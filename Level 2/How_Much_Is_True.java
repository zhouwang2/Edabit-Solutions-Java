import java.util.stream.IntStream;

public class Challenge {
	public static int countTrue(boolean[] arr) {
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == true){
				count++;
			}
		}
		return count;
	}
}
