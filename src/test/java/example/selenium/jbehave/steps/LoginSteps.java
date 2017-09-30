package example.selenium.jbehave.steps;

import example.selenium.jbehave.pages.HomePage;
import example.selenium.jbehave.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

    private HomePage homePage;
    private LoginPage loginPage;

    @Step
    public void openLoginPage() {
        homePage.openJobseekerLogin();
        loginPage.waitForLoginPage();
    }

    @Step
    public void signInSignOut() {
        String email = System.getProperty("email", "aiden.brusby@jobsite.co.uk");
        String password = System.getProperty("password", "Testtest1");
        loginPage.signInToJobSeeker(email, password);
        homePage.waitForHomePage();
        homePage.logOutJobSeeker();
    }

    @Step
    public void assertNotLoggedIn() {
        homePage.assertThatJobseekerIsLoggedOut();
    }

}
