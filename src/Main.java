
public class Main {

	public static void main(String[] args) {
	    int num1 = 17;
	    double num2 = 1.4142;
	    String myFavorite = "私の好きな";
	    String desu = "です。";
	    String dispNum1 = "{" + num1 + "}";
	    String dispNum2 = "{" + num2 + "}";
	    
	    System.out.println(dispNum1);
	    System.out.println(dispNum2);
	    System.out.println(myFavorite + "整数は" + dispNum1 + desu);
	    System.out.println(myFavorite + "小数は" + dispNum2 + desu);
	}
}
