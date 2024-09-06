package WebTest.StepDef;

import WebTest.helper.Utility;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class Hooks {
    @BeforeAll
    public static void setUp(){

    }

    @AfterAll
    public static void tearDown(){

    }

    @Before
    public void beforeTest(){
        Utility.startDriver();
    }


    @After
    public void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        Utility.quitDriver();
    }
}
