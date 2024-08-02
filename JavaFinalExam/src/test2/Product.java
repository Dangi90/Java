package test2;

public class Product {
	
	private String productId;
	private String productName;
	private int price;
	private int quantity;
	
	public Product(String productId, String productName, int price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public void printProductInfo() {
		
		System.out.println("상품ID: " + this.productId);
		System.out.println("상품이름: " + this.productName);
		System.out.println("상품가격: " + this.price);
		System.out.println("재고수량: " + this.quantity);
		
	}

	public void updatePrice(int newPrice) {
		this.price = newPrice;
		System.out.println("키보드 가격 수정 됨");
	}

	public void addStock(int newStock) {
		this.quantity += newStock;
		System.out.println("키보드 "+ this.quantity +"재고 추가 됨");
		
	}
	
	

}
