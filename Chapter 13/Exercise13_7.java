package Chapter13;

public class Exercise13_7 {
 
	public static void main(String[] args) {
		
		GeometricObject[] triangle = {new Triangle(4.5, 6, 10 ), new Triangle(9, 5, 7), 
			new Triangle(8.2, 9, 2), new Triangle(4, 7, 10), new Triangle(10, 5, 8)};

	
		for(int i = 0; i < 5; i++){
			System.out.print ("\n");
            System.out.println("Triangle number: " + (i+1));
            System.out.println("Area: " + triangle[i].getArea());
            System.out.println("How to color: " + ((Triangle)triangle[i]).howToColor());
        }
	}
}