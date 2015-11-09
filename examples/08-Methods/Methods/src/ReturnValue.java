public class ReturnValue {

	public static void main(String[] args) {
	
		float width = 5.0f;
		float height = 4.0f;
		
		calculateRectangleArea(width, height);

		
		//System.out.print("Width " + width + " * Height " + height + " = Area " + area);
		//System.out.println();

	}
	
	public static void calculateRectangleArea(float width, float height){
		float area = width * height;
		System.out.println(area);

	}

}
