package com.nicco.designpattern.controller;

import org.springframework.stereotype.Service;

import com.nicco.designpattern.controller.dto.Archive;
@Service
public class StateService {
	public Archive getArchive() {
		return  new Archive();
	}

}
