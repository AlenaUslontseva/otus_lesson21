package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.FaqPage;
import pages.MainPage;
import utils.WebDriverInit;

public class FaqPageTest {
    private WebDriver driver;
    private MainPage mainPage;
    private FaqPage faqPage;

    @Before
    public void setUp() {
        driver = WebDriverInit.init();
        mainPage = new MainPage(driver);
        faqPage = new FaqPage(driver);
    }

    @Test
    public void clickFaqTest() {
        mainPage
                .open()
                .clickFaqLink();

        Assert.assertEquals("Заголовок страницы FAQ отличается",
                "Отвечаем на ваши вопросы",
                faqPage.getTitleText());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
