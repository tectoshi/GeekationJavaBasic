package objectPractice;

public class Dog extends Animal {
	private String job;
	
	Dog(String name, String breeds, double weight, String job) {
		super(name, breeds, weight);
		this.job = job;
	}
	
	public void greeting() {
		super.greeting();
		System.out.println("仕事は" + this.job +"をしています。");
	}
}
