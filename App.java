package DEmo.demooo;

import static org.testng.Assert.assertEquals;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.ode.events.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

	public class App {
	public static WebDriver driver;
			 @Test
			 public void Blockstream() throws Exception{

				 
			      
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\H3TJL13.cgi\\Downloads\\chromedriver-win64 (7)\\chromedriver-win64\\chromedriver.exe");
					
					 ChromeOptions options = new ChromeOptions();
					 options.addArguments("--remote-allow-origins=*");
					 ChromeDriver driver = new ChromeDriver(options);
			          driver.manage().window().maximize();
			          driver.get("https://blockstream.info/block/000000000000000000076c036ff5119e5a5a74df77abf64203473364509f7732");
			          
			          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			          System.out.println("Welcome to BlockStrem");
			          WebElement heading= driver.findElement(By.xpath("//h3[contains(text(),'25 of 2875 Transactions')]"));
			          String Actual_Trans_Page= heading.getText();
			          
			          String Expected_Trans_Page="25 of 2875 Transactions";
			          
			          try {
			          Assert.assertEquals(Actual_Trans_Page, Expected_Trans_Page, "Both are same");
			          }
			          catch(Exception e) {
			        	  System.out.println(e);
			          }
			          Thread.sleep(7000);
			          driver.quit();
			         			          
			          
			          
		
			         	
			         	
			         	
			         	
			         	
			         	
			         	
			         	
			         	
			 }
	
	
}