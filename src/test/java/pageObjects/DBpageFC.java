package pageObjects;

import Utility.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.openqa.selenium.support.ui.Select;

public class DBpageFC extends BrowserDriver {

    public static String CLICK_CHECKIN = "//i[@class='oxd-icon bi-stopwatch']";
    public static String PICK_DATE = "//div[@class='oxd-date-input']";

    public static String CLICK_RECR = "//a[.='Recruitment']";

    public static String CLICK_ADD_REC = "//button[.=' Add ']";

    public static String ADD_NAME_REC = "//input[@class='oxd-input oxd-input--active orangehrm-firstname']";
    public static String ADD_MNAME_REC = "//input[@class='oxd-input oxd-input--active orangehrm-middlename']";
    public static String ADD_LNAME_REC = "//input[@class='oxd-input oxd-input--active orangehrm-lastname']";
    public static String  CLICK_DROP = "//div[@class='oxd-select-text-input']";
    public static String CLICK_DROP_VALUE = "//span[.='Associate IT Manager']";
    public static String ENTER_EMAIL_VAC = "//div[3]//div[1]//div[1]//div[1]//div[2]//input[1]";
    public static String ENTER_NUM_VAC = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container orangehrm-save-candidate-page']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[2]/div[1]/div[2]/input[1]";
    public static String CLICK_UPLOAD_FILE = "//input[@class='oxd-file-input']";
    //body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container orangehrm-save-candidate-page']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[2]/div[1]/div[2]/input[1]

    public void setClickCheckin() throws InterruptedException {
        driver.findElement(By.xpath(CLICK_CHECKIN)).click();
        Thread.sleep(3000);
    }
    public void setPickDate() throws InterruptedException {
        driver.findElement(By.xpath(PICK_DATE)).click();
        Thread.sleep(3000);
//        while (true) {
//            String month = driver.findElement(By.xpath("//p[.='December']")).getText();
//            String year = driver.findElement(By.xpath("//p[.='2023']")).getText();
//            if (year.equals("2020") || month.equals("July")) {
//                driver.findElement(By.xpath("//div[starts-with(text(),'8')]")).click();
//                break;
//            }
//
//        else {
//                driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div/div[1]/button[1]/i")).click();
//            }
//    }

    }
    public void setClickRecr() throws InterruptedException {
        driver.findElement(By.xpath(CLICK_RECR)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(CLICK_ADD_REC)).click();
        Thread.sleep(3000);
    }

    public void enterdetailsemp(){
        driver.findElement(By.xpath(ADD_NAME_REC)).sendKeys("Afshain");
        driver.findElement(By.xpath(ADD_MNAME_REC)).sendKeys("Ahmed");
        driver.findElement(By.xpath(ADD_LNAME_REC)).sendKeys("Mukhtar");

    }
    public void setClickDrop(){
        driver.findElement(By.xpath(CLICK_DROP)).click();
      driver.findElement(By.xpath(CLICK_DROP_VALUE)).click();
//        Select dropdown = new Select(drop);                WebElement drop =
//                dropdown.selectByVisibleText("Associate IT Manager");

    }

    public void setEnterEmailVac(){
        driver.findElement(By.xpath(ENTER_EMAIL_VAC)).sendKeys("afshain@gmail.com");
        driver.findElement(By.xpath(ENTER_NUM_VAC)).sendKeys("1354656464");
    }

    public void setClickUploadFile() throws InterruptedException {
//        driver.findElement(By.xpath(CLICK_UPLOAD_FILE)).click();
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath(CLICK_UPLOAD_FILE));
        element.sendKeys("C:\\Users\\afshain.mukhtar\\Downloads\\Afshain - TVS 2.docx");

    }


}
