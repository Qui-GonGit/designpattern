package com.nicco.designpattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nicco.designpattern.service.chainpattern.ChainService;
import com.nicco.designpattern.service.statepattern.RequestDocument;
import com.nicco.designpattern.service.statepattern.StateService;
import com.nicco.designpattern.service.statepattern.exception.StateException;

import io.swagger.annotations.ApiOperation;

@RestController("changeofresponsabilitypattern")
public class ChainOfResponsabilityPattern {

	@Autowired
	private ChainService chainservice;


	@PostMapping("/init-logger")
	@ApiOperation(value = "init logger in info", notes = "")
	public String initLogger() {
		ChainService.getChainOfLoggers();
		return "logger initilaizate";
	}
	@PostMapping("/loggerinfo")
	@ApiOperation(value = "init logger in info", notes = "")
	public String statePatternInitDocument(@RequestBody RequestDocument request) {
	chainservice.getInfoLogger();
		return "see log";
	}

	@PostMapping("/loggererror")
	@ApiOperation(value = "init logger in error", notes = "")
	public String setNextState() throws StateException {
		chainservice.getErrorLogger();
		return "see log";
	}
	@PostMapping("/loggerdebug")
	@ApiOperation(value = "init logger in warning", notes = "")
	public String setPrevState() throws StateException {
		chainservice.getDebugLogger();
		return "see log";
	}

}
