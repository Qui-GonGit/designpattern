package com.nicco.designpattern.controller.nullobject.dto;

public class RealUser extends AbstractUser{

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public String getName() {		
		return this.name;
	}
	
}
