package itPreneur;

//Ifelse statement is conditional statement
public class IfElse {

	public static void main(String[] args) {
//
//		int age = 185;
//
//		if (age > 18 && age <= 80) {
//			System.out.println("valid for vote..!!");
//
//		} else if (age > 0 && age <= 18) { // Elif stmt or Ifelif stmt
//			System.out.println("Not valid for vote..!!");
//		} else {
//			System.out.println("Person does not exist..!!");
//		}
		int x = -7;
		int y = 5;
		if (x > 0 && y > 0) {
			System.out.println("Lies in 1st Quadrant..!");

		} else if (x < 0 && y > 0) {
			System.out.println("Lies in 2nd Quadrant..!");
		} else if (x < 0 && y < 0) {
			System.out.println("Lies in 3rd Quadrant..!");
		} else if(x > 0 && y < 0){
			System.out.println("Lies in 4th Quadrant..!");
		}else {
			System.out.println("Lies on origin..");
		}

	}

}
