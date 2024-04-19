package objectExercise;

public class Property {
	private String name;
	private String owner;
	private String type;
	private int    price;
	
	Property(String name, String owner, String type, int price) {
		this.name  = name;
		this.owner = owner;
		this.type  = type;
		this.price = price;
	}
	
	/** ゲッターとセッターの設定開始 **/
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}
	/** ゲッターとセッターの設定修了*/
	
	public void infomation() {
		System.out.println("物件名：" + name);
		System.out.println("物件所有者名：" + owner);
		System.out.println("物件種別：" + type);
		System.out.println("物件価格：" + price + "円");
	}
	
	public void line() {
		// 枠線の表示用
		System.out.println("=============================");
	}
}
