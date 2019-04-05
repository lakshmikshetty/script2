package appointment_tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Editmonth {
	
	    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./qwer/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		String BaseUrl = "https://ux.owlinvest.com/#!/login";
		driver.get(BaseUrl);
		
		
		//login
		driver.findElement(By.xpath("//input[@id='username-email']")).sendKeys("forumuser2@forumfin.onmicrosoft.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
         
		
		//Appointment
		driver.findElement(By.xpath("//a[@ng-click='addTemplate(7)']")).click();
		Thread.sleep(5000);

	 
		//Month click
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div[2]/button[3]")).click();
		Thread.sleep(5000);

	     
		//Month calender click
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div[3]/div[2]/div/table/tbody/tr/td/div/div/div[1]/div[2]/table/tbody/tr[1]/td[7]")).click();
		Thread.sleep(5000);

	
		        //Subject
				driver.findElement(By.xpath("//input[@id='meetingSubject']")).sendKeys("Festival");
				Thread.sleep(5000);
				
				//Location
				driver.findElement(By.xpath("//input[@placeholder='Location']")).sendKeys("Bangalore");
				Thread.sleep(5000);

				//Sart date
				WebElement date = driver.findElement(By.xpath("//input[@placeholder='Start Date']"));
			    date.clear();
			    date.sendKeys("04/09/2019");
			    
				
			  //Edit content
			    WebElement cont = driver.findElement(By.xpath("//div[@contenteditable='true']")); 	
			    cont.clear();
			    cont.sendKeys("Bangalore festival");
			    
			    
			    //Save button
			    WebElement save = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/button[2]"));
			    //back.click();
			
			    
			    driver.close();
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
				
			}
				
		
				
			}

		


	
	

	
	
	
	
	
	
	


