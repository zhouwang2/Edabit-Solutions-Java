public class Challenge {
	public static int differenceMaxMin(int[] arr) {
		
		int max = 0;
		int min = arr[arr.length - 1];
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return(max - min);
		
	}
}
