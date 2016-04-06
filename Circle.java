import java.util.ArrayList;
import java.util.Scanner;

public class Circle extends CircleApp {

	public Circle(double radius) {
		double b = getArea(radius);
		double a = getCircumference(radius);
		
		

		System.out.println("For your circle with a radius of " + radius + "\n\tCircumference: " + a + "\n\tArea: " + b);
	}

	public double getCircumference(double getCircumf) {
		double gotCircumf = 2 * Math.PI * (getCircumf);
		double gotFormCircumf = Validator.getFormattedDouble(gotCircumf);

		return gotFormCircumf;
	}

	public double getArea(double getArea) {
		double gotArea = Math.PI * (Math.pow(getArea, 2));
		double gotFormArea = Validator.getFormattedDouble(gotArea);
		return gotFormArea;
	}

	// private String formattedDouble(){
	// return null;
	// }

	public static int getObjectCount(int i) {
		ArrayList<Integer> timesCycled = new ArrayList<Integer>();
		timesCycled.add(i + 1);

		return timesCycled.size();
	}

	public static void welcome(int welcome) {

		Scanner sc = new Scanner(System.in);
		int objectCount = 0;
		int stayOrGo = 0;

		do {
			for (int i = 0; i < welcome; i++) {

				System.out.println("\nPlease enter the radius of the circle you wish to calculate.");
				String userInputRadius = sc.nextLine();

				double b = Validator.validateNo(userInputRadius);

				Circle userCircle = new Circle(b);

				getObjectCount(i);

			}

			System.out.println("\nWould you like to calculate more circles? " + "\n\tPress '1' for more"
					+ "\n\tPress '0' to quit");
			String moreCircles = sc.nextLine();
			stayOrGo = (int) Validator.validateNo(moreCircles);

			if (stayOrGo == 1) {
				beginHere();
			}

		} while (stayOrGo > 0);

		System.out.println("You performed calculations on " + objectCount + " circles!"
				+ "\n\nThank you for using the Circle Calculator.");

		sc.close();
	}

	public static void beginHere() {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many circles would you like to calculate?");
		String howMany = sc.nextLine();

		int userInput = (int) Validator.validateNo(howMany);

		welcome(userInput);

		sc.close();
	}
}
