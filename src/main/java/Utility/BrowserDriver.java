package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserDriver {
    public static WebDriver driver;
    public static PropertyReader prop;

    public void weburlvisit(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }

    public void closedriver(){

        driver.quit();
    }

//    public void ReadConfigFile(){
//        prop = new properties();
//    }


//    public void SetDriver(){
////        this.driver = driver;
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
////        this.driver = new ChromeDriver();
//        driver = new ChromeDriver();
////        System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
//        driver.get("https://www.saucedemo.com/");
//    }


}