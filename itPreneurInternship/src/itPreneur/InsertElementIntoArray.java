package itPreneur;

import java.util.Scanner;

public class InsertElementIntoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : = ");
		int size = sc.nextInt();	
		
		int[] array = new int [size];
		
		System.out.println("Enter the values of array : = ");
		for(int i  = 0; i< size; i++) {
			array[i] = sc.nextInt();
			
		}
		System.out.println("The original array is : =");

	}

}
