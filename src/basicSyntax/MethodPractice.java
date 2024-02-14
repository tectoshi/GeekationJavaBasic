package basicSyntax;

public class MethodPractice {
	public static void main (String[] args) {
		int a = 12;
		int b = 7;
		
		// メソッド1の呼び出し
		int[] results = {
				addMethod(a, b), 
				subtractionMethod(a,b), 
				multiplicationMethod(a,b), 
				divisionMethod(a,b),
			};
		displayMethod(results);
	}
	
	// メソッド1: 二つの値を足し算するメソッド
	public static int addMethod(int a, int b) {
		int sum = a + b;
		return (int)sum;
	}
	
	// メソッド2: 二つの値を引き算するメソッド
	public static int subtractionMethod(int a, int b) {
		int sub = a - b;
		return(int) sub;
	}

	// メソッド3: 二つの値を掛け算するメソッド
	public static int multiplicationMethod(int a, int b) {
		int mul = a * b;
		return (int) mul;
	}
	
	// メソッド4: 二つの値を割り算するメソッド
	public static int divisionMethod(int a, int b) {
		int div = a / b;
		return (int)div;
	}
	// メソッド5: コンソールに出力するためのメソッド
	// 課題では引数intと指定がありましたが、こちらの方が便利・学習になると思い、intの配列を引数に設定しております。
	public static void displayMethod(int[] results) {
		for (int result: results) {
			System.out.println("計算結果は{" + result + "}です。");
		}
	}
}
