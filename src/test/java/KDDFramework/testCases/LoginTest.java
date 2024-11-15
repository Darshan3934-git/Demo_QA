package KDDFramework.testCases;
import KDDFramework.keyEngine.KeyEngine;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;


public class LoginTest {

    KeyEngine keyEngine;
    public final static Logger logger = LogManager.getLogger(LoginTest.class);
    @BeforeTest
    public void setUp() {
        keyEngine = new KeyEngine();
    }
    @Test
    public void loginTest() throws IOException, InterruptedException {


        String filePath = System.getProperty("user.dir")+ "//src//test//java//resources//linkdin.xlsx";
        logger.debug("Executed login test");
        keyEngine.service(filePath);
    }
    @AfterTest
    public void afterTest() throws IOException {
        keyEngine.tearDown();
    }

}
