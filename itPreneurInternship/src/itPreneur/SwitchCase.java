package itPreneur;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("----------------MENU---------------");
		System.out.println("Area Of Circle");
		System.out.println("Area Of Rectangle");
		System.out.println("Area Of Square");

		int choice = 3, radius = 5, length = 3, width = 6, side = 7;

		switch (choice) {
		case 1:
			double areaOfCircle = 3.14 * radius * radius;
			System.out.println("Area of circle is :" + areaOfCircle);
			break;
		case 2:
			double areaOfRectangle = length * width;
			System.out.println("Area of Rectangle is :" + areaOfRectangle);
			break;
		case 3:
			double areaOfSquare = side * side;
			System.out.println("Area of Square is :" + areaOfSquare);
			break;
		default:
			System.out.println("Invalid Choice..");
		}

	}

}
