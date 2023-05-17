@auto
Feature: Auto Quote Testing

	@smoke @regression
  Scenario: Validate Auto Quote
    Given homepage title is <'Car insurance with flexible payment options.'>
    When user insert zipcode <'54114'>
    And user clicks getAQuote button
    Then user is in General-Info page
    When user selects five_Yrs liablity <'No'>
    And user selects ownHomeFlag <'Rent'>
    And user clicks continue button
    Then system error shows <'Please provide a valid email address.'>
