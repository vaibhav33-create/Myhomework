package Selenium1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchrome {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Properties p = new Properties();
		FileInputStream fs = new FileInputStream("E:/Java program/MyHomework/src/main/java/Selenium1/property");
		try {
			p.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver", "E:/Java program/Demoproj/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		driver.navigate().to(p.getProperty("KAM_url"));
		System.out.println(driver.getCurrentUrl());

		List<WebElement> rows = driver.findElements(By.xpath(p.getProperty("rows")));
		int rcount = rows.size();
		System.out.println("Before searching " + rcount);

		// driver.findElement(By.xpath("//*[@type='search']")).sendKeys("London");

		List<WebElement> cols = driver.findElements(By.xpath(p.getProperty("column")));

		int ccount = cols.size();

		System.out.println(ccount);

		/*
		 * String first_part = "//*[@id='example']/tbody/tr["; String second_part =
		 * "]/td["; String third_part = "]";
		 */
		String first_part = "//table[@id='example']/tbody/tr[";
		String second_part = "]/td[";
		String third_part = "]";

		for (int i = 1; i < rcount; i++) {
			for (int j = 1; j <= ccount; j++) {
				String final_xpath = first_part + i + second_part + j + third_part;
				String table_data = driver.findElement(By.xpath(final_xpath)).getText();
				System.out.print(table_data + " ");

			}
			System.out.println("");

		}

	}

}
