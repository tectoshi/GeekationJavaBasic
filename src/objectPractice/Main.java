package objectPractice;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("しば太郎", "柴犬", 9.5, "セラピードッグ");
		dog.greeting();
		
		System.out.println(dog.name);
		
		Cat cat = new Cat("スコット", "スコティッシュ・フォールド", 3.8);
		cat.greeting();
	}
}
