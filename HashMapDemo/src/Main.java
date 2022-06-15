import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		var sozluk = new HashMap<String, String>();
		sozluk.put("book", "kitap");
		sozluk.put("table", "masa");
		System.out.println(sozluk.get("book"));

		for (String item : sozluk.keySet()) {
			System.out.println(item);
		}

		sozluk.remove("table");
		System.out.println(sozluk.get("table"));
	}
}
