package qapratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Loginpage2 {

	WebDriver driver;
	
	
	Loginpage2(WebDriver d){
	//	 driver = d;
		 PageFactory.initElements(d, this);
		
	}
	
	
	@FindBy(xpath="(//*[text()='Login'])[1]")
	WebElement Loginbtn;
	
	@FindBy(xpath="//*[@ng-model='FirstName']")
	WebElement FirstName;
	
	@FindBy(xpath="//*[@ng-model='LastName']")
	WebElement LastName;
	
	@FindBy(xpath="//*[@id='enterbtn']")
	WebElement Login;
	
	@FindBy(id="Skills")
	WebElement skill;
	
	
	
	
	public void drpskill(String text) {
		Select drpskill = new Select(skill);
		drpskill.selectByVisibleText(text);
		
	}
	
	public void Loginbtn() {
		Loginbtn.click();
	}
	
	public void FirstName(String usern) {
		FirstName.sendKeys(usern);
	}
	
	public void LastName(String pass) {
		LastName.sendKeys(pass);;
	}
	
	public void Login() {
		Login.click();
	}
	
	
}
