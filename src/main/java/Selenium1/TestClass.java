package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

	
	@Test
	public void login() {

		System.setProperty("webdriver.chrome.driver", "E:/Java program/Demoproj/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://ibpodev.home.tatamotors/KAM/");
		driver.manage().window().maximize();
		GooglePage page = new GooglePage(driver);
		boolean s=page.ValidImg();
		System.out.println(s);
		int imgsize = page.sizeofimg();
		System.out.println("total img on page are "+imgsize);
		String title = page.validatetitle();
		System.out.println(title);
		page.Loginfun("testing_user2", "admin");
		int count = page.sizeoftable();
		System.out.println(count);
		int lcount = page.sizeoflink();
		System.out.println(lcount);

	}
}