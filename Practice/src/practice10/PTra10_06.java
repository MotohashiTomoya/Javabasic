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
		Car[]car=new Car[3];

		Car car1=new Car();
		car1.color="Red";
		car1.gasoline=45;

		Car car2=new Car();
		car2.color="green";
		car2.gasoline=63;

		Car car3=new Car();
		car3.color="blue";
		car3.gasoline=88;

		final int distance = 300;

		car[0]=car1;
		car[1]=car2;
		car[2]=car3;

		for(int i=0;i<car.length;i++) {
		int sum=0;
		int count=0;
		while (true) {
			int run = car[i].run();
			count++;

			sum+=run;

			System.out.println(sum);

			if(sum>=distance) {
				System.out.println("目的地にまで"+count+"時間かかりました。残りのガソリンは、"+car[i].gasoline+"リットルです");
				break;
			}
		}
		}

}
}