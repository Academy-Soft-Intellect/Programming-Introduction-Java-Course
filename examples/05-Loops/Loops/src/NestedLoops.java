public class NestedLoops {

	public static void main(String[] args) {
		
		int rows = 9;
		int cols = 9;
		
		for (int i = 1; i <= rows; i++) {
			
			for (int j = 1; j <= cols; j++) {
				System.out.print(i + " X " + j + " | ");
			}
			
			System.out.println();
		}
	}

}
