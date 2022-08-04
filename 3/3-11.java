package kitakoubou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex311 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// BufferedReaderを変数化し、newでインスタンス化する
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		//月を入力する説明文をコンソールに出力する
		System.out.println("月を入力して下さい");
		//int型の変数にコンソールに入力された数字を入れる
		int month = Integer.parseInt(br.readLine());
		//()の中身を使って該当する処理にジャンプさせる
		switch (month) {
		//1月
		case 1:
			System.out.println("元日");
			System.out.println("成人の日");
			break;
		//2月
		case 2:
			System.out.println("建国記念の日");
			break;
		//3月
		case 3:
			System.out.println("春分の日");
			break;
		//4月
		case 4:
			System.out.println("昭和の日");
			break;
		//5月
		case 5:
			System.out.println("憲法記念日");
			System.out.println("みどりの日");
			System.out.println("こどもの日");
			break;
		//6月
		case 6:
			break;
		//7月
		case 7:
			System.out.println("こどもの日");
			break;
		//8月
		case 8:
			break;
		//9月
		case 9:
			System.out.println("敬老の日");
			System.out.println("秋分の日");
			break;
		//10月
		case 10:
			System.out.println("体育の日");
			break;
		//11月
		case 11:
			System.out.println("文化の日");
			System.out.println("勤労感謝の日");
			break;
		//12月
		case 12:
			System.out.println("天皇誕生日");
		}

	}

}
