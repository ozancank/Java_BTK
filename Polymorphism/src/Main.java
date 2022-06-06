
public class Main {

	public static void main(String[] args) {
//		var loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger(),
//				new ConsoleLogger() };
//		for (var logger : loggers) {
//			logger.Log("Log mesajý");
//		}
		
		var customerManager=new CustomerManager(new FileLogger());
		customerManager.Add();
	}
}
