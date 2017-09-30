package example.selenium.jbehave.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageObject {

    public String loginPageTitle(){
        return "totaljobs Sign in or Register";
    }

    public void waitForLoginPage(){
        waitFor(ExpectedConditions.titleIs(loginPageTitle()));
    }

    private WebElementFacade emailInput(){
        return element(By.cssSelector("#Form_Email"));
    }

    private WebElementFacade passwordInput(){
        return element(By.cssSelector("#Form_Password"));
    }

    private WebElementFacade signInButton(){
        return element(By.cssSelector("#btnLogin"));
    }

    private void fillOutLoginForm(String email, String password){
        emailInput().typeAndTab(email);
        passwordInput().type(password);
        signInButton().click();
    }

    public void signInToJobSeeker(String email, String password) {
        fillOutLoginForm(email, password);
    }
}
