package kitakoubou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex23 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		System.out.println("和 " + (x + y));
		System.out.println("差 " + (x - y));
		System.out.println("積 " + (x * y));
		System.out.println("商 " + (x / y));
		System.out.println("余り " + (x % y));

	}

}
