import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		Scanner input = new Scanner(System.in);
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = input.nextInt();
			}			
		}
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
			
		}
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if(matrix[row][col]%2 != 0){
					matrix[row][col] = matrix[row][col] * 2;
				}
			}			
		}
		System.out.println();
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
			
		}
		input.close();

	}

}
