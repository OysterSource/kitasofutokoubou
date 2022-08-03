package kitakoubou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex38 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// ここにコードを挿入
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		//文字列で読み込んだものを数列に変換してscore1に代入する
		int score1 = Integer.parseInt(br.readLine());
		//文字列で読み込んだものを数列に変換してscore2に代入する
		int score2 = Integer.parseInt(br.readLine());
		// 両方とも 60 点以上であれば合格
		if((score1 >= 60 && score2 >= 60)
				// 合計が 130 点以上であれば合格
				|| ((score1 + score2) >= 130)
				// 合計が 100 点以上かつ、どちらかの試験が 90 点以上であれば合格
				|| ((score1 + score2) >= 100 && (score1 >= 90 || score2 >= 90)))
			// 上記の条件に該当すれば合格と表示する
			System.out.println("合格");
		//	↑以外であればelse以下の条件分岐をする 
		else
			System.out.println("不合格");
	}

}
