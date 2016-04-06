import java.text.DecimalFormat;

public class Validator extends Circle {

	public Validator(double radius) {
		super(radius);
	}

	public static double validateNo(String validateA) {

		double a = 0;

		try {
			a = Double.parseDouble(validateA);

			withinRange(a);

		} catch (NumberFormatException e) {
			System.out.println("Invalid keystroke. \n\nRestarting application.");

			beginHere();

		}

		return a;
	}

	public static double withinRange(double a) {

		if (a < 0 || a > 1001) {
			System.out.println("Entry out of bounds. Relaunching application");
		}

		return 0;

	}

	public static double getFormattedDouble(double getFormDouble) {

		DecimalFormat doubleForm = new DecimalFormat("#.00");

		return Double.valueOf(doubleForm.format(getFormDouble));
	}
}
