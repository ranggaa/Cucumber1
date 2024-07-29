package stepDefination;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SupplierTest {
	public static WebDriver driver;

@Given("launch Browser")
public void launch_Browser() throws Throwable {
    driver = FunctionLibrary.startBrowser();
}

@When("launch url {string}")
public void launch_url(String url) {
    FunctionLibrary.openUrl();
}

@When("Wait for user name with {string} and {string}")
public void wait_for_user_name_with_and(String LocatorType, String LocatorValue) {
   FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}

@When("Enter username with {string} and {string} and {string}")
public void enter_username_with_and_and(String LocatorType, String LocatorValue, String TestData) {
    FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
}

@When("Enter password with {string} and {string} and {string}")
public void enter_password_with_and_and(String LocatorType, String LocatorValue, String TestData) {
    FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
}

@When("Click login button with {string} and {string}")
public void click_login_button_with_and(String LocatorType, String LocatorValue) {
    FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@When("Wait for supplier link with {string} and {string}")
public void wait_for_supplier_link_with_and(String LocatorType, String LocatorValue) {
   FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}

@When("Click on Supplier link with {string} and {string}")
public void click_on_Supplier_link_with_and(String LocatorType, String LocatorValue) {
    FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@When("Wait for AddiCon button with {string} and {string}")
public void wait_for_AddiCon_button_with_and(String LocatorType, String LocatorValue) {
    FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}

@When("click on Addicon button with {string} and {string}")
public void click_on_Addicon_button_with_and(String LocatorType, String LocatorValue) {
    FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@When("wait for Supplier Number with {string} and {string}")
public void wait_for_Supplier_Number_with_and(String LocatorType, String LocatorValue) {
   FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}

@When("Capture supplier number with {string} and {string}")
public void capture_supplier_number_with_and(String LocatorType, String LocatorValue) throws Throwable {
   FunctionLibrary.captureSupplier(LocatorType, LocatorValue); 
}

@When("Enter in {string} with {string} and {string}")
public void enter_in_with_and(String TestData, String LocatorType, String LocatorValue) {
    FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
}

@When("click add button with {string} and {string}")
public void click_add_button_with_and(String LocatorType, String LocatorValue) {
    FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@When("Wait confirm ok button with {string} and {string}")
public void wait_confirm_ok_button_with_and(String LocatorType, String LocatorValue) {
   FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}

@When("click Confirm ok button with {string} and {string}")
public void click_Confirm_ok_button_with_and(String LocatorType, String LocatorValue) {
	FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@When("Wait for Alert ok button with {string} and {string}")
public void wait_for_Alert_ok_button_with_and(String LocatorType, String LocatorValue) {
	FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}

@When("Click Alert ok button with {string} and {string}")
public void click_Alert_ok_button_with_and(String LocatorType, String LocatorValue) {
	FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@Then("verify supplier table")
public void verify_supplier_table() throws Throwable {
    FunctionLibrary.supplierTable();
}

@When("close browser")
public void close_browser() {
    FunctionLibrary.closeBrowser();
}
@When("Wait for customer link with {string} and {string}")
public void wait_for_customer_link_with_and(String LocatorType, String LocatorValue) {
    FunctionLibrary.waitForElement(LocatorType,LocatorValue,"10");
}

@When("Click on customer link with {string} and {string}")
public void click_on_customer_link_with_and(String LocatorType, String LocatorValue) {
   FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@When("wait for customer Number with {string} and {string}")
public void wait_for_customer_Number_with_and(String LocatorType, String LocatorValue) {
    FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}
@When("Capture customer number with {string} and {string}")
public void capture_customer_number_with_and(String LocatorType, String LocatorValue) throws Throwable {
   FunctionLibrary.captuerCustomer(LocatorType, LocatorValue);
}
@Then("verify customer table")
public void verify_customer_table() throws Throwable {
   FunctionLibrary.customerTable(); 
}

}
