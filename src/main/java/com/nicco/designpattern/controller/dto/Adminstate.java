package com.nicco.designpattern.controller.dto;

public class Adminstate implements StateDocument {
	private String nameState = "Administrator";
	@Override
	public String write() {
		return "you can't write";
	}

	@Override
	public String read() {
		return "you can read";
	}

	@Override
	public String send() {
		return "you can send";
	}

	@Override
	public String review() {
		return "you can review";
	}

	@Override
	public void nextState(Document doc) {
		
	}

	@Override
	public void prevState(Document doc) {
		doc.setState(new ReviewerState());
	}

	@Override
	public String actualState() {
		return "the actual state is " + nameState;
	}

}
