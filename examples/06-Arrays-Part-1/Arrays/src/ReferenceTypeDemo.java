public class ReferenceTypeDemo {
	
	public static void main(String[] args) {
	
		int[] test = { 1, 2, 3, 4, 5 };		

		String delimiter = " ! ";
		for(int i = 0; i< test.length; i++){
			System.out.print(test[i] + delimiter);
			System.out.println();
		}
		
		System.out.println();
		
		int[] newTest = test;
		
		for(int i = 0; i< newTest.length; i++){
			System.out.print(newTest[i] + delimiter);
			System.out.println();
		}
		
		test[0] = 20;
		
		System.out.println();
		
		for(int i = 0; i< test.length; i++){
			System.out.print(test[i] + delimiter);
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i< newTest.length; i++){
			System.out.print(newTest[i] + delimiter);
			System.out.println();
		}
	}
}
