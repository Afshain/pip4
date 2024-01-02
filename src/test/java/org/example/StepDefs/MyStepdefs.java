package org.example.StepDefs;
import Utility.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.loginpageFC;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import static Utility.BrowserDriver.driver;
import static Utility.BrowserDriver.prop;

public class MyStepdefs {
   public loginpageFC loginfactory;
   public PropertyReader prop;



    public PropertyReader propread = new PropertyReader();
    public MyStepdefs() {
        loginfactory = new loginpageFC();

    }


    @Given("user on login page")
    public void userOnLoginPage() throws Exception {
      loginfactory.weburlvisit();
      String url = new ReadConfig();
      driver.get(url);

//      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.get(new PropertyReader().getPropertyFile().getProperty("url1"));
    }

    @When("user enter the email and password")
    public void userEnterTheEmailAndPassword() throws InterruptedException {
        Thread.sleep(6000);
        loginfactory.enteruser();
        loginfactory.enterpass();
    }

    @And("user clicks on the login button")
    public void userClicksOnTheLoginButton() throws InterruptedException {
        loginfactory.clicklogin();
        Thread.sleep(3000);
    }

    @Then("Check user is loggedin and Dashboard icon is visible")
    public void checkUserIsLoggedinAndDashboardIconIsVisible() {
        loginfactory.setCheckDashboard();
    }
}
