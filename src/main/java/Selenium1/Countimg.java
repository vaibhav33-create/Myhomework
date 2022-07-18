package Selenium1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countimg {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/Java program/Demoproj/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://ibpodev.home.tatamotors/KAM/");
		driver.manage().window().maximize();
		
		/*List<WebElement> icount = driver.findElements(By.tagName("img"));
		int imgcount = icount.size();
		System.out.println(imgcount); */
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Size of full link and img----"+linklist.size());
		
		List<WebElement>activelink = new ArrayList<WebElement>();
		for(int i=0;i<linklist.size();i++) {
			System.out.println(linklist.get(i).getAttribute("href"));
			if(linklist.get(i).getAttribute("href")!=null && (!linklist.get(i).getAttribute("href").contains("javascript"))) {
				activelink.add(linklist.get(i));
			}
		}
		
		System.out.println("size of active link and img===="+activelink.size());
		
		for(int j=0;j<activelink.size();j++) {
			
			HttpURLConnection connection =(HttpURLConnection) new URL(activelink.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activelink.get(j).getAttribute("href")+"-----"+response);
		}
	}

}
