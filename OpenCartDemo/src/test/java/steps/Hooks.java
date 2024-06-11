package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.CommonMethods;

public class Hooks {

    @Before
    public void setUp() {
        CommonMethods.setUp();
    }

    @After
    public void tearDown() {
        CommonMethods.tearDown();
    }
}