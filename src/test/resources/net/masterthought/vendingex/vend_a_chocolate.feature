Feature: Vend a Chocolate
  As a Chocoholic
  I want to buy a chocolate
  So that I can satisfy my addiction

  Scenario: Money is returned if there are no chocolates
     Given the machine has 0 chocolates
     And I insert the correct money
     When I choose a chocolate
     Then I receive my money back

  @todo
  Scenario Outline: Chocolate is dispensed when there is at least one chocolate
    Given the machine has <STOCK> chocolates
    And I insert the correct money
    When I choose a chocolate
    Then I should receive a chocolate
    And the machine should have <CHOCOLATES REMAINING> in stock

    Examples:
      | STOCK | CHOCOLATES REMAINING  |
      |   1   |           0           |
      |  10   |           9           |

  @todo
  Scenario Outline: Tells you when you need more money
  	Given the machines charges 50p for a chocolate
  	And I have inserted <AMOUNT>
  	When I choose a chocolate
  	Then I should see the message "Chocolates cost 50p, please insert more money"
  
    Examples:
      | AMOUNT |
      |  0     |
      | 10     |
      | 20     |
      | 49     |
	
  @todo
	Scenario Outline: Gives you change when you've inserted too much money
    Given the machines charges 50p for a chocolate
    And I insert the correct money
    When I choose a chocolate
    Then I should receive <AMOUNT RETURNED> in change
	
      Examples: 
        | AMOUNT INSERTED | AMOUNT RETURNED |
        |        100      |     50          |
