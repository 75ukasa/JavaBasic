/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		 ArrayList<Player> array = new ArrayList<Player>();
	        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	            while (scanner.hasNext()) {
	            	Player player = new Player();
	                String line = scanner.nextLine();
	                String[] str = line.split(",");

	                player.setPosition(str[0]);
	                player.setName(str[1]);
	                player.setCountry(str[2]);
	                player.setTeam(str[3]);



	                array.add(player);
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	        }


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
	        Collections.shuffle(array);

	        int GK_max = 1;
	        int GK_count = 0;
	        for(Player p1 : array) {
	        	if(p1.getPosition().equals("GK")) {
	        		System.out.println(p1);
	        		GK_count++;
	        		if(GK_count >= GK_max) {
	        			break;
	        		}
	        	}
	        }


        	int DF_max = 4;
	        int DF_count = 0;
	        for(Player p2 : array) {
	        	if(p2.getPosition().equals("DF")) {
	        		System.out.println(p2);
	        		DF_count++;
	        		if(DF_count >= DF_max) {
	        			break;
	        		}
	   	        }

	        }
	        int MF_max = 4;
	        int MF_count = 0;
	        for(Player p3 : array) {
	        	if(p3.getPosition().equals("MF")) {
	        		System.out.println(p3);
	        		MF_count++;
	        		if(MF_count >= MF_max) {
	        			break;
	        		}
	        	}
	        }

	        int FW_max = 2;
	        int FW_count = 0;
	        for(Player p4 : array) {
	        	if(p4.getPosition().equals("FW")) {
	        		System.out.println(p4);
	        		FW_count++;
	        		if(FW_count >= FW_max) {
	        			break;
	        		}
	        	}
	        }
	}
}
