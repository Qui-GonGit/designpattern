package com.nicco.designpattern.controller.nullobject.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.nicco.designpattern.service.nullobject.ServiceNullObject;


class AbstractUserTest {

	
	@Before
	public void init() {
	}
	
	@Test
	void GivenUserTedWhenSearchUserTedThenReturnIsNilFalse() {
		ServiceNullObject serviceNullObject = new ServiceNullObject();
		AbstractUser user = serviceNullObject.getUserFromService("Ted");
		assertEquals(false, user.isNil());
	}
	@Test
	void GivenUserTodWhenSearchUserTedThenReturnIsNilTrue() {
		ServiceNullObject serviceNullObject = new ServiceNullObject();
		AbstractUser user = serviceNullObject.getUserFromService("Tod");
		assertEquals(true, user.isNil());
	}

}
