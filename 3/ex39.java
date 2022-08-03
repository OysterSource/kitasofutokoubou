package kitakoubou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex39 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// BufferedReaderを変数化し、newでインスタンス化する
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		//曜日を入力するようコンソールに表示する
		System.out.println("曜日を選択してください");
		//曜日の選択肢を表示する
		System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int day = Integer.parseInt(br.readLine());
		//時間帯を入力するようコンソールに表示する
		System.out.println("時間帯を選択してください");
		//時間帯の選択肢を表示する
		System.out.println("0=午前、1=午後、2=夜間");
		//時間帯の変数tzに入力された内容を数列に変換して格納する
		int tz = Integer.parseInt(br.readLine());
		//正偽判定の型であるbooleanを変数化し初期値としてtrueを入れる
		boolean boo = true;
		//曜日が０のときfalseを返し休診と出力する
		if(day == 0) {
			boo = false;
			System.out.println("休診");
			//曜日が０のときかつ曜日が２または５のときfalseを返し休診と出力する
		} else if(tz == 0 && (day == 2 || day == 5)) {
			boo = false;
			System.out.println("休診");
			//時間帯が１で時間帯が６のときfalseを返し休診と出力する
		} else if(tz == 1 && day == 6) {
			boo = false;
			System.out.println("休診");
			//時間帯が２で曜日が３または６のときfalseを返し休診と出力する
		} else if(tz == 2 && (day == 3 || day == 6)) {
			boo = false;
			System.out.println("休診");
			//上記の条件に当てはまらない物は正で開院と出力する
			if(boo)
				System.out.println("開院");
			//それ以外のものは休診と出力する
			else {
				System.out.println("休診です。");
			}
		}
	}
}
