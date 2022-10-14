package com.nicco.designpattern.service.commandpattern;

import com.nicco.designpattern.controller.dto.ResponseMessage;

public class CommandCode03 implements Command {

	@Override
	public ResponseMessage getResponse() {
		ResponseMessage response = new ResponseMessage();
		response.setResponse("Is Tino");
		return response;
	}

}
