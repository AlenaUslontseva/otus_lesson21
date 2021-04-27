package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.ContactPage;
import pages.MainPage;
import utils.WebDriverInit;

public class ContactPageTest {
    private WebDriver driver;
    private MainPage mainPage;
    private ContactPage contactPage;

    @Before
    public void setUp() {
        driver = WebDriverInit.init();
        mainPage = new MainPage(driver);
        contactPage = new ContactPage(driver);
    }

    @Test
    public void clickContactsTest() {
        mainPage
                .open()
                .clickContactsLink();

        Assert.assertEquals("Заголовок страницы Контакты отличается",
                "Контакты",
                contactPage.getTitleText());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

