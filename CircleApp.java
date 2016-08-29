import java.util.Scanner;

public class CircleApp {

	public static void main (String [ ] args) {
		double radius = 0;
		int count = 0;
		String choice = "y";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Circle Tester!");
		while(choice.equalsIgnoreCase("y")) 
		{
			System.out.println("Enter radius of circle: ");
			radius = scan.nextDouble();
			Circle circle = new Circle(radius);

			System.out.println("Circumference: " + circle.getFormattedCircumference());
			System.out.println("Area: " + circle.getFormattedArea());
			
			count = circle.getObjectCount();
			
			System.out.println("create another Circle? (y/n): ");
			choice = scan.next();
		}
			
			System.out.println("You created " + count + " objects " + "Good-Bye");

			scan.close();
	}
}