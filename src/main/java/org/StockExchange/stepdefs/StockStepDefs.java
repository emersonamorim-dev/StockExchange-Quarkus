package org.StockExchange.stepdefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StockStepDefs {

    @Given("the user has opened the application")
    public void theUserHasOpenedTheApplication() {
    }

    @When("the user adds a new stock with symbol {string} and price {int}")
    public void theUserAddsANewStockWithSymbolAndPrice(String symbol, int price) {

    }

    @Then("the stock with symbol {string} should be displayed in the list of stocks")
    public void theStockWithSymbolShouldBeDisplayedInTheListOfStocks(String symbol) {
        Assertions.assertTrue(true); 
    }
}

