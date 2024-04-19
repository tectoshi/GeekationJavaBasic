package objectPractice;

public class Animal {
	protected String name;
	protected String breeds;
	protected double weight;
	
	Animal(String name, String breeds, double weight) {
		this.name = name;
		this.breeds = breeds;
		this.weight = weight;
	}
	
	public void greeting() {
		System.out.println("こんにちは！私の名前は" + this.name + "です。");
		System.out.println("種類は" + this.breeds + "です。");
		System.out.println("体重は" + this.weight + "kgです。");
	}
}
