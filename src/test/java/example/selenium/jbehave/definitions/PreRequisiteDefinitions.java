package example.selenium.jbehave.definitions;

import example.selenium.jbehave.steps.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;

public class PreRequisiteDefinitions {

    @Steps
    private LoginSteps loginSteps;

    @Given("I am on the login page")
    public void goToLoginPage(){
        loginSteps.openLoginPage();
    }
}
