
public class Test {

	public static void main(String[] args) {

		int n = 30;
		int[][] matrix = new int[5][6];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				matrix[i][j] = n;
				System.out.print(n-- + "\t");
			}
			System.out.println();
		}

	}

}
