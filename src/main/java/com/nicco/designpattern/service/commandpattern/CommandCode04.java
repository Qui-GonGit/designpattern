package com.nicco.designpattern.service.commandpattern;

import com.nicco.designpattern.controller.dto.ResponseMessage;

public class CommandCode04 implements Command {

	@Override
	public ResponseMessage getResponse() {
		ResponseMessage response = new ResponseMessage();
		response.setResponse("Is Lino");
		return response;
	}

}
