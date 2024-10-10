package Step_Definition;

import Base.BaseClass;
import Pom.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;

public class MyStepdefs extends BaseClass {

    Login_Page loginPage;
    Search_Hotel searchHotel;
    Select_Hotel selectHotel;
    Book_Hotel bookHotel;
    Confirmation_Class confirmationClass;

    @Given("Launch {string} and enter the url as {string}")
    public void launchAndEnterTheUrlAs(String brows,String link) {
        BaseClass.launchBrowser(brows);
        BaseClass.maximizeWindow();
        BaseClass.launchURL(link);
        BaseClass.implicitWait();
        loginPage = new Login_Page(driver);
        searchHotel = new Search_Hotel(driver);
        selectHotel = new Select_Hotel(driver);
        bookHotel = new Book_Hotel(driver);
        confirmationClass = new Confirmation_Class(driver);
    }

    @When("User login website by enters username as {string} and password as {string}")
    public void userLoginWebsiteByEntersUsernameAsAndPasswordAs(String username, String password) {
        loginPage.enterCredentials(username, password);
        loginPage.clickLoginBtn();}

    @Then("User views the search hotel page and verifies the URL contains {string} text")
    public void userViewsTheSearchHotelPageAndVerifiesTheURLContainsText(String text) {
    Assert.assertTrue(verifyURL(text));}

    @When("User selects the location as New York")
    public void userSelectsTheLocationAsNewYork() {searchHotel.selLocation();}

    @And("User selects the Hotel as Hotel Cornice")
    public void userSelectsTheHotelAsHotelCornice() {searchHotel.selHotel();}

    @And("User selcts the room type as Super Deluxe")
    public void userSelctsTheRoomTypeAsSuperDeluxe() {searchHotel.selRoomType();}

    @And("User select the One room")
    public void userSelectTheOneRoom() {searchHotel.selNoOfRooms();}

    @And("User enter check in date {string}")
    public void userEnterCheckInDate(String inDate) {searchHotel.selCheckInDate(inDate);}

    @And("User enter check out date {string}")
    public void userEnterCheckOutDate(String outDate) {searchHotel.selCheckOutDate(outDate);}

    @And("User selects two adult")
    public void userSelectsTwoAdult() {searchHotel.selAdultRoom();}

    @And("User selects two children")
    public void userSelectsTwoChildren() {
        searchHotel.selChildRoom();
    }

    @And("User clicks on search button")
    public void userClicksOnSearchButton() {
        searchHotel.clickSearchBtn();
    }

    @Then("User navigate to select hotel page and verifies the URL contains {string} text")
    public void userNavigateToSelectHotelPageAndVerifiesTheURLContainsText(String text1) {
        Assert.assertTrue(verifyURL(text1));}

    @When("User select the radio button")
    public void userSelectTheRadioButton() {selectHotel.clickRadBtn();}

    @When("User clicks on continue button")
    public void userClicksOnContinueButton() {
        selectHotel.clickContinueBtn();
    }

    @Then("User navigate to Book A Hotel page and verifies the URL contains {string} text")
        public void userLandsOnBookHotelPageAndVerifiesTheURLContainsText(String text2) {
            Assert.assertTrue(verifyURL(text2));}

    @And("User enters first name as {string}")
    public void userEntersFirstNameAs(String fName) {
        bookHotel.addFirstName(fName);
    }

    @And("User enters last name as {string}")
    public void userEntersLastNameAs(String lName) {bookHotel.addLastName(lName);}

    @And("User enters billing address as {string}")
    public void userEntersBillingAddressAs(String address) {
        bookHotel.addAddress(address);
    }

    @And("User enters credit card number {string}")
    public void userEntersCreditCardNumber(String cNumber) {
        bookHotel.addCardNumber(cNumber);
    }

    @And("User selects Other as Credit Card Type")
    public void userSelectsOtherAsCreditCardType() {bookHotel.selCardType();}

    @And("User selects month and year in expiry date")
    public void userSelectsMonthAndYearInExpiryDate() {
        bookHotel.selExpMonth();
        bookHotel.selExpYear();}

    @And("User enters CVV number {string}")
    public void userEntersCVVNumber(String cvv) {
        bookHotel.selCVV(cvv);
    }

    @And("User click on Book Now button")
    public void userClickOnBookNowButton() {bookHotel.clickBookBtn();}

    @Given("User takes screenshot of the booking confirmation page")
    public void userTakesScreenshotOfTheBookingConfirmationPage() throws IOException,InterruptedException{
        confirmationClass.screenShot();}

    @Then("User quit the browser")
    public void userQuitTheBrowser() {quitBrowser();

    }
}
