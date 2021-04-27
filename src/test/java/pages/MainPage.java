package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private WebDriver driver;
    private final String BASE_URL = "https://otus.ru/";
    private Logger logger;

    @FindBy(css = "a.header2_subheader-link[title='Контакты']")
    private WebElement contactsLink;

    @FindBy(css = "a.header2_subheader-link[title='Отзывы']")
    private WebElement reviewsLink;

    @FindBy(css = "a.header2_subheader-link[title='FAQ']")
    private WebElement faqLink;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        logger = LogManager.getLogger(MainPage.class);
    }

    public MainPage open() {
        driver.get(BASE_URL);
        logger.info("Открыта главная страница otus.ru");

        return this;
    }

    public MainPage clickContactsLink() {
        contactsLink.click();
        logger.info("Клик на меню 'Контакты'");

        return this;
    }

    public MainPage clickReviewsLink() {
        reviewsLink.click();
        logger.info("Клик на меню 'Отзывы'");

        return this;
    }

    public MainPage clickFaqLink() {
        faqLink.click();
        logger.info("Клик на меню 'FAQ'");

        return this;
    }
}
