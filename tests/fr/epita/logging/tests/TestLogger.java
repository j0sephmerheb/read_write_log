package fr.epita.logging.tests;

import fr.epita.logging.FileLogger;
import fr.epita.logging.Logger;
import fr.epita.logging.MyReader;
// import fr.epita.logging.MyScannerReader;

public class TestLogger {

	public static void main(String[] args) {
		/*
		 * Print to console
		 */
		Logger logger = new Logger();
		logger.log("logger 1 log");

		/*
		 * Write to file
		 */
		FileLogger fileLogger = new FileLogger();
		fileLogger.log("fileLogger log");

		/*
		 * Read from file: BUfferedReader
		 */
		MyReader myReader = new MyReader();
		myReader.readFile();
		
		/*
		 * Read from file: Scanner
		 */
		// MyScannerReader myScannerReader = new MyScannerReader();
		// myScannerReader.readFile();
	}

}
