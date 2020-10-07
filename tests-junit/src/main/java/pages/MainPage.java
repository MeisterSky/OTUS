package pages;

import config.ServerConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import config.PropertyLoader;

public class MainPage extends BasePage {

    private String url = PropertyLoader.getProperty("site.url");
    private ServerConfig cfg = ConfigFactory.create(ServerConfig.class);

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(cfg.url());
    }

    public boolean atPage() {
        return driver.findElements(By.xpath("//title[.='Онлайн‑курсы для профессионалов, дистанционное обучение современным профессиям']")).size() > 0;
    }

    public String getURL() {
        return url;
    }
}