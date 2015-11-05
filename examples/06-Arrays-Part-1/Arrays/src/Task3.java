
public class Task3 {

	public static void main(String[] args) {
		
		int[] array = { 5, 2, 3, 2, 1 };
		//int[] array = { 1, 2, 3, 2, 1 };
		//int[] array = { 1, 5, 3, 3, 2, 1 };
		//int[] array = { 1, 2, 3, 3, 2, 1 };
		boolean isSymmetric = true;
		
		for(int i = 0; i < array.length / 2; i++) {
			if(array[i] != array[array.length - i - 1]) {
				isSymmetric = false;
				break;
			}
		}
		
		if (isSymmetric) {
			System.out.println("The array is symmetrics!");
		} else {
			System.out.println("The array is NOT symmetrics!");
		}

	}

}
