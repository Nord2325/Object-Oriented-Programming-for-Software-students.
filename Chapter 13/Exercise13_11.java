package Chapter13;

public class Exercise13_11 {
	public static void main(String[] args) throws CloneNotSupportedException {
	
		Octagon octagon = new Octagon(3);

	
		System.out.println("Octagon area: " + octagon.getArea() + 
			"\nPerimeter: " + octagon.getPerimeter());

		
		
		Octagon octagon1 = (Octagon)octagon.clone();

		
		int comparason = (octagon1.compareTo(octagon));
        if(comparason == 1 || comparason == -1){
            System.out.println("The first Octagon is different from it's clone");
        }else{
            System.out.println("The first Octagon is the same as it's clone.");
        }
	}
}


