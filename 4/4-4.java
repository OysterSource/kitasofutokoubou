package kitakoubou;

public class Ex44 {

	public static void main(String[] args) {
		// 数列の変数Xに初期値を入れる
		int x = 1;
		// 階乗式を7回ループさせる
		for(int i = 2; i <= 7; i++) {
			//xにiの値を入れる
			x = x * i;
			//ｘの値を出力する
			System.out.println(x);

		}
	}
}
