package TechoilDay1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Techoil1 {

	public static void main(String[] args) throws Exception 
	{
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Get the URL
		
 driver.get("http://qc.techoil.com:2050");
 Thread.sleep(3000);
 
		//Enter the Username
 driver.findElementById("cred_userid_inputtext").sendKeys("ramasubramanian.ka@inatech.com");
 //Enter the password
 driver.findElementById("cred_password_inputtext").sendKeys("Kaushik123$5");
 // Click Login
 driver.findElementById("cred_password_inputtext").submit();
		//Display Name
 String username = driver.findElementById("DisplayName").getText();
 System.out.println(username);
 
 //if (username.contains("Ramasubramanian"))
	 //System.out.println("Verified Successfully");
 //else
	 //System.out.println("Failed");
	}

}
