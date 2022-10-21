package com.nicco.designpattern.service.statepattern;

public class Archive {

	private static Document doc = new Document();
	
	public Document getDocument() {
		return doc;
	}
}
