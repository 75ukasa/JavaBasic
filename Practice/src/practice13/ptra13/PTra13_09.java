/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください

		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();


		for(int i = 0 ; i < NAMEDATA.length ; i++ ) {
			switch(i) {
				case 0:
					employee1.setUserNm(NAMEDATA[i]);
					break;
				case 1:
					employee2.setUserNm(NAMEDATA[i]);
					break;
				case 2:
					employee3.setUserNm(NAMEDATA[i]);
					break;
			}
		}

		for(int i = 0 ; i < MAILDATA.length ; i++ ) {
			switch(i) {
				case 0:
					employee1.setMail(MAILDATA[i]);
					break;
				case 1:
					employee2.setMail(MAILDATA[i]);
					break;
				case 2:
					employee3.setMail(MAILDATA[i]);
					break;
			}
		}

		for(int i = 0 ; i < PASSDATA.length ; i++ ) {
			switch(i) {
				case 0:
					employee1.setPassword(PASSDATA[i]);
					break;
				case 1:
					employee2.setPassword(PASSDATA[i]);
					break;
				case 2:
					employee3.setPassword(PASSDATA[i]);
					break;
			}
		}


		for(int i = 0 ; i < QUATERDATA.length ; i++ ) {
			for(int b = 0 ; b < QUATERDATA[i].length ; b++) {
				switch(b) {
					case 0:
						if(i == 0) {
							employee1.setDepartmentNm(QUATERDATA[i][b]);
							break;
						}else {
							employee1.setDepartmentCnt(Integer.parseInt(QUATERDATA[i][b]));
					}
					case 1:
						if(i == 0) {
							employee2.setDepartmentNm(QUATERDATA[i][b]);
							break;
						}else {
							employee2.setDepartmentCnt(Integer.parseInt(QUATERDATA[i][b]));
						}
					case 2:
						if(i == 0) {
							employee3.setDepartmentNm(QUATERDATA[i][b]);
							break;
						}else {
					}		employee3.setDepartmentCnt(Integer.parseInt(QUATERDATA[i][b]));

				}
			}
		}


		System.out.println("名前:" + employee1.getUserNm() + ", メール:" + employee1.getMail() +
							", パスワード:" + employee1.getPassword() +
							", 部署,人数:" + employee1.getDepartmentNm() + "," + employee1.getDepartmentCnt());
		System.out.println("名前:" + employee2.getUserNm() + ", メール:" + employee2.getMail() +
							", パスワード:" + employee2.getPassword() +
							", 部署,人数:"+ employee2.getDepartmentNm() + "," + employee2.getDepartmentCnt());
		System.out.println("名前:" + employee3.getUserNm() + ", メール:" + employee3.getMail() +
							", パスワード:" + employee3.getPassword() +
							", 部署,人数:"+ employee3.getDepartmentNm() + "," + employee3.getDepartmentCnt());

	}
}
