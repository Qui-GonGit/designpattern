package com.nicco.designpattern.service.commandpattern;

import org.springframework.stereotype.Service;

import com.nicco.designpattern.controller.dto.RequestMessage;
import com.nicco.designpattern.controller.dto.ResponseMessage;

@Service
public class CommandService {
	
	public ResponseMessage getResponse(RequestMessage request) {
		CommandFactory commandFact = new CommandFactory();
		return commandFact.getCommand(request.getCodice()).getResponse();
	}

}
