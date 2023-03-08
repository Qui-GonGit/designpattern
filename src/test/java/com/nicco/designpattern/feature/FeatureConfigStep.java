package com.nicco.designpattern.feature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nicco.designpattern.service.statepattern.StateService;

import io.cucumber.spring.CucumberContextConfiguration;
@CucumberContextConfiguration
@SpringBootTest()
public class FeatureConfigStep {

	@Autowired
	public StateService stateService;
	
	
	
}
