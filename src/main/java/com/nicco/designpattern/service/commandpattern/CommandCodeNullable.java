package com.nicco.designpattern.service.commandpattern;

import com.nicco.designpattern.controller.dto.ResponseMessage;

public class CommandCodeNullable implements Command {

	@Override
	public ResponseMessage getResponse() {
		ResponseMessage response = new ResponseMessage();
		response.setResponse("Nessun utente trovato");
		return response;
	}

}
