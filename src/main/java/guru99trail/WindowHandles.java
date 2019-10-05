package guru99trail;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:/Users/yaswanth/Downloads/geckodriver-v0.24.0-win64 (1)/GeckoDriver.exe" );
		WebDriver Murali = new FirefoxDriver();
		Murali.get("http://demo.guru99.com/popup.php");
		Murali.findElement(By.linkText("Click Here")).click();
		Thread.sleep(5000);
		
		String MainWindow = Murali.getWindowHandle();
		
		Set<String> s1= Murali.getWindowHandles();
		Iterator<String> i1= s1.iterator();
		
		while(i1.hasNext()); {
			String ChildWindow = i1.next();
			
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				Murali.switchTo().window(ChildWindow);
				Thread.sleep(5000);
				//String CPageTitle = Murali.getTitle();
				//System.out.println("Child Window Handle: " +CPageTitle);
				Murali.findElement(By.xpath("//input[@name='emailid']")).sendKeys("kdlfdj");
				Murali.findElement(By.xpath("//input[@type='submit']")).click();
				Murali.close();
			}
		}
		
		Murali.switchTo().window(MainWindow);
		

	}
	

}
