package com.nicco.designpattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nicco.designpattern.service.statepattern.RequestDocument;
import com.nicco.designpattern.service.statepattern.StateService;
import com.nicco.designpattern.service.statepattern.exception.StateException;

import io.swagger.annotations.ApiOperation;

@RestController("statepattern")
public class StatePatternController {

	@Autowired
	private StateService stateService;


	@PostMapping("/init-document")
	@ApiOperation(value = "init new document", notes = "create a new document")
	public String statePatternInitDocument(@RequestBody RequestDocument request) {
		stateService.getArchive().getDocument().setNome(request.getNome());
		return "document init : " + stateService.getArchive().getDocument().getState().actualState();
	}

	@PostMapping("/set-next-state")
	@ApiOperation(value = "init new document", notes = "set next state to document")
	public String setNextState() throws StateException {
		stateService.getArchive().getDocument().setNextState();
		return "OK : " + stateService.getArchive().getDocument().getState().actualState();
	}
	@PostMapping("/set-prev-state")
	@ApiOperation(value = "init new document", notes = "set next state to document")
	public String setPrevState() throws StateException {
		stateService.getArchive().getDocument().setPrevState();
		return stateService.getArchive().getDocument().getState().actualState();
	}

}
