package test2;


public class Test2 {
	public static void main(String[] args) {
		
		Product product= new Product("P001", "키보드", 35000, 10);

		product.printProductInfo();
		System.out.println("--------------------");

		product.updatePrice(30000);
		System.out.println("--------------------");

		product.printProductInfo();
		System.out.println("--------------------");
		
		product.addStock(5);
		System.out.println("--------------------");

		product.printProductInfo();
		System.out.println("--------------------");
	}
}
