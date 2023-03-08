package com.nicco.designpattern.controller.nullobject.dto;

public class NullUser extends AbstractUser{

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {		
		return "No name";
	}
	
}
