import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import config.PropertyLoader;
import webdrivers.BrowserFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;
    private Logger logger = LogManager.getLogger(BaseTest.class);

    @Before
    public void init() {
        driver = BrowserFactory.getInstance(PropertyLoader.getProperty("browser.name"), PropertyLoader.getProperty("browser.lang"));

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @After
    public void stop() {
        logger.info("Закрываю браузер");
        if (driver != null)
            driver.quit();
    }
}
