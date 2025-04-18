package itPreneur;

public class Variables {

	public static void main(String[] args) {

		int a = 20;// initialization of integer var a
		int b = 10;
//		float f = 1.2f;
//		double d = 1.3;
//		char c = 'a';

		int c = a + b;
		System.out.println("The Value of a : " + a + " &  b is :" + b + " & Addition of a + b is : " + c);

		// for calculation of area of circle
		int radius = 5;
		double areaofcircle = 3.14 * radius * radius;
		System.out.println("Area of circle is : " + areaofcircle);

		// area of square
		int side = 8;
		int areaofsquare = side * side;
		System.out.println("Area of square :" + areaofsquare);

		// profit and loss
		int actualprice = 1000;
		int sellingprice = 2000;

		int profit = sellingprice - actualprice;
		System.out.println("profit is : " + profit);

		// profit
		 sellingprice = 500;

		int loss = actualprice - sellingprice;
		System.out.println("loss is :" + loss);
		
		
	}

}
