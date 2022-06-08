
public class Main {

	public static void main(String[] args) {
		var manager = new ProductManager();
		var product = new Product();
		product.price = 10;
		product.name = "Mouse";
		manager.add(product);
		
		DatabaseHelper.Connection.createConnection();
	}	
}
