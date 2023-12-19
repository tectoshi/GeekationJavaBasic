
public class Main {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int z = x + y;
		String variable = "変数";
		String atai = "の値は";
		String desu = "です";
		System.out.println(variable + "z" + atai + z + desu);
		
		// double型の変数aを宣言し、値5.25を代入します。
		double a = 5.25;
		// 変数aの値に2.5を足して、結果を変数aに代入します。
		a = a + 2.5;
		// 変数aの値に3.0を掛けて、結果を変数aに代入します。
		a = a * 3;
		// 変数aの値を整数(int)にキャストし、int型の変数bに代入します。
		int b = (int)a;
		// 変数bに10を足して、結果を変数bに代入します。
		b = b + 10;
		System.out.println(variable + "a" + atai + a + desu);
		System.out.println(variable + "b" + atai + b + desu);
	}
}
