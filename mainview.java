package appointment_tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class mainview {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./qwer/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        
        //login
        String BaseUrl = "https://ux.owlinvest.com/#!/login";
		driver.get(BaseUrl);
		Thread.sleep(5000);
		
		//email
		driver.findElement(By.xpath("//input[@id='username-email']")).sendKeys("forumuser2@forumfin.onmicrosoft.com");
		Thread.sleep(5000);
		
		//password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin1234");
		Thread.sleep(5000);
		
		//submit
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
 
		
		//Appointment page
		driver.findElement(By.xpath("//a[@href='#!/appointments']")).click();
		Thread.sleep(6000);
		
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div[3]/div[2]/div/table/tbody/tr/td/div/div/div[1]/div[2]/table/tbody/tr[1]/td[7]")).click();
		//Thread.sleep(5000);
		
		
		//Backward Arrow
		//driver.findElement(By.xpath("//span[@class='fc-icon fc-icon-left-single-arrow']")).click();
		//Thread.sleep(5000);
		
		//Forward Arrow
		
		//driver.findElement(By.xpath("//span[@class='fc-icon fc-icon-right-single-arrow']']")).click();
		//Thread.sleep(2000);

		//Day
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div[2]/button[1]")).click();
		//Thread.sleep(7000);
		
		//Week
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div[2]/button[2]")).click();
		//Thread.sleep(6000);
		
		
		//Month
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div[2]/button[3]")).click();
		//Thread.sleep(6000);
		
		
		
		//EventHolder
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div[3]/div[2]/div/table/tbody/tr/td/div/div/div[1]/div[2]/table/tbody/tr[1]/td[7]")).click();
		//Thread.sleep(5000);

        WebElement toolTipElement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div[3]/div[2]/div/table/tbody/tr/td/div/div/div[1]/div[2]/table/tbody/tr[8]/td[2]/a/div/span[1]"));							
        String actualTooltip = toolTipElement.getText();			
        Thread.sleep(2000);
        System.out.println("Actual Title of Tool Tip  "+actualTooltip);							
        Object expectedTooltip = null;
		if(actualTooltip.equals(expectedTooltip)) {							
            System.out.println("Test Case Passed");					
        }		
      //  driver.close();			
   }		
}		

	
	