package example.selenium.jbehave;

import net.serenitybdd.jbehave.SerenityStories;
import org.jbehave.core.annotations.BeforeStory;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class AcceptanceTestSuite extends SerenityStories {

    public AcceptanceTestSuite(){
        String story = System.getProperty("run.story");
        String storiesFolder = System.getProperty("run.folder");
        if (story != null) {
            System.out.println("Running " + story);
            findStoriesCalled(story);
        } else if (storiesFolder != null) {
            System.out.println("Running " + storiesFolder);
            findStoriesIn("**/" + storiesFolder + "/");
        } else {
            System.out.println("Running all stories");
            findStoriesIn("**/stories/");
        }
    }

    @BeforeStory
    public void setup(){
        try {
            getDriver().manage().window().maximize();
        } catch (Exception e) {
            System.out.println("Could not maximise");
        }
    }
}
