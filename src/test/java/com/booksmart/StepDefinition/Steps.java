package com.booksmart.StepDefinition;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Steps {

    @Given("^I am on the booksmart home page $")
    public void i_am_on_the_booksmart_home_page() throws Throwable {
        throw new PendingException();
    }

    @When("^I click on \"([^\"]*)\" on the \"([^\"]*)\"Page$")
    public void i_click_on_something_on_the_somethingpage1(String strArg1, String strArg2) throws Throwable {
        throw new PendingException();
    }

    @Then("^the \"([^\"]*)\"on the \"([^\"]*)\"Page should be visible$")
    public void the_somethingon_the_somethingpage_should_be_visible(String strArg1, String strArg2) throws Throwable {
        throw new PendingException();
    }

    @Then("^I click on \"([^\"]*)\" on the \"([^\"]*)\"Page$")
    public void i_click_on_something_on_the_somethingpage(String strArg1, String strArg2) throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be \"([^\"]*)\"to the booksmart landing \"([^\"]*)\"Page$")
    public void i_should_be_somethingto_the_booksmart_landing_somethingpage(String strArg1, String strArg2) throws Throwable {
        throw new PendingException();
    }

    @And("^I enter \"([^\"]*)\" into the \"([^\"]*)\"Feild on the \"([^\"]*)\"Page$")
    public void i_enter_something_into_the_somethingfeild_on_the_somethingpage(String strArg1, String strArg2, String strArg3) throws Throwable {
        throw new PendingException();
    }

    @And("^I click on \"([^\"]*)\"on the \"([^\"]*)\"Page$")
    public void i_click_on_somethingon_the_somethingpage(String strArg1, String strArg2) throws Throwable {
        throw new PendingException();
    }

}