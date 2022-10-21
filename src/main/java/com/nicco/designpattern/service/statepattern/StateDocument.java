package com.nicco.designpattern.service.statepattern;

import com.nicco.designpattern.service.statepattern.exception.StateException;

public interface StateDocument {

	public String write();

	public	String read();

	public String send();

	public String review();
	
	public void nextState(Document doc) throws StateException;
	
	public void prevState(Document doc) throws StateException;
	
	public String actualState();
}
