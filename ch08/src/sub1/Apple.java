package sub1;

public class Apple {
	
	private String country;
	public Apple(String country, int price) {

		this.country = country;
		this.price = price;
	}

	private int price;
	
	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	
	

}
