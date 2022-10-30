package com.nicco.designpattern.service.chainpattern;

public class InfoLogger extends AbstractLogger{

	
	public InfoLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Info Logger :" + message);		
	}

}
