package kitakoubou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex313 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReaderを変数化し、newでインスタンス化する
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		//日数を知りたい月を入力する説明文をコンソールに出力する
		System.out.println("日数を知りたい月を入力してください");
		//入力された内容を数列の変数monthに入れる
		int month = Integer.parseInt(br.readLine());
		//()の中身を使って該当する処理にジャンプさせる
		switch (month) {
		//1月
		case 1:
			System.out.println("31日");
			break;
		//2月
		case 2:
			System.out.println("28日");
			break;
		//3月
		case 3:
			System.out.println("31日");
			break;
		//4月
		case 4:
			System.out.println("30日");
			break;
		//5月
		case 5:
			System.out.println("31日");
			break;
		//6月
		case 6:
			System.out.println("30日");
			break;
		//7月
		case 7:
			System.out.println("31日");
			break;
		//8月
		case 8:
			System.out.println("31日");
			break;
		//9月
		case 9:
			System.out.println("30日");
			break;
		//10月
		case 10:
			System.out.println("31日");
			break;
		//11月
		case 11:
			System.out.println("30日");
			break;
		//12月
		case 12:
			System.out.println("31日");
			break;
		//全てのcaseと一致しなかった場合はdefault処理が適応される
		default:
			System.out.println("正しい入力をして下さい");

		}

	}

}
