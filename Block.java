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

	public class Block {
	public static WebDriver driver;
			 @Test
			 public void Blockstream() throws Exception{

				 
			      
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\H3TJL13.cgi\\Downloads\\chromedriver-win64 (7)\\chromedriver-win64\\chromedriver.exe");
					
					 ChromeOptions options = new ChromeOptions();
					 options.addArguments("--remote-allow-origins=*");
					 ChromeDriver driver = new ChromeDriver(options);
			          driver.manage().window().maximize();
			          driver.get("https://blockstream.info/block/000000000000000000076c036ff5119e5a5a74df77abf64203473364509f7732");
			          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			           //WebElement transanctions= driver.findElement(By.xpath(""));
			           
			          
			          
			          
			          System.out.println("Welcome to BlockStrem");
			          List<WebElement> transactions = driver.findElements(By.xpath("//div[@class='transaction-box']"));

			         int tran_size=transactions.size();
			         System.out.println(tran_size);
			          for (int i = 0; i < tran_size; i++) {
			              WebElement transaction = transactions.get(i);
			              
			              String transaction_hash=transaction.getText();

			              List<WebElement> inputs = transaction.findElements(By.xpath("//div[@class='vin-header-container']"));
			              List<WebElement> outputs = transaction.findElements(By.xpath("//div[@class='vouts']"));

			              
			              if (inputs.size() == 1 && outputs.size() == 2) {
			                  System.out.println("Transaction Hash with 1 input and 2 outputs: " + transaction_hash);
			                  System.out.println("Transaction Hash with 1 input and 2 outputs: ");
			              }
			          }
          driver.quit();
			      }
			          
			          
			          
			          
			         
			         			          
			          
			          
		
			         	
			         	
			         	
			         	
			         	
			         	
			         	
			         	
			         	
			 }
	
	
