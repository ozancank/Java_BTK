import java.util.Scanner;
//import Matematik.DortIslem;
//import Matematik.Logaritma;
import Matematik.*;

public class Main {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.println("Adýnýz:");

		String isim = scanner.nextLine();

		System.out.println("Merhaba " + isim);

		var dortIslem = new DortIslem();
		dortIslem.topla(2, 3);
		
		var logaritma=new Logaritma();
		logaritma.logaritmaHesapla();
	}

}
