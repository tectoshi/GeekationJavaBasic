package objectExercise;

public class Apartment extends Property{
	private String floorPlan;
	
	Apartment (String name, String owner, String type, int price, String floorPlan) {
		super(name, owner, type, price);
		this.floorPlan = floorPlan;
	}
	
	public String getFloorPlan() {
		return floorPlan;
	}
	
	public void setFloorPlan(String floorPlan) {
		this.floorPlan = floorPlan;
	}
	
	public void infomation() {
		super.infomation();
		System.out.println("間取り：" + floorPlan);
	}
}
