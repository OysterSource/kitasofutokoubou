package kitakoubou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex52 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// BufferedReaderを変数化し、newでインスタンス化する
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		//要素数を指定して配列を作成する
		int values[] = new int[10];
		//入力された値をとってくる処理を10回繰り返し、コンソールに表示する
		for(int i = 0; i < 10; i++) {
			values[i] = Integer.parseInt(br.readLine());
			System.out.println();
			//逆順に処理するfor文で並び替えたものを出力する
			for(int i1 = 9; i1 >= 0; i1--) {
				System.out.println(values[i1]);
			}
		}
	}
}
