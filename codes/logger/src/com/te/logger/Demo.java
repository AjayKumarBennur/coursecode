package com.te.logger;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo {
	public static final Logger LOGGER = Logger.getLogger(Demo.class.getName());
	public static void main(String[] args) throws Exception, IOException {
		FileHandler handler = new FileHandler("C:\\Users\\Ajay\\Desktop\\Newlog.log");
		Formatter format = new MyFormatter();
		handler.setFormatter(format);
		handler.setLevel(Level.FINE);
		LOGGER.setLevel(Level.FINEST);
		LOGGER.addHandler(handler);
		LOGGER.finest("I am finest");
		LOGGER.finer("I am from finer");
		LOGGER.fine("I am from fine");
		LOGGER.config("I am from config");
		LOGGER.info("I am from info");
		LOGGER.warning("I am from warning");
		LOGGER.severe("I am from severe");
	}
}
