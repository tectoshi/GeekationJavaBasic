
public class Main {

	public static void main(String[] args) {
		// aがbより大きい場合にtrue
		int a = 13;
		int b = 6;
		boolean aIsBig = (a > b);
		System.out.println(aIsBig);
		
		// 天気が晴れかつ暖かい場合にtrue
		boolean isSunny = true;
		boolean isWarm = true;
		boolean isSunnyAndWarmResult = (isSunny && isWarm);
		System.out.println(isSunnyAndWarmResult);
		
		// xが0以上かつyが偶数の場合にコンソールにtrue
		int x = 3;
		int y = 90;
		boolean isResult3 = (x >= 0 && y % 2 ==0);
		System.out.println(isResult3);
		
		// hasPermissionがfalseの場合にtrue
		boolean hasPermission = false;
		boolean isResult4 = !(hasPermission);
		System.out.println(isResult4);
	}
}
