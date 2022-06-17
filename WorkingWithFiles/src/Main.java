import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		createFile();
		getFileInfo();
		writeFile();
		readFile();
	}

	private static void createFile() {
		var file = new File("D:\\Java\\Java_BTK\\files\\students.txt");
		try {
			if (file.createNewFile())
				System.out.println("Dosya oluþturuldu");
			else
				System.out.println("Dosya zaten var");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void getFileInfo() {
		var file = new File("D:\\Java\\Java_BTK\\files\\students.txt");
		if (file.exists()) {
			System.out.println("Dosya adý : " + file.getName());
			System.out.println("Dosya yolu : " + file.getAbsolutePath());
			System.out.println("Dosya yazýlabilir mi : " + file.canWrite());
			System.out.println("Dosya okunabilir mi : " + file.canRead());
			System.out.println("Dosya boyutu (byte) : " + file.length());
		}
	}

	private static void readFile() {
		var file = new File("D:\\Java\\Java_BTK\\files\\students.txt");
		try {
			var reader = new Scanner(file);
			while (reader.hasNextLine()) {
				var line = reader.nextLine();
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void writeFile() {
		try {
			var writer = new BufferedWriter(new FileWriter("D:\\Java\\Java_BTK\\files\\students.txt", true));
			writer.newLine();
			writer.write("Can");
			System.out.println("Dosya yazýldý");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
