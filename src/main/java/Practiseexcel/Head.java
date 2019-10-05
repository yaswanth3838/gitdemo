package Practiseexcel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Head {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/users/yaswanth/Downloads/chromedriver_win32/chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Opens the Google page
		js.executeScript("window.location='https://google.com';");
		// get the title of the page
		System.out.println("Page title is - " + driver.getTitle());
		// get the title of the url
		System.out.println("Current Url : "+ driver.getCurrentUrl());
		// find the element
		driver.findElement(By.name("q")).getSize();
		// close the browser
		driver.close();

	}

}
