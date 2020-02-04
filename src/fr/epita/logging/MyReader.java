package fr.epita.logging;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyReader {

	public void readFile() {
		try (FileReader fr = new FileReader("app2.log");
			BufferedReader br = new BufferedReader(fr)) {

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			//e
		}
	}
}
