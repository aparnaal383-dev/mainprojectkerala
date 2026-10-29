package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Loginpage;

public class Logintest {
	WebDriver driver;
	@BeforeTest

	public void main() {
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void fb()
	{
		Loginpage ob=new Loginpage(driver);
		ob.start("abc@gmail.com","1234");
		ob.login();
	}
}
