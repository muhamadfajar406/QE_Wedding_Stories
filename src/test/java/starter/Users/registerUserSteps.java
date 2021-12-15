package starter.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class registerUserSteps {
    @Steps
    regisUser regisUser;

    @Given("I am on the register page")
    public void iAmOnTheRegisterPage() {
    }

    @When("I enter my username email and password correctly")
    public void iEnterMyUsernameEmailAndPasswordCorrectly() {
        regisUser.setBodyReq();
    }

    @And("I click Register button")
    public void iClickRegisterButton() {
        regisUser.hitEndpointRegister();
    }

    @Then("I am Successfully registered my Account")
    public void iAmSuccessfullyRegisteredMyAccount() {
        regisUser.valdateEndpointRegister();
    }

    @When("I enter my username email registered and password correctly")
    public void iEnterMyUsernameEmailRegisteredAndPasswordCorrectly() {
        regisUser.setBodyReqEmailExisted();
    }

    @And("I click Register button when email already registered")
    public void iClickRegisterButtonWhenEmailAlreadyRegistered() {
        regisUser.hitEndpointRegisterFailed();
    }

    @Then("I am Failed to registered my Account that email existed")
    public void iAmFailedToRegisteredMyAccountThatEmailExisted() {
        regisUser.valdateEndpointRegister();
    }

    @When("I enter my username registered email and password correctly")
    public void iEnterMyUsernameRegisteredEmailAndPasswordCorrectly() {
        regisUser.setBodyReqUNExisted();
    }

    @And("I click Register button when username already registered")
    public void iClickRegisterButtonWhenUsernameAlreadyRegistered() {
        regisUser.hitEndpointRegisterFailed();
    }

    @Then("I am Failed to registered my Account that username existed")
    public void iAmFailedToRegisteredMyAccountThatUsernameExisted() {
        regisUser.valdateEndpointRegister();
    }

    @When("I enter my email and password correctly but username blank")
    public void iEnterMyEmailAndPasswordCorrectlyButUsernameBlank() {
        regisUser.setBodyReqUNBlank();
    }

    @And("I click Register button when username is blank")
    public void iClickRegisterButtonWhenUsernameIsBlank() {
        regisUser.hitEndpointRegisterFailed();
    }

    @Then("I am Failed to registered my Account that username blank")
    public void iAmFailedToRegisteredMyAccountThatUsernameBlank() {
        regisUser.valdateEndpointRegister();
    }

    @When("I enter my username and password correctly but email blank")
    public void iEnterMyUsernameAndPasswordCorrectlyButEmailBlank() {
        regisUser.setBodyReqEmailBlank();
    }

    @And("I click Register button when email is blank")
    public void iClickRegisterButtonWhenEmailIsBlank() {
        regisUser.hitEndpointRegisterFailed();
    }

    @Then("I am Failed to registered my Account that email blank")
    public void iAmFailedToRegisteredMyAccountThatEmailBlank() {
        regisUser.valdateEndpointRegister();
    }

    @When("I enter my username adn email correctly but password blank")
    public void iEnterMyUsernameAdnEmailCorrectlyButPasswordBlank() {
        regisUser.setBodyReqPWBlank();
    }

    @And("I click Register button when password is blank")
    public void iClickRegisterButtonWhenPasswordIsBlank() {
        regisUser.hitEndpointRegisterFailed();
    }

    @Then("I am Failed to registered my Account that password blank")
    public void iAmFailedToRegisteredMyAccountThatPasswordBlank() {
        regisUser.valdateEndpointRegister();
    }
}
