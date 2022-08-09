package kitakoubou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex410 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// BufferedReaderを変数化し、newでインスタンス化する
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		//数列の変数ｘに入力された内容を入れる
		int x = Integer.parseInt(br.readLine());
		//入力された数だけ*を出力する
		for(int i = 0; i < x; i++) {
			System.out.print("*");
		}
	}
}
