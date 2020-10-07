import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import pages.MainPage;

import static org.junit.Assert.assertTrue;

public class OpenMainPageTest extends BaseTest {

    private MainPage mainPage;
    private Logger logger = LogManager.getLogger(BaseTest.class);

    @Before
    public void setUp() {

        mainPage = new MainPage(driver);

    }

    @Test
    public void openMainPageTest() {

        logger.info("Открываю главную страницу");
        mainPage.open();
        logger.info("Проверяю, что главная страница открыта");
        assertTrue("Главная не открылась", mainPage.atPage());

    }
}
