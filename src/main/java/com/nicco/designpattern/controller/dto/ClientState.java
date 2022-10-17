package com.nicco.designpattern.controller.dto;

public class ClientState implements StateDocument {
	
	private String nameState = "Client";
	@Override
	public String write() {
		return "written document";
	}

	@Override
	public String read() {
		return "document read";
	}

	@Override
	public String send() {
		return "you can't send";
	}

	@Override
	public String review() {
		return "you can't review";
	}

	@Override
	public void nextState(Document doc) {
		doc.setState(new ReviewerState());
	}

	@Override
	public void prevState(Document doc) {
		System.out.println("the document can't set a old state");		
	}

	@Override
	public String actualState() {
		return "the actual state is " + nameState;
	}

	

}
