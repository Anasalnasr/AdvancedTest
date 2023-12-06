package Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assigment2 extends Parameters {
	SoftAssert myAssertion = new SoftAssert();

	@BeforeTest
	public void Setup() {
		driver.get(myURL);

	}

	@Test(priority = 1)
	public void Contact() throws InterruptedException {
		driver.get(SignUpPage);
		WebElement FirstName = driver.findElement(By.id("firstname"));
		WebElement LastName = driver.findElement(By.id("lastname"));
		WebElement Email = driver.findElement(By.id("email_address"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement confirmPassword = driver.findElement(By.id("password-confirmation"));
		WebElement LoginButtin = driver.findElement(By.className("primary"));

		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastNames);
		Email.sendKeys(EmailIndex);
		Password.sendKeys(PasswordAA);
		confirmPassword.sendKeys(PasswordAA);
		LoginButtin.click();
		Thread.sleep(3000);
		//String welcomeMsg = driver.findElement(By.xpath("div[class='panel header'] span[class='logged-in']")).getText();
	//	myAssertion.assertEquals(welcomeMsg.contains("Welcome"), true);
	}

	@Test(priority = 2)
	public void LogoutTest() throws InterruptedException {

		driver.get(LogoutPage);
		Thread.sleep(2500);
	}

	@Test(priority = 3)
	public void LoginTest() {

		driver.get(LogInPage);
		WebElement emailInput = driver.findElement(By.id("email"));
		WebElement passInput = driver.findElement(By.id("pass"));
		WebElement loginbut = driver.findElement(By.id("send2"));

		emailInput.sendKeys(EmailIndex);
		passInput.sendKeys(PasswordAA);
		loginbut.click();

		myAssertion.assertEquals(driver.getCurrentUrl(), loggedInSucsess, "URL Not Match");

	}

	@AfterTest
	public void AfterTest() {

	}
}