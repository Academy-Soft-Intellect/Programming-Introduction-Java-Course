public class ForLoopFactorial {

	public static void main(String[] args) {
		
		int n = 6;
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
		    factorial *= i;
		}
		
		System.out.println(n + "! = " + factorial);
	}
}