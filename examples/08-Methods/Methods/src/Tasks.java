public class Tasks {
	
	public static void main(String[] arg){
		String a = "Sestrimski";
		reverseArray(a);
	}
	public static void reverseArray(String a){
		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.print(a.charAt(i));
		}
	}

}
