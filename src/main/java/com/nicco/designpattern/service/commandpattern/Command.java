package com.nicco.designpattern.service.commandpattern;

import com.nicco.designpattern.controller.dto.ResponseMessage;

public interface Command {

	public ResponseMessage getResponse();
}
