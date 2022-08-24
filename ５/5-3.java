package kitakoubou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex53 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// BufferedReaderを変数化し、newでインスタンス化する
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		// 要素数を指定して配列を作成する
		int values[] = new int[10];
		// 要素数を指定して配列を作成する
		for(int i = 0; i < 10; i++) {
			values[i] = Integer.parseInt(br.readLine());
		}
		//偶数の場合の処理
		System.out.print("\n偶数：");
		for(int i1 : values) {
			if((i1 % 2) == 0)
				System.out.print(i1 + " ");
		}
		// 奇数の場合の処理
		System.out.print("\n奇数：");
		{
			for(int i2 : values)
				if((i2 % 2) != 0)
					System.out.print(i2 + " ");
		}
	}
}
