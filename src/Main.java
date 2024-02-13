
public class Main {

	public static void main(String[] args) {
		int num = 9;
		if (num % 2 == 0 && num % 3 == 0) {
			// 2と3の倍数
			System.out.println("2の倍数です。");
			System.out.println("3の倍数です。");
		} else if (num % 2 == 0) {
			// 2の倍数
			System.out.println("2の倍数です。");
		} else if (num % 3 == 0) {
			// 3の倍数
			System.out.println("3の倍数です。");
		} else {
			// どちらでもない
			System.out.println("どちらでもありません。");
		}
		
		String pref = "大阪";
		switch (pref) {
			case "北海":
				// prefが"北海"の場合
				System.out.println("北海道");
				break;
			case "東京":
				// prefが"東京"の場合
				System.out.println("東京都");
				break;
			case "京都":
				// prefが"京都"の場合
				System.out.println("京都府");
				break;
			default:
				// prefが上記以外の場合
				System.out.println("当てはまりません。");
				break;
		}
		
	}
}
