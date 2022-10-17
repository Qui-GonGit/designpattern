package com.nicco.designpattern.controller.dto;

public interface StateDocument {

	public String write();

	public	String read();

	public String send();

	public String review();
	
	public void nextState(Document doc);
	
	public void prevState(Document doc);
	
	public String actualState();
}
