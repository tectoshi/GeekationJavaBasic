package basicSyntax;

public class GeekIntroduction {
	// メソッド1: 挨拶メソッド
	public static void greeting (int age, double height) {
		System.out.println("こんにちは!私はGeek君ごわす。");
		System.out.println("年は" + age + "でごわす。");
		System.out.println("身長は" + height + "でごわす。");
	}
	
	// メソッド2: 特技メソッド
	public static void apecialSkill (int num1, int num2) {
		if (num1 < 1  || num2 < 1) {
			// num1またはnum2が1より小さい場合
			System.out.println("num1とnum2は0より大きい値にしてください。");
			return;			
		} else if (num1 >= num2) {
			// num1がnum2以上の場合
			System.out.println("num2はnum1より大きい値にしてください。");
			return;			
		} else if (num1 > 300 || num2 > 300) {
			// num1またはnum2が300より大きい場合
			System.out.println("num1とnum2は300以下にしてください。");
			return;
		}
		
		// 繰り返し処理
		for (int i = num1 ; i <= num2 ; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				// 数値が3の倍数かつ5の倍数の場合
				System.out.println("{" + i + "}" + "は3の倍数かつ5の倍数です。");
				continue;				
			} else if (i % 3 == 0) {
				// 数値が3の倍数の時
				System.out.println("{" + i + "}" + "は3の倍数です。");
				continue;
			} else if (i % 5 == 0) {
				// 数値が5の倍数の時
				System.out.println("{" + i + "}" + "は5の倍数です。");
				continue;
			}
			// 数値の出力
			System.out.println(i);
		}

	}
}
