package com.nicco.designpattern.service.chainpattern;

import org.springframework.stereotype.Service;

@Service
public class ChainService {
	static AbstractLogger logger;
	public static AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new InfoLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new DebugLogger(AbstractLogger.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}
	
	public void getInfoLogger() {
		logger.logMessage(1, "test");
	}
	public void getDebugLogger() {
		logger.logMessage(2, "test");
	}
	public void getErrorLogger() {
		logger.logMessage(3, "test");
	}
}
