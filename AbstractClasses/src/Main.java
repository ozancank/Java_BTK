
public class Main {

	public static void main(String[] args) {
		GameCalculator women=new WomenGameCalculator();
		GameCalculator man=new ManGameCalculator();
		women.hesapla();
		women.gameOver();

		man.hesapla();
		man.gameOver();
	}

}
