package example.selenium.jbehave.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HomePage extends PageObject{

    private String homePageUrl(){
        return "https://www.totaljobs.com/";
    }

    public String homePageTitle(){
        return "Jobs | UK Job Search | Find your perfect job - totaljobs";
    }

    public void waitForHomePage(){
        waitFor(ExpectedConditions.titleIs(homePageTitle()));
    }

    private void goToHomePage(){
        getDriver().get(homePageUrl());
        waitFor(ExpectedConditions.titleIs(homePageTitle()));
        getDriver().manage().deleteAllCookies();
    }

    private WebElementFacade navSignInButton(){
        return element(By.cssSelector("#navbar-desktop-signin-toggle"));
    }

    private WebElementFacade jobseekerSignInLink(){
        return element(By.cssSelector(".signin-link"));
    }

    private void goToLoginPage(){
        navSignInButton().click();
        waitFor(ExpectedConditions.elementToBeClickable(jobseekerSignInLink()));
        jobseekerSignInLink().click();
    }

    public void openJobseekerLogin() {
        goToHomePage();
        goToLoginPage();
    }

    private WebElementFacade jobseekerAccountButton(){
        return element(By.cssSelector("#navbar-personalisation-toggle"));

    }

    private WebElementFacade signOutLink(){
        return element(By.cssSelector("#sign-out-link"));
    }

    public void logOutJobSeeker() {
        jobseekerAccountButton().click();
        waitFor(ExpectedConditions.elementToBeClickable(signOutLink()));
        signOutLink().click();
    }

    public void assertThatJobseekerIsLoggedOut(){
        assertThat("Jobseeker is still logged in", !jobseekerAccountButton().isCurrentlyVisible(), is(true));
    }
}
