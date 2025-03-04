import java.util.Scanner;

// Circle class for calculations
class Circle {
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }


           
}

public class Assignments_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Creating an object of Circle class
        Circle circle = new Circle(radius);

        // Display results
        System.out.println("Area of Circle: " + String.format("%.2f", circle.getArea()));
        System.out.println("Circumference of Circle: " + String.format("%.2f", circle.getCircumference()));

        scanner.close();
 
	}

}
