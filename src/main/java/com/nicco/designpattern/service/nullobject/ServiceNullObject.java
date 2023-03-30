package com.nicco.designpattern.service.nullobject;

import org.springframework.stereotype.Service;

import com.nicco.designpattern.controller.nullobject.dto.AbstractUser;
import com.nicco.designpattern.controller.nullobject.dto.NullUser;
import com.nicco.designpattern.controller.nullobject.dto.RealUser;

@Service
public class ServiceNullObject {

	
	public AbstractUser getUserFromService(String userName) {
		if ("Ted".equalsIgnoreCase(userName)) {
			return new RealUser(userName);
		}
		return new NullUser();		
	}
}
