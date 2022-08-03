package kitakoubou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex36 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//テキストを1行ずつ読み込む
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		//文字列で読み込んだものを数列に変換してｘに代入する
		int x = Integer.parseInt(br.readLine());
		//xが2で割り切れるものであれば偶数として処理する
		if((x % 2) == 0) {
			//０は正の偶数として処理する
			if(x >= 0)
				System.out.println("正の偶数");
			//↑以外であればelse以下の条件分岐をする
			else
				System.out.println("負の偶数");
		} else {
			//2で割り切れない例外のものは↓のif｛の条件の中で処理される
			if(x >= 0)
				System.out.println("正の奇数");
			//	↑以外であればelse以下の条件分岐をする
			else
				System.out.println("負の奇数");
		}
	}

}
