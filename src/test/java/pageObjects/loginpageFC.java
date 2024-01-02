package pageObjects;

import Utility.BrowserDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class loginpageFC extends BrowserDriver {


    public static String USER_NAME = "(//input[@placeholder='Username'])[1]";
    public static String USER_PASSWORD = "(//input[@placeholder='Password'])[1]";

    public static String CLICK_LOGIN = "//button[normalize-space()='Login']";
    public static String CHECK_DASHBOARD = "//h6[contains(.,'Dashboard')]";

    public void enteruser() {
        driver.findElement(By.xpath(USER_NAME)).sendKeys("Admin");

    }

    public void enterpass() {
        driver.findElement(By.xpath(USER_PASSWORD)).sendKeys("admin123");
    }
    public void clicklogin(){
        driver.findElement(By.xpath(CLICK_LOGIN)).click();
    }
    public void setCheckDashboard(){
        String chkDB = driver.findElement(By.xpath(CHECK_DASHBOARD)).getText();
        Assert.assertEquals(chkDB,"Dashboard");
        System.out.println(chkDB);
//        if(chkDB==true){
//            System.out.println("Dash board is opened");
//        }else {
//            System.out.println("Dash board is not opened");
//        }
    }
}
