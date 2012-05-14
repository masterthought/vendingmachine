Feature: Vend a Chocolate
  As a Chocoholic
  I want to buy a chocolate
  So that I can satisfy my addiction

  Scenario: Money is returned if there are no chocolates
     Given there are no chocolates
     And I insert the correct money
     When I choose a chocolate
     Then I receive my money back







