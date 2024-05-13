
Feature: As a user I need to validate the title in wikipedia, do a search and complete the form for create a account.

  @ValidateTitleInWikipedia
  Scenario: enters to the main page of Wikipedia
    Given the user enters wikipedia page
    Then the user validates the title Bienvenidos a Wikipedia on Wikipedia's main page

  @SearchInWikipedia
  Scenario: the user search in the page of wikipedia
    Given the user enters wikipeadia page
    When the user writes the word Sistema
    Then the user validate the word Análisis CEEM

  @RegisterFormInWikipedia
  Scenario: the user search in the page of wikipedia
    Given the user enters wikipedia page
    When the user makes click in the button Crear cuenta
    And the user fills the register form
    Then The user validates that the message Completa este campo is presented in the captcha pop-up
