package basicSyntax;

public class ForWhile {
	public static void main (String[] arg) {
		// 実装内容1：1~100のFizzBuzz問題
		int num = 1;
		while (num <= 100) {
			System.out.println(num);
			if (num % 5 == 0 && num % 3 == 0) {
				System.out.println("FizzBuzz");
			} else if (num % 5 == 0) {
				System.out.println("Buzz");
			} else if (num % 3 == 0) {
				System.out.println("Fizz");
			}
			num++;
		}
		
		// 実装内容2：言語情報の格納された配列の繰り返し処理
		String[] languages = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};
		for (String language: languages) {
			if(language == "Java") {
				System.out.println("現在学習中の言語は" + language + "です。");
				continue;
			} else if (language == "HTML") {
				System.out.println(language + "はプログラミング言語ではありません。");
				break;
			} else {
				System.out.println(language);
			}
		}
	}
}
