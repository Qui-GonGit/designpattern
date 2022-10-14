package com.nicco.designpattern.controller.dto;

public class ResponseMessage {
	String response;

	public ResponseMessage() {
		response = "Nessun utente trovato";
	}
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
}
