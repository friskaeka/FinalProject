package WebTest.StepDef;

import WebTest.helper.Utility;
import io.cucumber.java.*;
import org.junit.jupiter.api.BeforeEach;

import java.util.Objects;

import static WebTest.helper.Utility.quitDriver;
import static WebTest.helper.Utility.startDriver;

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
            startDriver();
        }
    }

//    @BeforeEach
//    public void beforeEach() throws InterruptedException {
//        Thread.sleep(5000);
//    }

    @After
    public void afterTest() throws InterruptedException {
        if (Objects.equals(tagsRunning, "@web")) {
            Thread.sleep(3000);
            quitDriver();
        }
    }
}
