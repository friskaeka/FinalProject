package WebTest.StepDef;

import WebTest.helper.Utility;
import io.cucumber.java.*;

import java.util.Objects;

public class Hooks {
    String tagsRunning = null;
    @BeforeAll
    public static void setUp(){

    }

    @AfterAll
    public static void tearDown(){

    }

    @Before
    public void beforeTest(Scenario scenario){
        String[] tags = scenario.getSourceTagNames().toArray(new String[0]);
        tagsRunning = tags[0];
        if (Objects.equals(tagsRunning, "@web")) {
            Utility.startDriver();
        }
    }


    @After
    public void afterTest() throws InterruptedException {
        if (Objects.equals(tagsRunning, "@web")) {
            Thread.sleep(3000);
            Utility.quitDriver();
        }
    }
}
