package com.nicco.designpattern.service.statepattern;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nicco.designpattern.service.statepattern.exception.StateException;

public class Document {
	private String nome;
	@JsonIgnore
	private StateDocument state;
	@JsonIgnore
	public Document() {
		this.setState(new ClientState());
	}
	@JsonIgnore
	public StateDocument getState() {
		return this.state;
	}
	@JsonIgnore
	public void setNextState() throws StateException {
		this.state.nextState(this);
	}
	@JsonIgnore
	public void setPrevState() throws StateException {
		this.state.prevState(this);
	}
	@JsonIgnore
	public void setState(StateDocument state) {
		this.state = state;
	}
	@JsonIgnore
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
}
