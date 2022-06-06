
public class Main {

	public static void main(String[] args) {
		var product = new Product(1, "Laptop", "Asus Laptop", 5000, 3);
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("Asus Laptop");
//		product.setPrice(5000);
//		product.setStockAmount(3);

		System.out.println(product.getName());
		var productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

		System.out.println("--------------------");

		var dortIslem = new DortIslem();
		System.out.println(dortIslem.topla(1, 2));
		System.out.println(dortIslem.topla(1, 2, 3));
		
		System.out.println("--------------------");
		
		var customer=new Customer();
		var customerManager = new CustomerManager();
		var employee=new Employee();
		var employeeManager=new EmployeeManager();
		
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		employeeManager.BestEmployee();
	}
}
