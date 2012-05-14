package net.masterthought.vendingex;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import org.junit.Assert;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ChocoholicSteps {

    private final VendingMachine vendingMachine = new VendingMachine();
    private int correctMoney = 50;

    @Given("^there are no chocolates$")
    public void there_are_no_chocolates() {
    }

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

}
