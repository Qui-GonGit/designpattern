package com.nicco.designpattern.feature.pattern.state.scenarios;

import static org.junit.Assert.assertEquals;

import com.nicco.designpattern.feature.FeatureConfigStep;
import com.nicco.designpattern.service.statepattern.Archive;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioClientStatePattern {

	public Archive archive;

	public ScenarioClientStatePattern(FeatureConfigStep featureConfigStep) {
		this.archive = featureConfigStep.stateService.getArchive();
	}

	@Given("^document from archive with name ([a-zA-Z]{4})$")
	public void given_document_from_archive(String string) {
		this.archive.getDocument().setNome(string);
	}

	@When("^the document is (Client) State and user try to send it$")
	public void when_document_is_client_state(String string) {
		assertEquals("the actual state is " + string, this.archive.getDocument().getState().actualState());
	}

	@Then("^retreive the message : (you can't send)$")
	public void then_document_is_client_state(String string) {
		assertEquals(string, this.archive.getDocument().getState().send());
	}

}
