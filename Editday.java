package appointment_tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Editday {


	
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
		
		//day click
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div[2]/button[1]")).click();
		Thread.sleep(5000);
		
        //day calender event click
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div[3]/div[2]/div/table/tbody/tr/td/div[2]/div/div[3]/table/tbody/tr/td[2]/div/div[2]/a/div[1]/div[2]")).click();
		Thread.sleep(5000);
		
		
		//Edit Subject
		WebElement sub = driver.findElement(By.xpath("//input[@id='meetingSubject']"));
	    sub.clear();
	    sub.sendKeys("Festival");
	    
	    //Edit Location
	    WebElement loc = driver.findElement(By.xpath("//input[@placeholder='Location']"));
	    loc.clear();
	    loc.sendKeys("Bangalore");
	    
	    
	    //Edit start date
	    WebElement date = driver.findElement(By.xpath("//input[@placeholder='Start Date']"));
	    date.clear();
	    date.sendKeys("04/07/2019");
	    
	  
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
		
		