import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		var sayilar = new int[] { 1, 2, 3 };
		sayilar = new int[4];
		System.out.println(sayilar[0]);

		var sayilar2 = new ArrayList();
		System.out.println(sayilar2.size());
		sayilar2.add(1);
		sayilar2.add(10);
		sayilar2.add("Ankara");
		System.out.println(sayilar2.size());

		sayilar2.set(2, 100);
		sayilar2.remove(0);
		System.out.println(sayilar2.get(1));
		System.out.println(sayilar2.size());
		
		for (Object i : sayilar2) {
			System.out.println(i);
		}
		
		sayilar2.clear();
		System.out.println(sayilar2.size());
		
		var sehirler=new ArrayList<String>();
		sehirler.add("Ankara");
		
		for (String sehir : sehirler) {
			System.out.println(sehir);
		}
	}
}
