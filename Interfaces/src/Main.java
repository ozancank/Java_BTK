
public class Main {

	public static void main(String[] args) {
		var customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
	}

}
