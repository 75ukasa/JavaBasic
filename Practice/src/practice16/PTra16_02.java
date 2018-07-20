/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b = true;
		byte by = 100;
		short s = 300;
		char c = '日';
		int i = 1000;
		long l = 2000L;
		float f = 3.14F;
		double d = 453.592;

		// ★ 上記基本型を、それぞれのラッパークラスに代入してください

		java.lang.Boolean b1 = b;
		java.lang.Byte by1 = by;
		java.lang.Short s1 = s;
		java.lang.Character c1 = c;
		java.lang.Integer i1 = i;
		java.lang.Long l1 = l;
		java.lang.Float f1 = f;
		java.lang.Double d1 = d;


		System.out.println(b1 +" "+ by1+" "+s1+" "+c1+" "+i1+" "+l1+" "+f1+" "+d1);



	}
}
