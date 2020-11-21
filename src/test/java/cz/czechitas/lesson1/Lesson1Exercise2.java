package cz.czechitas.lesson1;

import cz.czechitas.Settings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/*
Cvičení 2:
 - Nastartuje prohlížeč
 - Maximalizovaný na celou obrazovku
 - V Inkognito módu
 - Nastavte cestu pro stahování souborů

 */
public class Lesson1Exercise2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty(Settings.DRIVER, Settings.DRIVER_PATH);

        FirefoxOptions options = new FirefoxOptions()
                .addArguments("-private")
                .addPreference("browser.download.dir", Settings.PATH)
                .addPreference("browser.download.folderList", 2);

        WebDriver driver = new FirefoxDriver(options);

        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.quit();
    }

}