public class Task05 {

	public static void main(String[] args) {
		int n = 5;

		long factorialN = 1;
		for (int i = 1; i <= n; i++) {
			factorialN = factorialN * i;
		}
		
		int k = 6;
		long factorialK = 1;
		for (int j = 1; j <= k; j++) {
			factorialK = factorialK * j;
		}
		
		int nMinusK = n - k;
		long factorialNK = 1;
		for (int j = 1; j <= nMinusK; j++) {
			factorialNK = factorialNK * j;
		}
		
		System.out.print("N! * K! / (N - K)! = ");
		System.out.println((double)factorialN * factorialK / factorialNK);

	}

}
