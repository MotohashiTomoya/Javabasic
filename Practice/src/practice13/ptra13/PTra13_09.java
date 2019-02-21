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
		Employee[]enployee=new Employee[3];

		Employee enployee1=new Employee();
		Employee enployee2=new Employee();
		Employee enployee3=new Employee();

		enployee[0]=enployee1;
		enployee[1]=enployee2;
		enployee[2]=enployee3;


		for(int i=0;i<3;i++) {
			enployee[i].setUserNm(NAMEDATA[i]);
			enployee[i].setMail(MAILDATA[i]);
			enployee[i].setPassword(PASSDATA[i]);
			enployee[i].setDepartmentNm(QUATERDATA[0][i]);
			enployee[i].setDepartmentCnt(Integer.parseInt(QUATERDATA[1][i]));
		}
	}
}
