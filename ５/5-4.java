package kitakoubou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex54 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// BufferedReaderを変数化し、newでインスタンス化する
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		//要素数を指定して配列を作成する
		int values[] = new int[10];
		//値の個数と合計の変数に初期値を入れる
		int c = 0, t = 0;
		//Cの中身が10個を超えたとき、又はTの値が100を超えるまで入力された要素を持ってくる
		while(c < 10 && t <= 100) {
			values[c] = Integer.parseInt(br.readLine());
			t += values[c++];
		}
		//iの中身が10個を超えたときそこまでの値を出力する
		for(int i = 0; i < c; i++) {
			System.out.print("\n" + values[i]);
		}
	}
}
