public class Program {
	public static int countWords(String s) {
		
		String[] word = s.split(" ");
		
		int count = 0;
		
		for(int i = 0; i < word.length; i++){
			count++;
		}
		return count;
		
	}
}
