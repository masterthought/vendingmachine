package net.masterthought.vendingex;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "json:target/cucumber.json"}, tags = "~@todo")
public class AcceptanceTests {
}
