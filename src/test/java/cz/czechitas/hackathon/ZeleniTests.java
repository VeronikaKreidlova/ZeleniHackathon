package cz.czechitas.hackathon;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import cz.czechitas.*;

import cz.czechitas.DriverHelper;
import cz.czechitas.Settings;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class ZeleniTests {

    //public static final String PATH = "/home/veronika/Java-Training/Projects/selenium-java-main-lesson4/selenium-java-main/src/test/java/cz/czechitas";
//
//    public static void main(String[] args) throws InterruptedException {
//
//
//        System.setProperty(Settings.DRIVER, Settings.DRIVER_PATH);
//
//        FirefoxOptions options = new FirefoxOptions()
//                .addArguments("-private")
//                .addPreference("browser.download.dir", Settings.PATH)
//                .addPreference("browser.download.folderList", 2);
    private static WebDriver driver;

    @BeforeEach
    public void before() {
        // poběží před každým testem
        driver = DriverHelper.openFirefox();
    }

    @AfterEach
    public void after() {
        // poběží po každém testu

        driver.quit();
    }

    @Test
    @DisplayName("logo should present on the main web page")
    public void testHeaderLogo() {

//        REQ-0020 – Header section
//        Our header section is shared across all pages. It will consist of following:
//        Logo
//        Login feature
//        Cart
//        Menu
//        Header section is displayed at the top of the screen and it is „sticky“,
//        meaning it will stick to the top, when user scrolls the page.


        driver.navigate().to(Settings.baseUrl);
        WebElement headerElement = driver.findElement(By.id("header_logo"));
        String headerElementText = headerElement.getText();

        String actual = headerElementText;
        String expected = "header_logo";
        assertEquals(expected, actual);
    }

}

