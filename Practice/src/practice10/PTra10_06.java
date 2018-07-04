package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		car1.color = "red";
		car2.color = "blue";
		car3.color = "yellow";

		car1.gasoline = 40;
		car2.gasoline = 45;
		car3.gasoline = 50;

		final int distance = 300;

		int count = 0;
		int dist = 0 ;
		int move1 = 0 ;
		int move2 = 0 ;
		int move3 = 0 ;

		while(move1 < distance) {
			dist = car1.run();
			move1 = move1 + dist;
			if(dist == -1) {
				System.out.println("car1は目的地に到達できませんでした");
				break;
			}
			count++;
		}if(car1.gasoline > 0) {
			System.out.println( "car1は目的地まで" + count + "時間かかりました");
		}



		count = 0;
		while(move2 < distance) {
			dist = car2.run();
			move2 = move2 + dist;
			if(dist == -1) {
				System.out.println("car2は目的地に到達できませんでした");
				break;
			}
			count++;
		}if(car2.gasoline > 0) {
			System.out.println("car2は目的地まで" + count + "時間かかりました");
		}


		count = 0;
		while(move3 < distance) {
			dist = car3.run();
			move3 = move3 + dist;
			if(dist == -1) {
				System.out.println("car3は目的地に到達できませんでした");
				break;
			}
			count++;
		}if(car3.gasoline > 0) {
			System.out.println("car3は目的地まで" + count + "時間かかりました");
		}
	}
}
