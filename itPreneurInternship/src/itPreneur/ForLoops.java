package itPreneur;

public class ForLoops {

	public static void main(String[] args) {
//For Printing 2's table
//		int n = 2;
//
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(n * i);
//		}

//for printing Even numbers

		/*
		 * // int n = 6; for (int i = 1; i <= n; i++) { if (i % 2 == 0) {
		 * System.out.println(i); } }
		 */
//For Factorial Calculation
		/*
		 * // int n = 4;
		 * 
		 * int fact = 1; for (int i = 1; i <= n; i = i + 1) { fact = fact * i; }
		 * System.out.println("The Factorial of the number " + n + " is :  " + fact);
		 * 
		 * }
		 */

//for fibo series
		int n1 = 0, n2 = 1, n3, n = 5;
		System.out.println(n1 + " " + n2 + " ");

		for (int i = 3; i <= 5; i = i+1) {
			n3 = n1 + n2;
			System.out.println(n3 + " ");
			n1 = n2;
			n2 = n3;

		}
	}
}
