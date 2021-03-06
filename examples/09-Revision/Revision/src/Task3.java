
public class Task3 {
	public static void main(String[] arg){
		
		// length = 7
		//             0   1  2  3  4   5  6
		int[] array = {22, 3, 5, 7, 13, 1, 4};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			if(i % 2 == 0 && array[i] > max){
				max = array[i];
			}
			
			if(i % 2 != 0 && array[i] < min){
				min = array[i];
			}
		}
		
		System.out.println("The maximum number of even index is " + max);
		System.out.println("The minimal number of odd index is " + min);
		

	}
}
