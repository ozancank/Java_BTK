
public class Main {

	public static void main(String[] args) {
		try {
			var sayilar = new int[] { 1, 2, 3 };
			System.out.println(sayilar[3]);
		} catch (StringIndexOutOfBoundsException exception) {
			System.out.println(exception);
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception);
		} catch (Exception exception) {
			System.out.println(exception);
		} finally {
			System.out.println("son");
		}

		try {
			throw new CustomException("Custom");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
