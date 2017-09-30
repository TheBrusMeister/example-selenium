package example.selenium.jbehave.definitions;

import example.selenium.jbehave.steps.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;

public class ActionDefinitions {

    @Steps
    private LoginSteps loginSteps;

    @When("I sign in and then sign out")
    public void signInSignOut(){
        loginSteps.signInSignOut();
    }
}
