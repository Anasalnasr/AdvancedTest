package Parameters;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameters {
	static WebDriver driver = new ChromeDriver();

	Random rand = new Random ();
	int RandomEmail=rand.nextInt(999);
	
 
	 static String LogInPage="https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/";
	 static String myURL ="https://magento.softwaretestingboard.com/";
	 static String SignUpPage="https://magento.softwaretestingboard.com/customer/account/create/";
	 static String LogoutPage="https://magento.softwaretestingboard.com/customer/account/logout/";
	 static String loggedInSucsess="https://magento.softwaretestingboard.com/customer/account/";
	static String[] FirstNameArray = { "John", "Putin", "Samira", "Joana"};
	static String[] LastNameArray = { "Alnaser", "Albaba", "Ayash", "Abuzaid"};
	
	int randomIndex = rand.nextInt(3);
	
	String firstName = FirstNameArray[randomIndex];
	String lastNames = LastNameArray[randomIndex];
	String EmailIndex = firstName+lastNames+RandomEmail+"@gmail.com";
	String PasswordAA = "ADCadc123!";
	String WelcomingMassege = "Welcome";
}