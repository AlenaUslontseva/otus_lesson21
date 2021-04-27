package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverInit {
    public static WebDriver init() {
        URL url;

        try {
            url = new URL("http://localhost:4444/wd/hub/");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("browserVersion", "89.0");
        capabilities.setCapability("enableVNC", true);

        return new RemoteWebDriver(url, capabilities);
    }
}
