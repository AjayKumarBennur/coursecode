package com.te.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileHandlerLogger {
	final static Logger LOGGER = Logger.getLogger(FileHandlerLogger.class.getName());
	public static void main(String[] args) throws SecurityException, IOException {
		FileHandler fileHandler = new FileHandler("C:\\Users\\Ajay\\Desktop\\Logger\\status.log");

		fileHandler.setLevel(Level.ALL); 
		MyFormatter myFormatter = new MyFormatter();
		fileHandler.setFormatter(myFormatter);
		LOGGER.addHandler(fileHandler);
		LOGGER.setLevel(Level.ALL);
		LOGGER.severe("From sever");
		LOGGER.warning("From warn");
		LOGGER.info("From info");
		LOGGER.config("From config");
		LOGGER.fine("From fine");

	}
}
