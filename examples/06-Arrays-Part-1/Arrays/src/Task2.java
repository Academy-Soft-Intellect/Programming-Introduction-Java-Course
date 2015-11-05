
public class Task2 {

	public static void main(String[] args) {
		
		//int[] array = { 1, 2, 3, 4, 5 };
		int[] array = { 1, 2, 3, 4, 5, 6 };

		//print original array
		for(int i = 0; i< array.length; i++){
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < array.length / 2; i++){
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		
		System.out.println();

		//print reversed array
		for(int i = 0; i< array.length; i++){
			System.out.print(array[i] + " ");
		}

	}

}
