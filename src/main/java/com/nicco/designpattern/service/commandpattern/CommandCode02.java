package com.nicco.designpattern.service.commandpattern;

import com.nicco.designpattern.controller.dto.ResponseMessage;

public class CommandCode02 implements Command {

	@Override
	public ResponseMessage getResponse() {
		ResponseMessage response = new ResponseMessage();
		response.setResponse("Is Pino");
		return response;
	}

}
