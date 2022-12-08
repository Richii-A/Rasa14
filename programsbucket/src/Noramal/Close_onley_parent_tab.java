package Noramal;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Close_onley_parent_tab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
		String pid = driver.getWindowHandle();
       Set<String> allwh = driver.getWindowHandles();
       for(String wh:allwh)
       {
    	   driver.switchTo().window(wh);
    	   String t = driver.getTitle();
    	   System.out.println(t);
    	   if (wh.equals(pid)) 
    	   {
    		   driver.close();
	} 

	}}}


