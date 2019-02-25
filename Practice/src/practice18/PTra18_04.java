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
		ArrayList<Player> array = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
				String line = scanner.nextLine();
                // ★ 1行ごとにArrayListに格納してください
				String[] str = line.split(",");
				Player player=new Player();
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
        int g=0;
        int d=0;
        int m=0;
        int f=0;

        for(int i=0;i<array.size();i++ ) {

        	if(array.get(i).getPosition().equals("GK")&&g<1) {
        		g++;
        		System.out.println(array.get(i));
        		}
        	if(array.get(i).getPosition().equals("DF")&&d<4) {
        		d++;
        		System.out.println(array.get(i));
        	}
        	if(array.get(i).getPosition().equals("MF")&&m<4) {
        		m++;
        		System.out.println(array.get(i));
        	}
        	if(array.get(i).getPosition().equals("FW")&&f<4) {
        		f++;
        		System.out.println(array.get(i));
        	}
        }

	}
}
