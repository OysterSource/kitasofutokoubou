package kitakoubou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex45 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReaderを変数化し、newでインスタンス化する
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		//数列の変数ｘに初期値を設定する
		int x = 0;
		//入力を10回繰り返す処理
		for(int i = 0; i < 10; i++) {
			//入力をされた内容をyに入れてｘの値に格納する
			int y = Integer.parseInt(br.readLine());
			x += y;
		}
		//xに平均式の計算結果を入れる
		x = x % 10;
		//計算結果を出力する
		System.out.println("平均" + x);
	}
}
