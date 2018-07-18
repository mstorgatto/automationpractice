package task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import appObjects.NewShopAppObject;

public class NewShopTask {
	
	private NewShopAppObject NewShopAppObject;
	public NewShopTask (WebDriver driver) {
		this.NewShopAppObject = new NewShopAppObject(driver);
	}
	public void NewDress() {
		this.NewShopAppObject.getDressButton().click();
	}
	public void AddDressToCart() {
		this.NewShopAppObject.getAddDressToCartButton().click();
	}
	public void ProceedToCheckout1() {
		this.NewShopAppObject.getProceedToCheckoutButton1().click();
	}
	public void ProceedToCheckout2() {
		this.NewShopAppObject.getProceedToCheckoutButton2().click();
	}
	public void EmailAddress (String email) {
		this.NewShopAppObject.getEmailAddressTextField().sendKeys(email);
	}
	public void CreateAnAccount() {
		this.NewShopAppObject.getCreateAnAccountButton().click();
	}
	public void Gender() {
		this.NewShopAppObject.getMrsButton().click();
	}
	public void Name (String firstName, String lastName) {
		this.NewShopAppObject.getFirstNameTextField().sendKeys(firstName);
		this.NewShopAppObject.getLastNameTextField().sendKeys(lastName);
	}
	public void BirthDay (String day, String month, String year) {
		new Select(this.NewShopAppObject.getdropdownDay()).selectByVisibleText(day);
		new Select(this.NewShopAppObject.getdropdownMonth()).selectByVisibleText(month);
		new Select(this.NewShopAppObject.getdropdownYear()).selectByVisibleText(year);
	}
	public void Address (String firstNameAddress, String lastNameAddress, String adress, String city) {
		this.NewShopAppObject.getFirstNameAddressTextField().sendKeys(firstNameAddress);
		this.NewShopAppObject.getLastNameAddressTextField().sendKeys(lastNameAddress);
		this.NewShopAppObject.getAddressTextField().sendKeys(adress);
		this.NewShopAppObject.getCityTextField().sendKeys(city);
	}
	public void State (String state) {
		new Select(this.NewShopAppObject.getdropdownState()).selectByVisibleText(state);
	}
	public void Zip (String zip) {
		this.NewShopAppObject.getZipTextField().sendKeys(zip);
	}
	public void Phone (String phone) {
		this.NewShopAppObject.getMobilePhoneTextField().sendKeys(phone);
	}
	public void AddresAlias (String addressAlias) {
		this.NewShopAppObject.getAddressAliasTextField().sendKeys(addressAlias);
	}
	public void SubmitAccount () {
		this.NewShopAppObject.getSubmitAccountButton().click();
	}
	public void ProceedToCheckout3 () {
		this.NewShopAppObject.getProceedToCheckoutButton3().click();
	}
	public void AgreeToTheTerms () {
		this.NewShopAppObject.getAgreeToTheTermsButton().click();
	}
	public void ProceedToCheckout4 () {
		this.NewShopAppObject.getProceedToCheckoutButton4().click();
	}
	public void PayByBankwire () {
		this.NewShopAppObject.getPayByBankwireButton().click();
	}
	public void ConfirmOrder () {
		this.NewShopAppObject.getConfirmOrderButton().click();
	}
}