Feature: State Pattern

  Scenario: Initilization document
  	Given document from archive with name "Pino"
    When the document is "Client" State and user try to send it
    Then retreive the message : "you can't send"

