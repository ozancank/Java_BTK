
public class Main {

	public static void main(String[] args) {
		var thread1 = new KronometreThread("thread1");

		var thread2 = new KronometreThread("thread2");

		var thread3 = new KronometreThread("thread3");

		thread1.start();
		thread2.start();
		thread3.start();
	}

}
