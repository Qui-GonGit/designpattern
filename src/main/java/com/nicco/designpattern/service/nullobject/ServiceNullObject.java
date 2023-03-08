package com.nicco.designpattern.service.nullobject;

import org.springframework.stereotype.Service;

import com.nicco.designpattern.controller.nullobject.dto.AbstractUser;

@Service
public class ServiceNullObject {

	public String getUserName(AbstractUser user) throws Exception {
		return user.getName();
	}
}
