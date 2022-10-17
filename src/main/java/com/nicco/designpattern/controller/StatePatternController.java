package com.nicco.designpattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nicco.designpattern.controller.dto.Archive;
import com.nicco.designpattern.controller.dto.Document;
import com.nicco.designpattern.controller.dto.RequestDocument;
import com.nicco.designpattern.controller.dto.RequestMessage;

import io.swagger.annotations.ApiOperation;

@RestController("statepattern")
public class StatePatternController {

	@Autowired
	private StateService stateService;

//	@PostMapping("/get-document-state")
//	@ApiOperation(value="get actual document state", notes="get document state")
//	public String statePatternDocumentState(@RequestBody RequestMessage request) {
//		return stateService.getDocument().getState().actualState();
//	}
	@PostMapping("/init-document")
	@ApiOperation(value = "init new document", notes = "create a new document")
	public String statePatternInitDocument(@RequestBody RequestDocument request) {
		stateService.getArchive().getDocument().setNome(request.getNome());
		return "document init : " + stateService.getArchive().getDocument().getState().actualState();
	}

	@PostMapping("/set-next-state")
	@ApiOperation(value = "init new document", notes = "set next state to document")
	public String setNextState() {
		stateService.getArchive().getDocument().setNextState();
		return "OK : " + stateService.getArchive().getDocument().getState().actualState();
	}
	@PostMapping("/set-prev-state")
	@ApiOperation(value = "init new document", notes = "set next state to document")
	public String setPrevState() {
		stateService.getArchive().getDocument().setPrevState();
		return stateService.getArchive().getDocument().getState().actualState();
	}

}
