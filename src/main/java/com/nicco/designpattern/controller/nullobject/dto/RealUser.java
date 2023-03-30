package com.nicco.designpattern.controller.nullobject.dto;

public class RealUser extends AbstractUser{
	
	public RealUser(String userName) {
		this.name = userName;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public String getName() {		
		return this.name;
	}
	
}
