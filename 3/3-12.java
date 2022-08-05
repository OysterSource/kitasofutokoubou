package kitakoubou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex312 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// BufferedReaderを変数化し、newでインスタンス化する
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		//寿司の種類を入力する説明文をコンソールに出力する
		System.out.println("好きな寿司を入力して下さい");
		//選択肢をコンソールに出力する
		System.out.println("1.イカ 2.タコ 3.イクラ 4.サーモン5.とびっこ6.ウニ ");
		//入力された内容を数列の変数sushiに入れる
		int sushi = Integer.parseInt(br.readLine());
		//()の中身を使って該当する処理にジャンプさせる
		switch (sushi) {
		//イカ
		case 1:
			System.out.println("大吉");
			break;
		//タコ
		case 2:
			System.out.println("中吉");
			break;
		//イクラ
		case 3:
			System.out.println("小吉");
			break;
		//サーモン
		case 4:
			System.out.println("吉");
			break;
		//とびっこ
		case 5:
			System.out.println("末吉");
			break;
		//ウニ
		case 6:
			System.out.println("凶");
			break;

		}
	}

}
