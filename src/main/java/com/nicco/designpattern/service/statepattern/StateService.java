package com.nicco.designpattern.service.statepattern;

import org.springframework.stereotype.Service;
@Service
public class StateService {
	public Archive getArchive() {
		return  new Archive();
	}

}
