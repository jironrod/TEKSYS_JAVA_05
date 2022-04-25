package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {
		
//		Program #1
		int int1 = 1;
		int int2 = 2;
		int intSum = int1 + int2;
		System.out.println(intSum);

//		Program #2
		double dub1 = 4.5;
		double dub2 = 7.5;
		double dubSum = dub1 + dub2;
		System.out.println(dubSum);
		
//		Program #3
		int int3 = 23;
		double dub3 = 10.25;
		int dubToInt = (int) dub3;
		int intSum2 = int3 + dubToInt;
		System.out.println(intSum2);
		
//		Program #4
//		int int4 = 30;
		double dub4 = 30.5;
		int int5 = 5;
		double intToDub = int5;
//		int intDivide = int4 / int5;
//		System.out.println(intDivide);
		double dubDivide = dub4 / intToDub;
		System.out.println(dubDivide);
		
//		Program #5
		double dub5 = 25.75;
		double dub6 = 5.5;
		double dubDivide2 = dub5 / dub6;
		System.out.println(dubDivide2);
		int resultToInt = (int) dubDivide2;
		System.out.println(resultToInt);
		
//		Program #6
		int x = 5;
		int y = 6;
		int q = y / x;
		System.out.println(q);
		double yToDouble = y;
//		double yToDouble = yToDouble / x;
//		System.out.println(yToDouble2);
//		double q2 = yToDouble / x;
		System.out.println(yToDouble / x);	
		
//		Program #7
		final int finalInt = 25;
		int int6 = 15;
		int sum = finalInt * int6;
		System.out.println(sum);
//		Program #8
//		Literal code because this is how the assignment asked for it
//		String product1 = "hot cocoa";
//		String product2 = "herbal tea";
//		String prodcut3 = "smoothie";
//		float hotCocoa = 1.0F;
//		float herbalTea = 1.25F;
//		float smoothie = 1.75F;
//		float subtotal;
//		float totalSale;
//		final float salesTax = .08F;
//		float order1 = hotCocoa * 3;
//		float order2 = herbalTea * 4;
//		float order3 = smoothie * 2;
//		subtotal = order1 + order2 + order3;
//		totalSale = (salesTax * subtotal) + subtotal;
//		System.out.println(totalSale);
		
//		D.R.Y code
		float hotCocoa = 1.0F;
		float herbalTea = 1.25F;
		float smoothie = 1.75F;
		float subtotal = (hotCocoa*3) + (herbalTea*4) + (smoothie*2);
		final float salesTax = subtotal * .08F;
		float totalSale = + subtotal + salesTax;
		System.out.println("$" + totalSale);
		

		
	}

}
