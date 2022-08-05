package kitakoubou;

public class Ex43 {

	public static void main(String[] args) {
		// xを乗数、ｙを元の2と定義して、8乗まで繰り返し計算する
		for(int ｘ = 1, ｙ = 2; ｘ <= 8; ｘ++, ｙ *= 2) {
			System.out.println("2の" + ｘ + "乗=" + ｙ);
		}
	}
}
