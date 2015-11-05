public class Task1DeepCopyDemo {
	
	public static void main(String[] args) {
	
		int[] oldArray = new int []{ 1, 2, 3, 4, 5, 7 };	
		
		int[] newArray = new int[oldArray.length];

		for(int i = 0; i< oldArray.length; i++){
			newArray[i] = oldArray[i];
		}
		
		for(int i = 0; i< oldArray.length; i++){
			System.out.print(oldArray[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i< newArray.length; i++){
			System.out.print(newArray[i] + " ");
		}
		
		oldArray[0] = 20;
		
		System.out.println();
		
		for(int i = 0; i< oldArray.length; i++){
			System.out.print(oldArray[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i< newArray.length; i++){
			System.out.print(newArray[i] + " ");
		}
		
	
	}
}
