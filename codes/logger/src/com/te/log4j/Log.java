package com.te.log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log {
	public static final Logger LOGGER = LogManager.getLogger(Log.class);	
	public static void main(String[] args) {
		LOGGER.trace("I am from trace");
		LOGGER.debug("I am from debug");
		LOGGER.info("I am from info");
		LOGGER.warn("I am from warn");
		LOGGER.error("I am from error");
		LOGGER.fatal("I am from fatal");
	}
}
