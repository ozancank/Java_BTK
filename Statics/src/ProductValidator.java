
public class ProductValidator {
	
	static {
		System.out.println("Statik Yap�c� blok");
	}
	
	public ProductValidator() {
		System.out.println("Yap�c� blok");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		}
		return false;
	}
}
