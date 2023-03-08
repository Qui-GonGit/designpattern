package com.nicco.designpattern.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController("json")
public class GetAnyObjectJsonController {
	@PostMapping("/getjson")
	public void process(@RequestBody String payload) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, Object> map = objectMapper.readValue(payload, HashMap.class);
		JsonFactory jsonFactory = new JsonFactory();
		JsonParser jparser = jsonFactory.createParser(payload);
		
		JsonNode jsonNodeRoot = objectMapper.readTree(payload);
		System.out.println(jsonNodeRoot.get("guid").asText());
	}
}
