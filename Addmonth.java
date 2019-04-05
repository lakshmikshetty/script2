package appointment_tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Addmonth {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./qwer/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		String BaseUrl = "https://ux.owlinvest.com/#!/login";
		driver.get(BaseUrl);
		
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

				//Calender
				driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-calendar']")).click();
				Thread.sleep(5000);
				
				//Done
				
				driver.findElement(By.xpath("//a[@class='btn btn-sm btn-success pull-right uib-close ng-binding']"))
		        .sendKeys("abc");
			
				Thread.sleep(5000);
				
				
				
				
				
				
				//driver.findElement(By.xpath("//select[@ng-model='meeting.duration']")).click();
				//Thread.sleep(5000);
				
				
				
				
				//driver.findElement(By.xpath("//div[@id='taTextElement7504025324333726']")).click();
				//Thread.sleep(2000);
				
		        //Content
				
				driver.findElement(By.xpath("//div[@id='taTextElement1540436395898250']")).click();
				Thread.sleep(5000);
			
				//Household
				WebElement household = driver.findElement(By.name("typeAheadHouseHold"));
		        household.sendKeys("abc");
		        household.click();

		        
		        
		       // *forward,backward
				//Day
		        driver.findElement(By.xpath("//div[@class='fc-highlight']")).click();
				Thread.sleep(5000);

				//Save
				driver.findElement(By.xpath("//button[@ng-click='addMeetingSubmit()']")).click();
				Thread.sleep(5000);

				
			}

		


	
	
}