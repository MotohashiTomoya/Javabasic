package practice10;
/*
 * PTra10_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_04 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ User型の変数が3つ入る配列usersを宣言・確保してください
		User[]users=new User[3];

		// ★ java.util.Scannerクラスをインスタンス化し、変数scannerに代入してください
		java.util.Scanner scanner=new java.util.Scanner(System.in);

		// ★ usersのサイズ分繰り返す制御構文を記述してください
		//----------- ループ start

			System.out.println("##人目の情報を入力します");		/* ##には、カウントを入れてください */
			System.out.println("ユーザID（数字）、 ユーザ名、メールアドレス、パスワードをカンマ区切りで入力してください");

			// ★ コマンドプロンプトに入力された値を、String型の変数lineに格納してください
			String line=scanner.nextLine();

			// ★ 変数lineに格納されている値を','で区切り、配列にしてください（Stringクラスのメソッドを使用します）
			String[] array = line.split(",");

			// ★ 配列にした値を、users[カウント]の各フィールドに代入してください
			// ★ ユーザIDに該当する値が数値でなかった場合は、エラーでプログラムが止まっても良いです
			User users1=new User();
			users1.userId= Integer.parseInt(array[0]);
			users1.userNm=array[1];
			users1.mail=array[2];
			users1.password=array[3];

			User users2=new User();
			users2.userId= Integer.parseInt(array[0]);
			users2.userNm=array[1];
			users2.mail=array[2];
			users2.password=array[3];

			User users3=new User();
			users3.userId= Integer.parseInt(array[0]);
			users3.userNm=array[1];
			users3.mail=array[2];
			users3.password=array[3];

			users[0]=users1;
			users[1]=users2;
			users[2]=users3;

		//----------- ループ end

		// ★ usersに格納されている全てのインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください
			System.out.println(users1);
			System.out.println(users2);
			System.out.println(users3);

	}
}
