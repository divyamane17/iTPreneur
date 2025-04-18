package itPreneur;

public class IfElseExample {

	public static void main(String[] args) {

		int num = 31;

		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("Java Language");

		} else if (num % 3 == 0) {
			System.out.println("Java");

		} else if (num % 5 == 0) {
			System.out.println(" Language");

		} else {
			System.out.println("Not divisible by 3 & 5");
		}

	}

}
