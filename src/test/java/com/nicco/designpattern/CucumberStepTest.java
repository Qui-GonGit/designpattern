package com.nicco.designpattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SpringBootTest
@ContextConfiguration(classes = DesignpatternApplication.class)
public class CucumberStepTest extends CucumberTest {
	 private static final Logger LOG = LoggerFactory.getLogger(CucumberStepTest.class);
	@Before
	public void setUp() {
		LOG.info("-------------- Spring Context Initialized For Executing Cucumber Tests --------------");
	}

	@When("^the client calls /version$")
	public void the_client_issues_GET_version() throws Throwable {
		System.out.println("http://localhost:8080/version");
	}

	@Then("^create a new document$")
	public void the_client_receives_status_code_of(int statusCode) throws Throwable {
		System.out.println("status code is incorrect");
	}

}
