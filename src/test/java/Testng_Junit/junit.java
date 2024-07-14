package Testng_Junit;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class junit {
WebDriver driver;
	
	@Before
	public void bt() {
		
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().window().maximize();
		 
	}
	
	@Test
	public void checkbox() {
		
		 WebElement chk = driver.findElement(By.id("checkBoxOption1"));
		 chk.click();
	}
		 
	@Test
	public void radioo() { 
		WebElement radio = driver.findElement(By.xpath("//input[@value=\"radio3\"]"));
		radio.click();
	
		}
	@Test
	public void test1() {
		 //clicking all the chekboxes
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for(WebElement i:checkbox) {
			i.click();

	  }
	}
	
	@Test
	public void test2() {
		
	 //clicking all the radiobuttons
		List<WebElement> radiobutton= driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		for(WebElement i:radiobutton) {
			i.click();
		}

}
}
