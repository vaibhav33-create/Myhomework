package Selenium1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
WebDriver driver;

	//@FindBy(name = "username")
	//WebElement searchBox;

	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//*[text()='Login']")
	WebElement login;
	
	@FindBy(xpath = "//*[@src='https://ibpodev.home.tatamotors/KAM/assets/images/login/205_51_Px_Welcome_Kam_Logo.png']")
	WebElement Img;
	
	@FindBy(xpath = "//table[@id='tablesorter1']/tbody/tr")    
    List<WebElement> allElements;
	
	@FindBy(tagName = "a")
	List<WebElement> alllink;
	
	@FindBy(tagName = "img")
	List<WebElement> allimg;
	
	public GooglePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public int sizeoflink() {
		return alllink.size();
	}
	
	public int sizeofimg(){
		return allimg.size();
	}
	
	public int sizeoftable() {
		return allElements.size();
	}
	public boolean ValidImg() {
		return Img.isDisplayed();
	}
	
	public String validatetitle() {
		return driver.getCurrentUrl();
		
	}
	public void  Loginfun(String un, String pass) {
		username.sendKeys(un);
		password.sendKeys(pass);
		login.click();
		
		
		
	}

	
}
