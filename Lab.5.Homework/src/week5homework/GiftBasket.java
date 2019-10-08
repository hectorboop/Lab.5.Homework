package week5homework;

public class GiftBasket {
	private int id;
	private String type;
	private float cost;
	
	public GiftBasket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GiftBasket(int id, String type, float cost) {
		super();
		this.id = id;
		this.type = type;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public float getCost() {
		return cost;
	}
	
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "GiftBasket [id=" + id + ", type=" + type + ", cost=" + cost + "]";
	}

	public void display() {
		System.out.println(toString());
	}
}
