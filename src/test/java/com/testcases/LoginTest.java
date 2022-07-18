package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Selenium1.GooglePage;

public class LoginTest {
	@Test	
	public void loginkam() {
	System.out.println("SUM");
	int a=10;
	int b=20;
	Assert.assertEquals(30, a+b);
}
}