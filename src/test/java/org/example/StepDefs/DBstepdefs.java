package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.DBpageFC;

public class DBstepdefs {

    public DBpageFC dashboard;

    public DBstepdefs(){
        dashboard = new DBpageFC();
    }

    @And("User clicks on the checkin")
    public void userClicksOnTheCheckin() throws InterruptedException {
        dashboard.setClickCheckin();
        Thread.sleep(3000);
    }

    @Then("User pick the date and time")
    public void userPickTheDateAndTime() throws InterruptedException {
        dashboard.setPickDate();
        Thread.sleep(3000);
    }

    @Then("Click on recruitment from side menu")
    public void clickOnRecruitmentFromSideMenu() throws InterruptedException {
        dashboard.setClickRecr();
    }

    @And("Enter Details for the vacancy")
    public void enterDetailsForTheVacancy() {
        dashboard.enterdetailsemp();
    }

    @And("Select dropdown value")
    public void selectDropdownValue() {
        dashboard.setClickDrop();
        dashboard.closedriver();
    }

    @And("Enter email for vacancy")
    public void enterEmailForVacancy() {
        dashboard.setEnterEmailVac();
    }

    @Then("Upload the file into the app")
    public void uploadTheFileIntoTheApp() throws InterruptedException {
        dashboard.setClickUploadFile();

    }
}
