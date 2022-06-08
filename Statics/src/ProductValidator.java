
public class ProductValidator {
	
	static {
		System.out.println("Statik Yapýcý blok");
	}
	
	public ProductValidator() {
		System.out.println("Yapýcý blok");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		}
		return false;
	}
}
