package net.masterthought.vendingex;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ChocoholicSteps {

    private final VendingMachine vendingMachine = new VendingMachine();
    private int correctMoney = 50;

    @Given("^I insert the correct money$")
    public void I_insert_the_correct_money() {
        vendingMachine.insert(correctMoney);
    }

    @When("^I choose a chocolate$")
    public void I_choose_a_chocolate() {
        vendingMachine.requestChocolate();
    }

    @Then("^I receive my money back$")
    public void I_receive_my_money_back() {
        int coinage = vendingMachine.requestCoinReturn();
        assertThat(coinage, is(correctMoney));
    }
    
    @Then("^I should receive a chocolate$")
    public void I_should_receive_a_chocolate() {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
    
    //The Machine
    @Given("^the machine has (\\d+) chocolates$")
    public void the_machine_has_chocolates(int numberOfChocolates) {
        vendingMachine.stockUpWith(numberOfChocolates);
    }

    @Then("^the machine should have (\\d+) in stock$")
    public void the_machine_should_have_in_stock(int numberOfChocolates) {
        int inventoryCount = vendingMachine.takeInventory();
        assertThat(inventoryCount, is(numberOfChocolates));
    }
}
