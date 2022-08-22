package kitakoubou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex51 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		//要素数を指定して配列を作成する
		int values[] = new int[10];
		//10回入力されるまで入力されたものをとって来る処理を繰り返す
		for(int i = 0; i < 10; i++) {
			values[i] = Integer.parseInt(br.readLine());
			//入力された内容を出力する
			System.out.println();
			//values配列に格納されている値を2倍して出力する
			for(int n : values) {
				System.out.println(n * 2);
			}
		}
	}
}