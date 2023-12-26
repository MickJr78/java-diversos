package ideal_Weight;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double height;
		String gender;
		double idealWeight;
		System.out.println("Type here your height (Meters): ");
		height = sc.nextDouble();
		System.out.println("Now, type you gender (M - Male / F - Female: ");
		gender = sc.next();

		switch (gender) {
		case "M":
			idealWeight = (72.7 * height) - 58;
			System.out.printf("Your ideal weight is %.2f \n", idealWeight);
			break;
		case "m":
			idealWeight = (72.7 * height) - 58;
			System.out.printf("Your ideal weight is %.2f \n", idealWeight);
			break;
		case "F":
			idealWeight = 62.1 * height - 44.7;
			System.out.printf("Your ideal weight is %.2f \n", idealWeight);
			break;
		case "f":
			idealWeight = 62.1 * height - 44.7;
			System.out.printf("Your ideal weight is %.2f \n", idealWeight);
			break;
		}

		sc.close();

	}

}
