
public class Main {

	public static void main(String[] args) {
		System.out.println("Merhaba Java");

		int sayi = 10;
		sayi++;
		System.out.println("Sayý : " + sayi);

		double sayi2 = 20.2;
		sayi2 = sayi2 + sayi;
		char character = ':';
		System.out.println("Sayý2 " + character + " " + sayi2);

		if (sayi2 > 30) {
			System.out.println("Sayý 30 dan büyük");
		} else {
			System.out.println("Sayý 30 dan küçük");
		}

		char grade = 'A';
		switch (grade) {
		case 'A':
			System.out.println("A");
			break;
		case 'B':
			System.out.println("B");
			break;
		default:
			System.out.println("Default");
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		int i1 = 1;
		while (i1 < 10) {
			i1++;
			if (i1 == 10) {
				System.out.println("Son");
			}
		}

		int j1 = 1;
		do {
			System.out.println(j1);
			j1 += 2;
		} while (j1 < 10);

		System.out.println("-----------------");

		var dizi = new String[3];
		dizi[0] = "0";
		dizi[1] = "1";
		dizi[2] = "2";
		for (var item : dizi) {
			System.out.println(item);
		}

		System.out.println("-----------------");
		double[] myList = { 1, 2, 1.3, 4.3, 5.6 };
		for (var item : myList) {
			System.out.println(item);
		}

		System.out.println("-----------------");
		var dizi2 = new String[3][3];
		dizi2[0][0] = "0,0";
		dizi2[0][1] = "0,1";
		dizi2[0][2] = "0,2";
		dizi2[1][0] = "1,0";
		dizi2[1][1] = "1,1";
		dizi2[1][2] = "1,2";
		dizi2[2][0] = "2,0";
		dizi2[2][1] = "2,1";
		dizi2[2][2] = "2,2";

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println(dizi2[i][j]);
			}
		}

		System.out.println("-----------------");
		var mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);
		System.out.println("Eleman sayýsý: " + mesaj.length());
		System.out.println("5. Eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaþasýn!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		var karakterler = new char[5];
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a"));

		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj);
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2, 5));

		for (var item : mesaj.split(" ")) {
			System.out.println(item);
		}

		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());

		System.out.println("-----------------");
		char harf = 'O';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalýn sesli harf");
			break;
		default:
			System.out.println("Ýnce sesli harf");
		}

		System.out.println(topla(2, 3));
		System.out.println(topla2(5, 6, 9));
	}

	public static int topla(int a, int b) {
		return a + b;
	}

	public static int topla2(int... sayilar) {
		var toplam = 0;
		for (var sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}
}
