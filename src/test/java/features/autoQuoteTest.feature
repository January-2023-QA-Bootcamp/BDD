@auto
Feature: Auto Quote Testing

Background:
* say hello!

  @smoke
  Scenario: Validate Auto Quote
    Given homepage title is <'Car insurance with flexible payment options.'>
    When user insert zipcode <'54114'>
    And user clicks getAQuote button
    Then user is in General-Info page
    When user selects five_Yrs liablity <'No'>
    And user selects ownHomeFlag <'Rent'>
    And user clicks continue button
    Then system error shows <'Please provide a valid email address.'>

  @regression
  Scenario Outline: Validate Auto Quote homepage title
    Given homepage title is <'Car insurance with flexible payment options.'>
    When user insert zipcode <zipCode>

    Examples: 
      | zipCode |
      | '54114' |
      | '54113' |
      | '54112' |
