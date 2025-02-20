package cucumberProjectsExample.utilities;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver(){}
    private static WebDriver driver;
    public static WebDriver getDriver(){

        if (driver == null){
            String browserType = ConfigurationReader.getProperty("browser");
            switch (browserType){

                case "chrome":
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
                    chromeOptions.setPageLoadTimeout(Duration.ofSeconds(14));
                    break;

                case "safari" :
                    driver=new SafariDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    break;

                default:
                    System.out.println("Unknown browser type: "+browserType);
                    driver=null;

            }
        }

        return driver;

    }

    public static void closeDriver(){
        if (driver != null){
            driver.quit(); // this line will terminate the existing session. Value will not even be null
            driver = null;
        }
    }
}