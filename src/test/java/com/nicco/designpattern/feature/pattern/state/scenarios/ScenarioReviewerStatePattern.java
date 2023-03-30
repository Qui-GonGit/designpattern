package com.nicco.designpattern.feature.pattern.state.scenarios;

import static org.junit.Assert.assertEquals;

import com.nicco.designpattern.feature.FeatureConfigStep;
import com.nicco.designpattern.service.statepattern.Archive;
import com.nicco.designpattern.service.statepattern.exception.StateException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioReviewerStatePattern {

	private Archive archive;
	public ScenarioReviewerStatePattern(FeatureConfigStep featureConfigStep) {
		this.archive = featureConfigStep.stateService.getArchive();
	}

	@Given("^document from archive with name (Patrizio)$")
	public void given_document_from_archive(String string) throws StateException {
		this.archive.getDocument().setNextState();
		this.archive.getDocument().setNome(string);
		
	}

	@When("^the document is (Reviewer) State and user try to write it$")
	public void when_document_is_client_state(String string) {
		assertEquals("the actual state is " + string, this.archive.getDocument().getState().actualState());
	}

	@Then("^retreive the message : (you can't write the document)$")
	public void then_document_is_client_state(String string) {
		assertEquals(string, this.archive.getDocument().getState().write());
	}


}
