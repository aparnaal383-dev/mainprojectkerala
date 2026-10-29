package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import pagepkg.Registerpage;

public class Registertest {
	WebDriver driver;
	@BeforeMethod
	public void main()
	{
		driver=new ChromeDriver();
				driver.get("https://keralaproperty.in/member/register/");
	}
	@Test
	public void fb()
	{
		Registerpage ob=new Registerpage(driver);
		ob.start("ammu", "ammu123@gmail.com", "ammu123", "ammu123", "1123456789");
		ob.register();
	}

}
