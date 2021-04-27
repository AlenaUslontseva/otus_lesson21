package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaqPage {
    @FindBy(css = "h1[class^='faq-header__text']")
    private WebElement pageTitle;
    private WebDriver driver;

    public FaqPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getTitleText() {
        return pageTitle.getText().replaceAll("\n", " ");
    }
}
