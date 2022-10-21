package com.nicco.designpattern.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.nicco.designpattern.controller.dto.RequestMessage;
import com.nicco.designpattern.controller.dto.ResponseMessage;
import com.nicco.designpattern.service.commandpattern.CommandService;

class StateServiceTest {
	
	
	CommandService service = new CommandService();

	@Before
	public void setup() {
		
	}

	@Test
	void testWhenCustomerInsertCode01ShouldReturnIsGino() {
		RequestMessage request = new  RequestMessage();
		request.setCodice("01");
		ResponseMessage response = service.getResponse(request);	
		assertEquals("Is Gino", response.getResponse());
	}
	@Test
	void testWhenCustomerInsertCode02ShouldReturnIsPino() {
		RequestMessage request = new  RequestMessage();
		request.setCodice("02");
		ResponseMessage response = service.getResponse(request);	
		assertEquals("Is Pino", response.getResponse());
	}
	@Test
	void testWhenCustomerInsertCode03ShouldReturnIsTino() {
		RequestMessage request = new  RequestMessage();
		request.setCodice("03");
		ResponseMessage response = service.getResponse(request);	
		assertEquals("Is Tino", response.getResponse());
	}
	@Test
	void testWhenCustomerInsertCode04ShouldReturnIsLino() {
		RequestMessage request = new  RequestMessage();
		request.setCodice("04");
		ResponseMessage response = service.getResponse(request);	
		assertEquals("Is Lino", response.getResponse());
	}
	@Test
	void testWhenCustomerNotInsertCodeShouldReturnNothing() {
		RequestMessage request = new  RequestMessage();
		request.setCodice("");
		ResponseMessage response = service.getResponse(request);	
		assertEquals("Nessun utente trovato", response.getResponse());
	}

}
