package qapratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	LoginPage(WebDriver d){
		driver = d;
	}
	
	By Loginbtn = By.xpath("(//*[text()='Login'])[1]");
	By username = By.xpath("//*[@name='uname']");
	By password = By.xpath("//*[@name='psw']");
	By Login = By.xpath("//button[@type='submit']");
	
	
	public void clickloginbtn() {
		driver.findElement(Loginbtn).click();
	}
	
	public void Enterusername(String usern) {
		driver.findElement(username).sendKeys(usern);
	}
	
	public void Enterpassword(String pass) {
		driver.findElement(password).sendKeys(pass);;
	}
	
	public void clicklogin() {
		driver.findElement(Login).click();
	}
	
	
	
	
	
	
	
	
}
