package com.nicco.designpattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nicco.designpattern.controller.dto.RequestMessage;
import com.nicco.designpattern.controller.dto.ResponseMessage;
import com.nicco.designpattern.service.commandpattern.CommandService;

import io.swagger.annotations.ApiOperation;

@RestController("commandpattern")
public class CommandPatternController {

	@Autowired
	private CommandService commandService;
	@PostMapping("/get")
	@ApiOperation(value="get user from 01-04 codes", notes="get user by code")
	public ResponseMessage commandPattern(@RequestBody RequestMessage request) {
		return commandService.getResponse(request);
	}
	
}
