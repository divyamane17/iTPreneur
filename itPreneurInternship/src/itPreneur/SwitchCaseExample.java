package itPreneur;

public class SwitchCaseExample {

	public static void main(String[] args) {

		int choice = 3;

		switch (choice) {
		case 1:
			System.out.println("Even or odd");
			break;

		case 2:
			System.out.println("Greater among a & b");
			break;

		case 3:
			System.out.println("positive or negative");
			break;

		default:
			System.out.println("invalid choice");
		}

	}

}
