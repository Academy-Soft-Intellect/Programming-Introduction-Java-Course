
public class Task1 {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		int n = 10;
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = n;
				n++;
			}			
		}
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
			
		}

	}

}
