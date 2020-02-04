package fr.epita.logging;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyScannerReader {

	public void readFile() {
		try (FileReader fr = new FileReader("app2.log");
			Scanner scanner = new Scanner(fr)) {

			StringBuilder sb = new StringBuilder();
			while (scanner.hasNext()) {
				sb.append(scanner.nextLine()).append("\n");
			}

			System.out.println(sb.toString());

		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
		}
	}
}