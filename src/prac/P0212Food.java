package prac;

public class P0212Food {
	private String name;
	private int price;
	private String type;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	public String toString() {
		return "[name=" + name + ",price=" + price + ",type=" + type + "]";
	}
	
class Food2 {
	
	public static void main(String[] args) {
		P0212Food f = new P0212Food();
		
		f.setName("짜장면");
		f.setPrice(7000);
		f.setType("중식");
		
		System.out.println(f);
	}
}

}
