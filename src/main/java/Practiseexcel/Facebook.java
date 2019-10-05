package Practiseexcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/users/yaswanth/Downloads/chromedriver_win32/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement day =driver.findElement(By.cssSelector("#day"));
		
		Select sc= new Select(day);
		int sizeof=sc.getOptions().size();
		sc.selectByIndex(sizeof-1);
		
		

	}

}
