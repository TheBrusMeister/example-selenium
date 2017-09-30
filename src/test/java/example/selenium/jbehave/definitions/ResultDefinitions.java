package example.selenium.jbehave.definitions;

import example.selenium.jbehave.steps.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;

public class ResultDefinitions {

    @Steps
    private LoginSteps loginSteps;

    @Then("I am no longer logged in")
    public void assertNotLoggedIn(){
        loginSteps.assertNotLoggedIn();
    }
}
