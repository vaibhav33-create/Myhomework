package qapratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTest {

	
//	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/home/vaibhavbansude/eclipse-workspace/MEprojt/driver/chromedriver");
	
		//options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		
		
		LoginPage loginpg = new LoginPage(driver);
		Loginpage2 loginpge = new Loginpage2(driver);
		
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		//driver.switchTo().frame("iframeResult");
		
		
		//loginpge.Loginbtn();
		loginpge.FirstName("vaibhav");
		loginpge.LastName("bansude");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> ch = driver.findElements(By.xpath("//*[@type='checkbox']"));
		
		for(int i=ch.size()-2;i<ch.size();i++) {
			
				ch.get(i).click();
			
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@role='combobox']")).click();
		Thread.sleep(3000);
		List<WebElement> cn = driver.findElements(By.xpath("//*[@role='treeitem']"));
		
		
		for(int i=0;i<cn.size();i++) {
		
			cn.get(i+2).click();
		
		}
		
		
		
		
		
		
		
	//	loginpge.drpskill("Client Server");
		
		
		
	/*	driver.findElement(By.id("msdd")).click();
		Thread.sleep(3000);
		
		List<WebElement> ln = driver.findElements(By.xpath("//*[@class='ui-corner-all']"));
		
		for(int i=0;i<ln.size();i++) {
			String ss = ln.get(i).getAttribute("text");
			if(ss.equals("English")) {
				ln.get(i).click();
			}
		} */
		
		
		
		
		
		
		
	}

}
