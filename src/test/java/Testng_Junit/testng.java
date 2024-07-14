package Testng_Junit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class testng {

	
	WebDriver driver;
	
	
	 @BeforeTest
	 public void bt() {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().window().maximize();	

}
	 @Test()
	 public void Test() {
		 driver.findElement(By.xpath("//input[@value=\"radio3\"]")).click();  		 //clicking on radio button


	 }
	 
	 @Test()
	 public void Test1() {
		 
		 driver.findElement(By.id("checkBoxOption1")).click();		 //clicking on checkbox


	 }
	 
	 
	 @Test
	 public void multcheck() {
		 
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));		//clicking multiple the checkboxes

		for(WebElement i:checkbox) {
			i.click();
		}
	 }
	 @Test
	 public void multradio() {
		List<WebElement> radiobutton= driver.findElements(By.xpath("//input[@type=\"radio\"]"));		 // clicking multiple radio buttons multiple times

		for(WebElement i:radiobutton) {
			i.click();
		}
	 }
}
