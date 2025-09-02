package stepdef;

import io.cucumber.java.*;

import static helper.Utility.quitDriver;
import static helper.Utility.startDriver;

public class Hooks {

    @Before
    public void beforeTest(){
        System.out.println("Running test");
        startDriver();
    }

    @After
    public void afterTest() throws InterruptedException {
        System.out.println("Test Finish");
        quitDriver();
    }

}