Feature: State Pattern

  Scenario: Initilization document
  	Given document from archive with name Pino
    When the document is Client State and user try to send it
    Then retreive the message : you can't send
  Scenario: Reviewer handle document
  	Given document from archive with name Patrizio
    When the document is Reviewer State and user try to write it
    Then retreive the message : you can't write the document
   
