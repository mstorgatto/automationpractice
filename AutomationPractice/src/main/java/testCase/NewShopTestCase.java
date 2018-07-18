package testCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;
import framework.Drivers;
import framework.Report;
import framework.ScreenShot;
import task.NewShopTask;
import verificationPoints.NewShopVerificationPoint;

public class NewShopTestCase {
	
	private WebDriver driver;
	
	public NewShopTask homePage;
	private NewShopVerificationPoint verificationPoint;
	
	@Before
	public void setup() {
		Report.startTest("Valid Sell.");
		driver = Drivers.getChromeDriver();
		homePage = new NewShopTask (driver);
		verificationPoint = new NewShopVerificationPoint(driver);
	}
	@Test
	public void testMain() throws InterruptedException {
		this.driver.get("http://automationpractice.com");
		this.driver.manage().window().maximize();
		Thread.sleep(1000);
		Report.log(Status.INFO,"The Website has started.", ScreenShot.capture(driver));
		homePage.NewDress();
		Thread.sleep(1000);
		homePage.AddDressToCart();
		Thread.sleep(1000);
		Report.log(Status.INFO,"Add a dress to cart", ScreenShot.capture(driver));
		homePage.ProceedToCheckout1();
		Thread.sleep(1000);
		homePage.ProceedToCheckout2();
		Thread.sleep(1000);
		homePage.EmailAddress("testemarinastorgatto@outlook.com");
		Report.log(Status.INFO,"Add a new e-mail.", ScreenShot.capture(driver));
		homePage.CreateAnAccount();
		Thread.sleep(1000);
		homePage.Gender();
		homePage.Name("Marina","Storgatto");
		homePage.BirthDay("28","December","1992");
		homePage.Address("Marina","Storgatto","Rua Dona Larissa, 45, Centro","Cidadela");
		homePage.State("Chicago");
		homePage.Zip("54126");
		homePage.Phone("5486512365");
		homePage.AddresAlias("Home");
		Thread.sleep(1000);
		Report.log(Status.INFO,"New registration completed.", ScreenShot.capture(driver));
		homePage.SubmitAccount();
		Thread.sleep(1000);
		Report.log(Status.INFO,"New registration accepted.", ScreenShot.capture(driver));
		homePage.ProceedToCheckout3();
		Thread.sleep(1000);
		homePage.AgreeToTheTerms();
		Report.log(Status.INFO,"Agree to the terms.", ScreenShot.capture(driver));
		homePage.ProceedToCheckout4();
		Thread.sleep(1000);
		homePage.PayByBankwire();
		Thread.sleep(1000);
		Report.log(Status.INFO,"Payment method selected: Pay by Bankwire.", ScreenShot.capture(driver));
		homePage.ConfirmOrder();
		Report.log(Status.INFO,"Confirmed order.", ScreenShot.capture(driver));
	}
	@After
	public void tearDown() {
		driver.quit();
		}
}