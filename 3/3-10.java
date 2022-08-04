package kitakoubou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex310 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// BufferedReaderを変数化し、newでインスタンス化する
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		//条件と一致した場合「x は y より小さく、かつ、x と y は共に偶数である」と出力する
		if(x < y && (x % 2) == 0 && (y % 2) == 0) {
			System.out.println("x は y より小さく、かつ、x と y は共に偶数である");
			//条件と一致した場合「x と y は等しく、かつ、負の数である」と出力する
		} else if(x == y && x < 0) {
			System.out.println("x と y は等しく、かつ、負の数である。");
			//条件と一致した場合「x は y より小さい、または、x は偶数である」と出力する
		} else if(x < y || (x % 2) == 0) {
			System.out.println("x は y より小さい、または、x は偶数である");
			//条件と一致した場合「x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である」と出力する
		} else if((x <= 10 || x >= 100) && (y >= 10 && y <= 100)) {
			System.out.println("x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である");
			//条件と一致した場合「x も y も負の数である、ではない」と出力する
		} else if(!(x < 0 && y < 0))
			System.out.println("xもyも負の数である、ではない");
		//上記すべての条件に該当しない場合の処理
		else {
			System.out.println("条件外です");
		}
	}
}
