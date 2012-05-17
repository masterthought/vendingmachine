package net.masterthought.vendingex;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class ChocoholicSteps {

    private static final String A_CHOCOLATE = "Chocolate";
    private final VendingMachine vendingMachine = new VendingMachine();
    private int correctMoney = 50;
    private String item;

    @Given("^I insert the correct money$")
    public void I_insert_the_correct_money() {
        vendingMachine.insert(correctMoney);
    }

    @When("^I choose a chocolate$")
    public void I_choose_a_chocolate() {
        item = vendingMachine.requestChocolate();
    }

    @Then("^I receive my money back$")
    public void I_receive_my_money_back() {
        int coinage = vendingMachine.requestCoinReturn();
        assertThat(coinage, is(correctMoney));
    }
    
    @Then("^I should receive a chocolate$")
    public void I_should_receive_a_chocolate() {
        assertThat(item, is(A_CHOCOLATE));
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
