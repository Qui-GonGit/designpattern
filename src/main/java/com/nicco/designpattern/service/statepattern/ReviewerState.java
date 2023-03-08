package com.nicco.designpattern.service.statepattern;

public class ReviewerState implements StateDocument {

	private String nameState = "Reviewer";
	@Override
	public String write() {
		return "you can't write the document";
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
		return "you can review";
	}

	@Override
	public void nextState(Document doc) {
		doc.setState(new AdminState());
	}

	@Override
	public void prevState(Document doc) {
		doc.setState(new ClientState());
	}

	@Override
	public String actualState() {
		return "the actual state is " + nameState;
	}

	

}
